package com.example.brsg_project;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class trash_activity extends AppCompatActivity {  //AppCompatActivity -> ListActivity

    //private static final String TAG = "Main_Activity";
    private Context mContext= trash_activity.this;
    private ListView listView;
    private ArrayAdapter arrayAdapter;

    List<String> items = Arrays.asList(
            "옥수수","갑각류 껍질","어패류 껍질", "과일 껍질", "과일 씨","칼, 거울, 깨진유리", "뼈", "김장 쓰레기"
            , "계란 껍질"
    );

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trash_layout);


        ActionBar ab = getSupportActionBar();
        ab.setTitle("쓰레기 구분");

        listView=findViewById(R.id.list_view);


        arrayAdapter=new ArrayAdapter(mContext, android.R.layout.simple_expandable_list_item_1,items);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //클릭한 리스트의 i 값을 jpg2.class에 전달함
                //해당 i 값에 따라 화면에 나타나는 글이 달라지기 때문에 주의해야함
                Intent intent1 = new Intent(trash_activity.this, jpg2.class);
                intent1.putExtra("쓰레기 분리", i);
                startActivity(intent1);

            }
        });


    }


    //액션버튼 메뉴 액션바에 집어 넣기
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.popup2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.go_to_main:
                AlertDialog.Builder alertbuilder1 = new AlertDialog.Builder(this);
                alertbuilder1.setMessage("메인화면으로 전환하시겠습니까?");
                alertbuilder1.setPositiveButton("yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "메인화면으로 전환합니다.", Toast.LENGTH_SHORT).show();
                                finish();
                                Intent intent = new Intent(trash_activity.this, MainActivity.class);
                                startActivity(intent);
                            }
                        });
                alertbuilder1.setNegativeButton("no",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "화면전환을 취소합니다.", Toast.LENGTH_SHORT).show();
                            }
                        });

                AlertDialog alertdialog1 = alertbuilder1.create();
                alertdialog1.show();
                break;
            case R.id.go_to_sepa:
                AlertDialog.Builder alertbuilder2 = new AlertDialog.Builder(this);
                alertbuilder2.setMessage("분리수거 화면으로 전환하시겠습니까?");
                alertbuilder2.setPositiveButton("yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "분리수거 화면으로 전환합니다.", Toast.LENGTH_SHORT).show();
                                finish();
                                Intent intent2 = new Intent(trash_activity.this, separate_activity.class);
                                startActivity(intent2);
                            }
                        });
                alertbuilder2.setNegativeButton("no",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "화면전환을 취소합니다.", Toast.LENGTH_SHORT).show();
                            }
                        });

                AlertDialog alertdialog2 = alertbuilder2.create();
                alertdialog2.show();
                break;
            case R.id.how_to:

                AlertDialog.Builder alertbuilder3 = new AlertDialog.Builder(this);
                alertbuilder3.setMessage("분리쓰거 사용방법화면으로 전환하시겠습니까?");
                alertbuilder3.setPositiveButton("yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "사용방법화면으로 전환합니다.", Toast.LENGTH_SHORT).show();
                                //finish();
                                Intent intent3 = new Intent(trash_activity.this, howto.class);
                                startActivity(intent3);
                            }
                        });
                alertbuilder3.setNegativeButton("no",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "화면전환을 취소합니다.", Toast.LENGTH_SHORT).show();
                            }
                        });

                AlertDialog alertdialog3 = alertbuilder3.create();
                alertdialog3.show();
                break;
        }
        return true;
    }

}

