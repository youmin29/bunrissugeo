package com.example.brsg_project;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class howto extends AppCompatActivity {
    ActionBar ab;

    protected class MyView extends View {
        int x =524, y = 773;    //원 기본 위치

        public MyView(Context context){
            super(context);
            setBackgroundColor(Color.WHITE);    //배경색은 흰 색
        }

        protected void onDraw(Canvas canvas){
            Paint paint = new Paint();
            paint.setColor(Color.GREEN);        //원 색은 녹색
            canvas.drawCircle(x,y,130,paint);   //원의 반지름은 130
            //paint.setTextSize(50);
            //canvas.drawText(x +", " +y , 0, 100, paint);

            //"메인화면", "분리수거", "쓰레기 구분", "팝업 메뉴"

            Paint paint2 = new Paint();
            paint2.setColor(Color.BLACK);   //글씨 색 검은색
            paint2.setTextSize(70);         //글씨 크기
            //글씨가 어디 위치에 있을지
            canvas.drawText("메인화면", 160, 466, paint2);
            canvas.drawText("분리수거", 682, 466, paint2);
            canvas.drawText("쓰레기 구분", 160, 1200, paint2);
            canvas.drawText("팝업 메뉴", 682, 1200, paint2);
        }

        public boolean onTouchEvent(MotionEvent event){
            x = (int) event.getX();
            y = (int) event.getY();

            if(x>=177 && x <=386) {
                if (y >= 382 && y <= 468) {
                    finish();   //현재화면 종료
                    Intent intent0 = new Intent(howto.this, howto2.class);  //주제에 맞는 사용방법 화면으로 전환
                    intent0.putExtra("설명화면", 0);    //주제가 무엇인지 인텐트 사용해서 전달
                    startActivity(intent0);
                }
                if (y >= 1138 && y <= 1209) { //1138, 1209
                    finish();
                    Intent intent1 = new Intent(howto.this, howto2.class);
                    intent1.putExtra("설명화면", 1);
                    startActivity(intent1);
                }
            }
            if(x>=723 && x <=925) { //723, 925
                if (y >= 382 && y <= 468) {
                    finish();
                    Intent intent2 = new Intent(howto.this, howto2.class);
                    intent2.putExtra("설명화면", 2);
                    startActivity(intent2);
                }
                if (y >= 1138 && y <= 1209) {
                    finish();
                    Intent intent3 = new Intent(howto.this, howto2.class);
                    intent3.putExtra("설명화면", 3);
                    startActivity(intent3);
                }
            }

            invalidate();
            return true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView w = new MyView(this);
        setContentView(w);

        ab = getSupportActionBar();
        ab.setTitle("설명화면 선택");
    }
}