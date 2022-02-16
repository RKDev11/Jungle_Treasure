package com.jeulng.terreuas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.Random;

public class gg extends AppCompatActivity {
    private int MyHeight = 0;
    private int[] textureArrayWin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gg);

        getWindow().addFlags(1024);

        textureArrayWin = new int[]{
                R.drawable.ic_slot_6,
                R.drawable.ic_slot_7,
                R.drawable.ic_slot_8,
                R.drawable.ic_slot_9,
                R.drawable.ic_slot_10,
        };


        ImageView small = findViewById(R.id.imageSmall);
        ImageView imageView1 = findViewById(R.id.imageView1);
        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView3 = findViewById(R.id.imageView3);
        ImageView imageView4 = findViewById(R.id.imageView4);
        ImageView imageView5 = findViewById(R.id.imageView5);
        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button2);

        MyHeight = 50;
        ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) small.getLayoutParams();
        params.height = MyHeight;
        small.setLayoutParams(params);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imageView1.animate().translationY(-2000).setDuration(700).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        imageView1.setImageResource(textureArrayWin[randomayzer()]);
                        imageView1.animate().translationY(0).setDuration(0);
                        MyHeight += 50;
                        ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) small.getLayoutParams();
                        params.height = MyHeight;
                        small.setLayoutParams(params);
                        if(MyHeight >= 1000){
                            textView.setText("You Win!!!");
                            imageView1.setVisibility(View.INVISIBLE);
                            imageView2.setVisibility(View.INVISIBLE);
                            imageView3.setVisibility(View.INVISIBLE);
                            imageView4.setVisibility(View.INVISIBLE);
                            imageView5.setVisibility(View.INVISIBLE);
                            button.setVisibility(View.VISIBLE);
                        }
                    }
                }).start();
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imageView2.animate().translationY(-2000).setDuration(700).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        imageView2.setImageResource(textureArrayWin[randomayzer()]);
                        imageView2.animate().translationY(0).setDuration(0);
                        MyHeight += 50;
                        ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) small.getLayoutParams();
                        params.height = MyHeight;
                        small.setLayoutParams(params);
                        if(MyHeight >= 1000){
                            textView.setText("You Win!!!");
                            imageView1.setVisibility(View.INVISIBLE);
                            imageView2.setVisibility(View.INVISIBLE);
                            imageView3.setVisibility(View.INVISIBLE);
                            imageView4.setVisibility(View.INVISIBLE);
                            imageView5.setVisibility(View.INVISIBLE);
                            button.setVisibility(View.VISIBLE);
                        }
                    }
                }).start();
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imageView3.animate().translationY(-2000).setDuration(700).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        imageView3.setImageResource(textureArrayWin[randomayzer()]);
                        imageView3.animate().translationY(0).setDuration(0);
                        MyHeight += 50;
                        ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) small.getLayoutParams();
                        params.height = MyHeight;
                        small.setLayoutParams(params);
                        if(MyHeight >= 1000){
                            textView.setText("You Win!!!");
                            imageView1.setVisibility(View.INVISIBLE);
                            imageView2.setVisibility(View.INVISIBLE);
                            imageView3.setVisibility(View.INVISIBLE);
                            imageView4.setVisibility(View.INVISIBLE);
                            imageView5.setVisibility(View.INVISIBLE);
                            button.setVisibility(View.VISIBLE);
                        }
                    }
                }).start();
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imageView4.animate().translationY(-2000).setDuration(700).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        imageView4.setImageResource(textureArrayWin[randomayzer()]);
                        imageView4.animate().translationY(0).setDuration(0);
                        MyHeight += 50;
                        ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) small.getLayoutParams();
                        params.height = MyHeight;
                        small.setLayoutParams(params);
                        if(MyHeight >= 1000){
                            textView.setText("You Win!!!");
                            imageView1.setVisibility(View.INVISIBLE);
                            imageView2.setVisibility(View.INVISIBLE);
                            imageView3.setVisibility(View.INVISIBLE);
                            imageView4.setVisibility(View.INVISIBLE);
                            imageView5.setVisibility(View.INVISIBLE);
                            button.setVisibility(View.VISIBLE);
                        }
                    }
                }).start();
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imageView5.animate().translationY(-2000).setDuration(700).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        imageView5.setImageResource(textureArrayWin[randomayzer()]);
                        imageView5.animate().translationY(0).setDuration(0);
                        MyHeight += 50;
                        ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) small.getLayoutParams();
                        params.height = MyHeight;
                        small.setLayoutParams(params);
                        if(MyHeight >= 1000){
                            textView.setText("You Win!!!");
                            imageView1.setVisibility(View.INVISIBLE);
                            imageView2.setVisibility(View.INVISIBLE);
                            imageView3.setVisibility(View.INVISIBLE);
                            imageView4.setVisibility(View.INVISIBLE);
                            imageView5.setVisibility(View.INVISIBLE);
                            button.setVisibility(View.VISIBLE);
                        }
                    }
                }).start();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyHeight = 50;
                ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) small.getLayoutParams();
                params.height = MyHeight;
                textView.setVisibility(View.INVISIBLE);
                small.setLayoutParams(params);
                imageView1.setVisibility(View.VISIBLE);
                imageView2.setVisibility(View.VISIBLE);
                imageView3.setVisibility(View.VISIBLE);
                imageView4.setVisibility(View.VISIBLE);
                imageView5.setVisibility(View.VISIBLE);
                button.setVisibility(View.INVISIBLE);
            }
        });


    }

    private int randomayzer() {
        Random random = new Random();
        return random.nextInt(5);
    }

}
