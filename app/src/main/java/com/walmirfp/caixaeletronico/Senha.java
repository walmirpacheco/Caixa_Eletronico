package com.walmirfp.caixaeletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Senha extends AppCompatActivity {

    private EditText senha;
    private Button botaoConfirmar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senha);

        senha = findViewById(R.id.edit_senha);
        botaoConfirmar = findViewById(R.id.bt_confirmar);

        getSupportActionBar().hide();              //esconde a (Barra de ação de suporte)

        botaoConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int senhaCadastrada = 686500;
                int senhaAtual;

                senhaAtual = Integer.parseInt(senha.getText().toString());  //converter os dados da senha que está em String para inteiro

                if(senhaAtual == senhaCadastrada){
                     irParaActivityPrincipal();                        //Vai para a tela principal escolhida
                } else {
                    Toast.makeText(Senha.this,"Senha Errada", Toast.LENGTH_SHORT).show();  //Mostra mensagem na tela, e mostra o tempo de exibição da mensagem (LENGTH_SHORT) aparece de forma rapida
                }
            }
        });

    }
    private void irParaActivityPrincipal(){
        Intent intent = new Intent(Senha.this,MainActivity.class);   //depois que aceitar a senha, a tela vai para MainActivity
        startActivity(intent);                                                    //Iniciar a Activity
        finish();                                                                 //quando apertar em voltar, finaliza o programa
    }
}