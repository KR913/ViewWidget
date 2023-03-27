package com.example.viewwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public int i = 0;
    TextView counter;
    Button plusbtn, minbtn;
    ImageView pic;

    public int add(){
        ++i;
        return i;
    }
    public int sub(){
        --i;
        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = findViewById(R.id.textDisplay);
        pic = findViewById(R.id.imageView);
        plusbtn = (Button) findViewById(R.id.buttonPlus);
        plusbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pic.setImageResource(R.drawable.zenkai);
                counter.setText(""+add());
            }
        });
        minbtn = (Button) findViewById(R.id.buttonMin);
        minbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pic.setImageResource(R.drawable.unnamed);
                counter.setText(""+sub());
            }
        });
    }
}