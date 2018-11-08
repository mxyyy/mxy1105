package com.bwie.mxy1105;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Zhuan mDisc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDisc = findViewById(R.id.disc);
        mDisc.setOnDiscViewListener(new com.bwie.mxy1105.Zhuan.OnDiscViewListener() {
            @Override
            public void onDiscView(int m) {
                if (m == 1){
                    Toast.makeText(MainActivity.this, "开始", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "停止", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //初始化控件
        toolbar = findViewById(R.id.toolbar);
        //设置主标题
        toolbar.setTitle("ChangeYourMind");

        //设置副标题
        toolbar.setSubtitle("For Yourself");

        //设置ToolBar
        setSupportActionBar(toolbar);

        //设置系统默认的返回箭头
        //注:必须要设置在ToolBar后,否则没效果
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //设置返回监听
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
