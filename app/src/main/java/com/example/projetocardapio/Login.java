package com.example.projetocardapio;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    public  EditText senha;
    private Button buttonEntrar, buttonCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        senha = findViewById(R.id.edtSenha);
        buttonEntrar = findViewById(R.id.btnEntrar);
        buttonCadastro = findViewById(R.id.btncadastra);

        buttonEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int senhaMestre = 123456;
                int senhaDigitada;

                //converte senha digitada em inteiro
                senhaDigitada = Integer.parseInt(senha.getText().toString());

                if (senhaDigitada == senhaMestre) {
                    irParaMenu();
                } else {
                    Toast.makeText(Login.this, "Senha Errada", Toast.LENGTH_SHORT).show(); // mensagem usuário
                }
            }
        });

        buttonCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irParaInscricao();
            }
        });
    }

    // função ir para tela menu
    private void irParaMenu() {
        Intent in = new Intent(Login.this, MainActivity.class);
        startActivity(in);
        finish();
    }

    // função ir cadastro usuário
    private void irParaInscricao() {
        Intent in = new Intent(Login.this, Inscricao.class);
        startActivity(in);
        finish();
    }

}