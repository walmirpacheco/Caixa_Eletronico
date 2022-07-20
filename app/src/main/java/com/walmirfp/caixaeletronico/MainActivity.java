package com.walmirfp.caixaeletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText edit_dinheiro;
    private Button bt_sacar;
    private TextView saldo;

    double saldoEmConta = 3000.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IniciarComponentes();                   //Iniciando nosso metodo, tratado
        getSupportActionBar().hide();
        saldo.setText("Saldo em conta:" + "R$ "+saldoEmConta);
    }
    private void IniciarComponentes(){            //Cria esse metodo para fazer o tratamento antes de iniciar
        edit_dinheiro = findViewById(R.id.edit_dinheiro);
        bt_sacar = findViewById(R.id.bt_sacar);
        saldo = findViewById(R.id.saldo);

        //Evento de click no botão de sacar
        bt_sacar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double dinheiro;
                dinheiro = Double.parseDouble(edit_dinheiro.getText().toString());

                if(saldoEmConta >=0 && saldoEmConta >= dinheiro){
                if(dinheiro < 20){
                    Toast.makeText(MainActivity.this, "[Error!] Valor mínimo a ser sacado é 20.00 Reais", Toast.LENGTH_SHORT).show();
                } else if (dinheiro == 20) {
                    saldoEmConta -= dinheiro;
                    saldo.setText("Saldo em conta:" + "R$ " + saldoEmConta);
                    Toast.makeText(MainActivity.this, "20.00 reais sacados com sucesso!", Toast.LENGTH_SHORT).show();
                } else if (dinheiro == 50) {
                    saldoEmConta -= dinheiro;
                    saldo.setText("Saldo em conta:" + "R$ " + saldoEmConta);
                    Toast.makeText(MainActivity.this, "50.00 reais sacados com sucesso!", Toast.LENGTH_SHORT).show();
                } else if(dinheiro == 100){
                    saldoEmConta -= dinheiro;
                    saldo.setText("Saldo em conta:" + "R$ " + saldoEmConta);
                    Toast.makeText(MainActivity.this, "100.00 reais sacados com sucesso!", Toast.LENGTH_SHORT).show();
                } else if(dinheiro <= saldoEmConta){
                    saldoEmConta -= dinheiro;
                    saldo.setText("Saldo em conta:" + "R$ " + saldoEmConta);
                    Toast.makeText(MainActivity.this, +dinheiro + "0" + " Reais Sacados", Toast.LENGTH_SHORT).show();
                }

                } else {
                    Toast.makeText(MainActivity.this,"[ERRO!] Você não tem saldo para sacar esse valor!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}