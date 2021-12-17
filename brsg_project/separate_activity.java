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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class separate_activity extends AppCompatActivity {  //AppCompatActivity -> ListActivity

    ActionBar ab;
    private Context mContext= separate_activity.this;
    private ListView listView;
    private ArrayAdapter arrayAdapter;

    List<String> items = Arrays.asList(
            "플라스틱","유리병","종이","비닐","우유팩", "스티로폼", "캔류", "가전제품", "형광등", "고철", "의류"
    );

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.separate_layout);

        ab = getSupportActionBar();
        ab.setTitle("분리수거 방법");

        listView=findViewById(R.id.list_view);


        arrayAdapter=new ArrayAdapter(mContext, android.R.layout.simple_expandable_list_item_1,items);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //클릭한 리스트의 i 값을 jpg1.class에 전달함
                //해당 i 값에 따라 화면에 나타나는 글이 달라지기 때문에 주의해야함
                Intent intent1 = new Intent(separate_activity.this, jpg1.class);
                intent1.putExtra("분리수거", i);
                startActivity(intent1);
            }
        });
    }

    //액션버튼 메뉴 액션바에 집어 넣기
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.popup, menu);
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
            case R.id.go_to_trash:
                AlertDialog.Builder alertbuilder2 = new AlertDialog.Builder(this);
                alertbuilder2.setMessage("쓰레기 분리화면으로 전환하시겠습니까?");
                alertbuilder2.setPositiveButton("yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "쓰레기 분리화면으로 전환합니다.", Toast.LENGTH_SHORT).show();
                                finish();

                                Intent intent2 = new Intent(separate_activity.this, trash_activity.class);
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

                                Intent intent3 = new Intent(separate_activity.this, howto.class);
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

