package com.example.projetocardapio;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerview = findViewById(R.id.recyclerView);

        // CONFIGURA O ADAPTER
        Adapter adapter = new Adapter(listaProdutos);

        // CONFIGURA O RECYCLEVIEW LAYOUT
        // instancia
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        //setar
        recyclerview.setLayoutManager(layoutManager);

        // vista dinamica valor fiixo testar false também
        recyclerview.setHasFixedSize(true);

        // add adaptador
        //recyclerview.setAdapter();




    }
}


/*  MODELAGEM DE DADOS

CLIENTES
string	nome
string	email
string	senha
string	telefone
vetor	endereco
______________________________
PRODUTOS
string Categoria
Tamanho
Valor
Ingredientes
______________________________
PEDIDO
Produto
SubTotal
Frete
ValorTotal
Obs
Status







*/