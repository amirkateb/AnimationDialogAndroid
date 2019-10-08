package com.example.androiddialogexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.example.animationdialog.AnimationDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button simple,simple_two_butons,simple_two_gride,simpleTwPic,simpleTwanim,simpleTwsound,simplef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        set_on_click();
    }
    private void init(){
        simple=findViewById(R.id.simple);
        simple_two_butons=findViewById(R.id.simpleTw);
        simple_two_gride=findViewById(R.id.simpleTwGride);
        simpleTwPic=findViewById(R.id.simpleTwPic);
        simpleTwanim=findViewById(R.id.simpleTwanim);
        simpleTwsound=findViewById(R.id.simpleTwsound);
        simplef=findViewById(R.id.simplef);

    }
    private void set_on_click(){
        simple.setOnClickListener(MainActivity.this);
        simple_two_butons.setOnClickListener(MainActivity.this);
        simple_two_gride.setOnClickListener(MainActivity.this);
        simpleTwPic.setOnClickListener(MainActivity.this);
        simpleTwanim.setOnClickListener(MainActivity.this);
        simpleTwsound.setOnClickListener(MainActivity.this);
        simplef.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View view) {
        Button[] buttons;
        switch (view.getId()){
            case R.id.simple:
                buttons=AnimationDialog.init(MainActivity.this,false);
                AnimationDialog.create("Simple AnimationDialog","This Is A Simple Animation Dialog","OK!");
                buttons[0].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        AnimationDialog.close();
                    }
                });

                AnimationDialog.show();
                break;
            case R.id.simpleTw:

                buttons=AnimationDialog.init(MainActivity.this,false);
                AnimationDialog.create("Simple AnimationDialog","This Is A Simple Animation Dialog","NotOk!");
                AnimationDialog.add_secend_button("OK!");
                buttons[0].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        AnimationDialog.close();
                    }
                });
                buttons[1].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        AnimationDialog.close();
                    }
                });

                AnimationDialog.show();
                break;
            case R.id.simpleTwGride:
                buttons=AnimationDialog.init(MainActivity.this,true);
                AnimationDialog.create("Simple AnimationDialog","This Is A Simple Animation Dialog","NotOk!");
                AnimationDialog.add_secend_button("OK!");
                buttons[0].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        AnimationDialog.close();
                    }
                });
                buttons[1].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        AnimationDialog.close();
                    }
                });

                AnimationDialog.show();
                break;
            case R.id.simpleTwPic:
                buttons=AnimationDialog.init(MainActivity.this,false);
                AnimationDialog.create("Simple AnimationDialog","This Is A Simple Animation Dialog","NotOk!");
                AnimationDialog.add_secend_button("OK!");
                AnimationDialog.set_image(R.drawable.lg);
                buttons[0].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        AnimationDialog.close();
                    }
                });
                buttons[1].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        AnimationDialog.close();
                    }
                });

                AnimationDialog.show();
                break;
            case R.id.simpleTwanim:
                buttons=AnimationDialog.init(MainActivity.this,false);
                AnimationDialog.create("Simple AnimationDialog","This Is A Simple Animation Dialog","NotOk!");
                AnimationDialog.add_secend_button("OK!");
                AnimationDialog.set_animation("net.json","#153285");
                buttons[0].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        AnimationDialog.close();
                    }
                });
                buttons[1].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        AnimationDialog.close();
                    }
                });

                AnimationDialog.show();
                break;
            case R.id.simpleTwsound:
                buttons=AnimationDialog.init(MainActivity.this,false);
                AnimationDialog.create("Simple AnimationDialog","This Is A Simple Animation Dialog","NotOk!");
                AnimationDialog.add_secend_button("OK!");
                AnimationDialog.set_animation("net.json","#153285");
                AnimationDialog.set_Sound(R.raw.error);
                buttons[0].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        AnimationDialog.close();
                    }
                });
                buttons[1].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        AnimationDialog.close();
                    }
                });

                AnimationDialog.show();
                break;
            case R.id.simplef:
                Dialog dialog;
                MediaPlayer mediaPlayer;
                LottieAnimationView lottieAnimationView;
                buttons=AnimationDialog.init(MainActivity.this,false);
                AnimationDialog.create("Simple AnimationDialog","This Is A Simple Animation Dialog","NotOk!");
                AnimationDialog.add_secend_button("OK!");
                AnimationDialog.set_animation("net.json","#153285");
                AnimationDialog.set_Sound(R.raw.error);
                AnimationDialog.set_parent_background("#153285");
                AnimationDialog.change_text_color("#FFFFFF");
                AnimationDialog.setCanceledOnTouchOutside(false);
                AnimationDialog.custom_button_background("#FF1744");
                buttons[0].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        AnimationDialog.close();
                    }
                });
                buttons[1].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        AnimationDialog.close();
                    }
                });
                AnimationDialog.show();
                break;
        }
    }
}
