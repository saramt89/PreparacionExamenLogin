package com.examen.preparacionexamenlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    ImageView imagen;
    TextView hola;
    ImageView imagenRotacion;
    TextView hola2;
    TextView hola3;
    ImageView imagenBlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imagen = findViewById(R.id.imagenAnimacion);
        Animation translate = AnimationUtils.loadAnimation(this,R.anim.translate);
        imagen.startAnimation(translate);

        hola = findViewById(R.id.hola);
        Animation fadein = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        hola.startAnimation(fadein);

        imagenRotacion = findViewById(R.id.imagenRotacion);
        Animation rotacion = AnimationUtils.loadAnimation(this,R.anim.rotacion);
        imagenRotacion.startAnimation(rotacion);

        hola2 = findViewById(R.id.hola2);
        Animation escala = AnimationUtils.loadAnimation(this,R.anim.escala);
        hola2.startAnimation(escala);

        hola3 = findViewById(R.id.hola3);
        Animation fadeout = AnimationUtils.loadAnimation(this,R.anim.fade_out);
        hola3.startAnimation(fadeout);

        imagenBlink = findViewById(R.id.imagenBlink);
        Animation blink = AnimationUtils.loadAnimation(this,R.anim.blink);
        imagenBlink.startAnimation(blink);


        openApp();

    }

    private void openApp() {

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3500);

    }
}
