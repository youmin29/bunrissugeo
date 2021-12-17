package com.example.brsg_project;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class jpg1 extends AppCompatActivity {

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
        ab.setTitle("분리수거 방법");

        //separate_activity에서 주제에 맞는 값 전달하고 인텐트 사용해서 해당 값 전달받음
        Intent secondIntent = getIntent();
        int sepanum = secondIntent.getExtras().getInt("분리수거");

        //전달받은 값에 따라 화면에 표시되는 내용 달라짐
        if (sepanum == 0) {
            ab = getSupportActionBar();
            ab.setTitle("플라스틱");

            text00.setText("플라스틱 분리수거 방법");
            text01.setText("1. 플라스틱의 속에 이물질이 있다면, 깨끗하게 헹군다.");
            text02.setText("2. 겉에 비닐이나 스티커 등이 붙어 있다면, 제거한다.");
            text03.setText("3. 페트병은 찌그러트린다.");
            text04.setText("4. 플라스틱 분리하는 곳에 배출한다.");
            text05.setText(" ");
            text06.setText(" ");

        }
        else if (sepanum == 1) {
            ab = getSupportActionBar();
            ab.setTitle("유리병");

            text00.setText("유리병 분리수거 방법");
            text01.setText("유리병은 색상별로 분리해주세요!");
            text01.setTextSize(23);
            text01.setTextColor(Color.RED);
            text01.setGravity(Gravity.CENTER);
            text02.setText("일반 유리병(투명)");
            text02.setTextSize(18);
            text03.setText("1. 깨지지 않도록 주의해서 배출한다.");
            text04.setText("유색 유리병(갈색, 녹색 등)");
            text04.setTextSize(18);
            text05.setText("1. 색상별로 나눠서 배출한다.");
            text06.setText("  ");

        }
        else if (sepanum == 2) {
            ab = getSupportActionBar();
            ab.setTitle("종이");

            text00.setText("종이 분리수거 방법");
            text01.setText("  영수증, 택배전표, 금은박지, 벽지, 부직포, 폐휴지는 \n   종량제 봉투에 버려주세요!\n   우유팩은 따로 분리수거해요!");
            text01.setTextColor(Color.RED);
            text01.setGravity(Gravity.CENTER);
            text02.setText("골판지류(상자 등)");
            text02.setTextSize(18);
            text03.setText("1. 송장스티커, 테이프 등 이물질을 제거한다.");
            text04.setText("2. 종이박스는 접어서 따로 배출한다.");
            text05.setText("신문, 책자류");
            text05.setTextSize(18);
            text06.setText("1. 스프링과 같은 종이류가 아닌 것들은 제거해서 \n   배출한다.");
        }
        else if (sepanum == 3) {
            ab = getSupportActionBar();
            ab.setTitle("비닐");

            text00.setText("비닐 분리수거 방법");
            text01.setText("1. 속에 이물질이 있으면 버리고 헹군다.");
            text02.setText("2. 접어서 부피를 줄인다.");
            text03.setText("3. 큰 봉투에 모아서 배출한다.");
            text04.setText(" ");
            text05.setText(" ");
            text06.setText(" ");
        }
        else if (sepanum == 4) {
            ab = getSupportActionBar();
            ab.setTitle("우유팩");

            text00.setText("우유팩 분리수거 방법");
            text01.setText("1. 속에 이물질이 있으면 버리고 헹군다.");
            text02.setText("2. 접어서 부피를 줄인다.");
            text03.setText("3. 우유팩만 분리하는 곳에 따로 배출한다.");
            text04.setText(" ");
            text05.setText(" ");
            text06.setText(" ");
        }
        else if (sepanum == 5) {
            ab = getSupportActionBar();
            ab.setTitle("스티로폼");

            text00.setText("스티로폼 분리수거 방법");
            text01.setText("1. 내용물을 비우고 붙은 스티커를 뗀다.");
            text02.setText("2. 이물질이 묻었으면 깨끗이 씻는다.");
            text03.setText("3. 스티로폼만 분리하는 곳에 따로 배출한다.");
            text04.setText(" ");
            text05.setText(" ");
            text06.setText(" ");
        }
        else if (sepanum == 6) {
            ab = getSupportActionBar();
            ab.setTitle("캔류");

            text00.setText("캔류 분리수거 방법");
            text01.setText("철캔, 알루미늄캔");
            text01.setTextSize(18);
            text02.setText("1. 내용물을 비우고 최대한 압착한다.");
            text03.setText("2. 플라스틱 뚜껑을 제거하고 배출한다.");
            text04.setText("기타캔류 (부탄가스, 살충제용기 등)");
            text04.setTextSize(18);
            text05.setText("1. 구멍을 뚫어 내용물을 비운 후 배출한다.");
            text06.setText("  ");
        }
        else if (sepanum == 7) {
            ab = getSupportActionBar();
            ab.setTitle("가전제품");

            text00.setText("가전제품 분리수거 방법");
            text01.setText("사용 가능한 경우");
            text01.setTextSize(18);
            text02.setText("1. 재활용센터나 중고 물품 교환매장에 보낸다.");
            text03.setText("사용 불가능한 경우");
            text03.setTextSize(18);
            text04.setText("기타캔류 (부탄가스, 살충제용기 등)");
            text05.setText("1. 관할 지방자치단체에 연락해 스티커를 받는다.");
            text06.setText("2. 받은 스티커를 가전제품에 부착하고 배출한다.");
        }
        else if (sepanum == 8) {
            ab = getSupportActionBar();
            ab.setTitle("형광등");

            text00.setText("형광등 분리수거 방법");
            text01.setText("1. 깨지지 않은 형광등인지 확인한다.");
            text02.setText("2. 형광등 분리배출용기에 배출한다.");
            text03.setText(" ");
            text04.setText(" ");
            text05.setText(" ");
            text06.setText(" ");
        }
        else if (sepanum == 9) {
            ab = getSupportActionBar();
            ab.setTitle("고철");

            text00.setText("고철 분리수거 방법");
            text01.setText("1. 이물질이 섞이지 않도록 봉투나 끈으로 묶어 배출한다.");
            text02.setText(" ");
            text03.setText(" ");
            text04.setText(" ");
            text05.setText(" ");
            text06.setText(" ");
        }
        else if (sepanum == 10) {
            ab = getSupportActionBar();
            ab.setTitle("의류");

            text00.setText("캔류 분리수거 방법");
            text01.setText("1. 젖지 않도록 마대에 담거나 끈으로 묶는다.");
            text02.setText("2. 의류수거함에 배출한다.");
            text03.setText(" ");
            text04.setText(" ");
            text05.setText(" ");
            text06.setText(" ");
        }


    }
}