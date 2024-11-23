package com.example.projetocardapio;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ActivitySenha();  // chama tela senha
            }

        },3000); // 3 segundos
    }

    public void ActivitySenha() {
        // intent para chamar tela de login - parametro (tela atual - proxima tela)
        Intent intent = new Intent(Splash.this, Login.class);
        startActivity(intent); // executa intent
        finish();
    }
}
