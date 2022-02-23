package com.example.creditscore;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {///implements View.OnClickListener {
RelativeLayout rellay1,rellay2;
Handler handler = new Handler();
Runnable runnable = new Runnable() {
    @Override
    public void run() {
        rellay1.setVisibility(View.VISIBLE);
        rellay2.setVisibility(View.VISIBLE);
    }
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rellay1 = (RelativeLayout) findViewById(R.id.rellay1);
        rellay2 = (RelativeLayout) findViewById(R.id.rellay2);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button enter = (Button) findViewById(R.id.enter);

//timeout for the splash screen
        handler.postDelayed(runnable,2500);

        //btn2.setOnClickListener(this);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FP.class);
                startActivity(intent);
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Final.class);
                startActivity(intent);
            }
        });
//        btn3.setOnClickListener(this);
//        enter.setOnClickListener(this);
    }

  //  @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.btn2:
//                Intent intent = new Intent(this, Activity2.class);
//                startActivity(intent);
//                //Toast.makeText(this, "Signup", Toast.LENGTH_SHORT).show();
//            case R.id.btn3:
//                Intent out = new Intent(this, FP.class);
//                startActivity(out);
//               //Toast.makeText(this, "Forgot Password!!!", Toast.LENGTH_SHORT).show();
//            case R.id.enter:
//                Intent in = new Intent(this, Final.class);
//                startActivity(in);
//                // Toast.makeText(this, "Forgot Password!!!", Toast.LENGTH_SHORT).show();
//        }
// }
//    public void openActivity2(){
//        Intent intent = new Intent(this,Activity2.class);
//        startActivity(intent);
//    }
}
