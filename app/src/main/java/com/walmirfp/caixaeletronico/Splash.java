package com.walmirfp.caixaeletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();  //esconde a (Barra de ação de suporte)

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                ActivitySenha();
            }
        },3000);   //  3000 equivale a 3 segundos
    }
    private void ActivitySenha() {
        Intent intent = new Intent(Splash.this,Senha.class);   // A tela de Splash vai para a tela de Senha
        startActivity(intent);                                              //inicia onde quer iniciar
        finish();                                                           //Quando apertar a tecla de voltar finaliza o aplicativo
    }
}