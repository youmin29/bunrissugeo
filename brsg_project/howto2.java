package com.example.brsg_project;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class howto2 extends AppCompatActivity {

    ActionBar ab;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jpg1);

        //레이아웃의 텍스트뷰 가져옴
        TextView text00 = (TextView) findViewById(R.id.text00);
        TextView text01 = (TextView) findViewById(R.id.text01);
        TextView text02 = (TextView) findViewById(R.id.text02);
        TextView text03 = (TextView) findViewById(R.id.text03);
        TextView text04 = (TextView) findViewById(R.id.text04);
        TextView text05 = (TextView) findViewById(R.id.text05);
        TextView text06 = (TextView) findViewById(R.id.text06);


       
        //howto가 전달한 값 인텐트 사용해서 전달받기
        Intent IntentNum = getIntent();
        int intentnum = IntentNum.getExtras().getInt("설명화면");

        //0: 메인화면 1: 쓰레기 구분 2: 분리수거 3: 팝업메뉴
        if (intentnum == 0) {
            ab = getSupportActionBar();
            ab.setTitle("메인화면 설명");

            text00.setText("메인화면");
            text01.setText("분리쓰거를 실행하면 로고가 보인다.");
            text02.setText("로고 아래에는 배터리 잔량과 충전 여부를 알려주는 그림이 있다.");
            text03.setText("분리수거 방법을 클릭하면 분리수거 방법 화면으로 넘어간다.");
            text04.setText("쓰레기 구분을 클릭하면 쓰레기 구분 화면으로 넘어간다.");
            text05.setText(" ");
            text06.setText(" ");

        }
        else if (intentnum == 1) {
            ab = getSupportActionBar();
            ab.setTitle("쓰레기 구분 화면 설명");

            text00.setText("쓰레기 구분 화면");
            text01.setText("화면에 주제가 뜬다.");
            text02.setText("원하는 주제를 클릭하면 어떻게 처리해야하는지 뜬다.");
            text03.setText("오른쪽 위를 누르면 팝업 메뉴가 뜬다.");
            text04.setText(" ");
            text05.setText(" ");
            text06.setText(" ");

        }
        else if (intentnum == 2) {
            ab = getSupportActionBar();
            ab.setTitle("분리수거 화면 설명");

            text00.setText("분리수거 화면");
            text01.setText("화면에 주제가 뜬다.");
            text02.setText("원하는 주제를 클릭하면 올바른 분리수거 방법이 뜬다.");
            text03.setText("오른쪽 위를 누르면 팝업 메뉴가 뜬다.");
            text04.setText(" ");
            text05.setText(" ");
            text06.setText(" ");

        }
        else if (intentnum == 3) {
            ab = getSupportActionBar();
            ab.setTitle("팝업메뉴 설명");

            text00.setText("팝업메뉴");
            text01.setText("쓰레기 분리 화면 또는 분리수거 화면의 오른쪽 위를 누르면 뜬다.");
            text02.setText("메인화면으로 가기를 누르면 메인화면으로 전환된다.");
            text03.setText("분리수거로 가기를 누르면 분리수거 화면으로 전환된다.");
            text04.setText("쓰레기 구분으로 가기를 누르면 쓰레기 구분 화면으로 전환된다.");
            text05.setText("분리쓰거 사용방법을 누르면 사용 방법 화면으로 전환된다.");
            text06.setText("분리수거 화면에서 분리수거 화면으로 가기와 \n쓰레기 구분에서 쓰레기 구분으로 가기는 필요 없기 때문에 넣지 않았다.");

        }



    }

}