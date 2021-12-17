package com.example.brsg_project;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView battery;
    ImageView battery_ch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar action = getSupportActionBar();   //메인 화면에서는 액션바(타이틀바)를 사용안할거기 때문에
        action.hide();      //액션바 숨김

        ImageView menu1 = (ImageView)findViewById(R.id.menu1);
        ImageView menu2 = (ImageView)findViewById(R.id.menu2);
        battery = (ImageView) findViewById(R.id.battery);   //배터리
        battery_ch = (ImageView) findViewById(R.id.charged1);    //배터리 충전 표시

        //분리수거 버튼을 눌렀을 때
        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //분리수거 화면으로 이동
                Intent intent = new Intent(MainActivity.this, separate_activity.class);
                startActivity(intent);
            }
        });

        //쓰레기 버튼을 눌렀을 때
        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //쓰레기 화면으로 이동
                Intent intent = new Intent(MainActivity.this, trash_activity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(br);
    }

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter iFilter = new IntentFilter();
        iFilter.addAction(Intent.ACTION_BATTERY_CHANGED);
        registerReceiver(br, iFilter);
    }

    BroadcastReceiver br = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();

            if (action.equals(Intent.ACTION_BATTERY_CHANGED)) {
                int remain = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);

                //배터리 잔량에 따라 표시되는 그림 달라짐
                if (remain >= 90) {
                    battery.setImageResource(R.drawable.battery_100);
                }
                else if (remain >= 70) {
                    battery.setImageResource(R.drawable.battery_80);
                }
                else if (remain >= 40) {
                    battery.setImageResource(R.drawable.battery_50);
                }
                else if (remain >= 20) {
                    battery.setImageResource(R.drawable.battery_30);
                }
                else {
                    battery.setImageResource(R.drawable.battery_10);
                }

                int plug = intent.getIntExtra(BatteryManager.EXTRA_PLUGGED, 0);

                if(plug == 0)   //핸드폰에 아무것도 안꽂으면 충전 표시 안 뜸
                    battery_ch.setVisibility(View.INVISIBLE);
                else            //핸드폰에 선(어댑터, USB) 연결하면 충전 표시 뜸
                    battery_ch.setVisibility(View.VISIBLE);
            }
        }
    };
}