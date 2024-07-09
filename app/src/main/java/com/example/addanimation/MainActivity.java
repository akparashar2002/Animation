package com.example.addanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgAnim;
    AppCompatButton btnTranslate,btnAlpha,btnScale,btnRotate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         imgAnim = findViewById(R.id.imgAnim);
         btnTranslate = findViewById(R.id.btnTranslate);
         btnAlpha = findViewById(R.id.btnAlpha);
         btnScale = findViewById(R.id.btnScale);
         btnRotate = findViewById(R.id.btnRotate);

         btnTranslate.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Animation move = AnimationUtils.loadAnimation( getApplicationContext(), R.anim.move);
                 imgAnim.startAnimation(move);
             }
         });

         btnAlpha.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                 imgAnim.startAnimation(alpha);
             }
         });

         btnRotate.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                 imgAnim.startAnimation(rotate);
             }
         });

         btnScale.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
                 imgAnim.startAnimation(scale);

             }
         });


    }
}