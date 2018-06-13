package com.qifan.qifanguo_summermobileapplication1;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.qifan.qifanguo_summermobileapplication1.Fragment.DemoFragment;
import com.qifan.qifanguo_summermobileapplication1.Fragment.WorkFragment;

public class MainActivity extends AppCompatActivity {

    private Button MenuButton;
    private Button ProfileButton;
    private Button DemoButton;
    private Button WorkButton;
    private DemoFragment demoFragment;
    private WorkFragment workFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        MenuButton=findViewById(R.id.MainMenuButton);
        ProfileButton=findViewById(R.id.ProfileButton);
        DemoButton=findViewById(R.id.DemoButton);
        WorkButton=findViewById(R.id.WorkButton);

        demoFragment=new DemoFragment();
        workFragment=new WorkFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.MainFragmentLayout,demoFragment,"").commit();



        MenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Hello Wolrd",Toast.LENGTH_SHORT).show();
            }
        });
        ProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"My Account",Toast.LENGTH_SHORT).show();
            }
        });
        DemoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DemoButton.setTextColor(Color.RED);
                WorkButton.setTextColor(Color.BLACK);
                getSupportFragmentManager().beginTransaction().replace(R.id.MainFragmentLayout,demoFragment,"").commit();
            }
        });
        WorkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WorkButton.setTextColor(Color.RED);
                DemoButton.setTextColor(Color.BLACK);
                getSupportFragmentManager().beginTransaction().replace(R.id.MainFragmentLayout,workFragment,"").commit();
            }
        });
    }
}
