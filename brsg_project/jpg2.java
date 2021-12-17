package com.example.brsg_project;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class jpg2 extends AppCompatActivity {

    ActionBar ab;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jpg1);

        TextView text00 = (TextView) findViewById(R.id.text00);
        TextView text01 = (TextView) findViewById(R.id.text01);
        TextView text02 = (TextView) findViewById(R.id.text02);
        TextView text03 = (TextView) findViewById(R.id.text03);
        TextView text04 = (TextView) findViewById(R.id.text04);
        TextView text05 = (TextView) findViewById(R.id.text05);
        TextView text06 = (TextView) findViewById(R.id.text06);

        ab = getSupportActionBar();
        ab.setTitle("쓰레기 분리");

        //trash_activity에서 주제에 맞는 값 전달하고 인텐트 사용해서 해당 값 전달받음
        Intent secondIntent = getIntent();
        int trashnum = secondIntent.getExtras().getInt("쓰레기 분리");

        //trashnum에 따라 화면에 표시되는 내용 달라짐
        if (trashnum == 0) {
            ab = getSupportActionBar();
            ab.setTitle("옥수수");

            text00.setText("옥수수");
            text01.setText("옥수수알은 음식물 쓰레기");
            text02.setText("옥수수 껍질, 뿌리, 심은 일반 쓰레기");
            text03.setText(" ");
            text04.setText(" ");
            text05.setText(" ");
            text06.setText(" ");

        }
        else if (trashnum == 1) {
            ab = getSupportActionBar();
            ab.setTitle("갑각류 껍질");

            text00.setText("갑각류 껍질은 일반 쓰레기");
            text01.setText("갑각류 껍질은 단단해서 음식물 분쇄기로 갈 수 없어요.");
            text02.setText("그렇기 때문에 일반 쓰레기로 버려주세요!");
            text03.setText("(예. 게 껍질, 새우 껍질 등)");
            text04.setText(" ");
            text05.setText(" ");
            text06.setText(" ");

        }
        else if (trashnum == 2) {
            ab = getSupportActionBar();
            ab.setTitle("어패류 껍질");

            text00.setText("어패류 껍질은 일반 쓰레기");
            text01.setText("어패류 껍질은 단단해서 음식물 분쇄기로 갈 수 없어요.");
            text02.setText("그렇기 때문에 일반 쓰레기로 버려주세요!");
            text03.setText("(예. 조개, 홍합, 전복 등)");
            text04.setText(" ");
            text05.setText(" ");
            text06.setText(" ");

        }
        else if (trashnum == 3) {
            ab = getSupportActionBar();
            ab.setTitle("과일 껍질");

            text00.setText("과일 껍질");
            text01.setText("분해가 쉬운 과일의 껍질은 음식물 쓰레기");
            text01.setTextColor(Color.RED);
            text02.setText("껍질이 크다면, 잘게 잘라서 버려주세요!");
            text03.setText("(예. 수박, 멜론, 바나나, 사과 등");
            text04.setText("껍질이 질기거나 단단하면 일반 쓰레기");
            text04.setTextColor(Color.RED);
            text05.setText("(예. 아보카도, 파인애플)");
            text06.setText("주의. 포도는 줄기만 일반 쓰레기!");

        }
        else if (trashnum == 4) {
            ab = getSupportActionBar();
            ab.setTitle("과일 씨");

            text00.setText("단단한 씨는 일반 쓰레기");
            text01.setText("단단한 씨는 일반 쓰레기로 버려야해요!");
            text02.setText("(예. 살구, 아보카도, 자두, 복숭아, 감 등)");
            text03.setText(" ");
            text04.setText(" ");
            text05.setText(" ");
            text06.setText(" ");

        }
        else if (trashnum == 5) {
            ab = getSupportActionBar();
            ab.setTitle("칼, 거울, 깨진유리");

            text00.setText("칼, 거울, 깨진유리는 \n일반 쓰레기");
            text01.setText("신문지나 종이로 감싸서 다치지 않게 만든 후 \n일반 쓰레기에 버려주세요!");
            text02.setText(" ");
            text03.setText(" ");
            text04.setText(" ");
            text05.setText(" ");
            text06.setText(" ");

        }
        else if (trashnum == 6) {
            ab = getSupportActionBar();
            ab.setTitle("뼈");

            text00.setText("뼈는 모두 일반 쓰레기");
            text01.setText("(예. 닭 뼈, 소 뼈, 돼지 뼈, 생선 뼈)");
            text02.setText(" ");
            text03.setText(" ");
            text04.setText(" ");
            text05.setText(" ");
            text06.setText(" ");

        }
        else if (trashnum == 7) {
            ab = getSupportActionBar();
            ab.setTitle("김장 쓰레기");

            text00.setText("김장 쓰레기");
            text01.setText("물에 젖은 배추는 음식물 쓰레기");
            text02.setText("흙과 같은 이물질이 묻은 채소류는 일반 쓰레기");
            text03.setText("양파, 마늘 등의 껍질은 일반 쓰레기");
            text04.setText("파, 대파, 미나리 등의 채소 뿌리는 일반 쓰레기");
            text05.setText("견과류 껍데기, 고추 씨 등은 일반 쓰레기");
            text06.setText("조개, 굴, 계란 등 껍데기는 일반 쓰레기");

        }
        else if (trashnum == 8) {
            ab = getSupportActionBar();
            ab.setTitle("계란 껍질");

            text00.setText("계란 껍질은 일반 쓰레기");
            text01.setText("계란 껍질은 딱딱해서 비료로 사용할 수 없어요.");
            text02.setText("그래서 음식물이 아닌 일반 쓰레기로 버려야합니다!");
            text03.setText(" ");
            text04.setText(" ");
            text05.setText(" ");
            text06.setText(" ");

        }



    }
}