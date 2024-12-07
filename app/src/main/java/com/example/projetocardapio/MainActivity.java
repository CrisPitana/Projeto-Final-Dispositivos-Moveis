package com.example.projetocardapio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetocardapio.adapter.CardapioAdapter;
import com.example.projetocardapio.databinding.ActivityMainBinding;
import com.example.projetocardapio.model.Cardapio;
import com.example.projetocardapio.repository.CardapioRepository;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //     (layout+biblioteca) = variavel binding
    private ActivityMainBinding binding;
    private RecyclerView rvCardapio;
    private CardapioAdapter cardapioAdapter;
    private ArrayList<Cardapio> cardapioArrayList = new ArrayList<>();
    private ImageView sacola;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        sacola = findViewById(R.id.imgSacola);
        rvCardapio = findViewById(R.id.recyclerView);

        //inflar o layout
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        //exibe o layout passado como parametro
        setContentView(binding.getRoot());
        // logo consigo recuperar a referencia de todos os componentes ..

        // configurando a RecycleView recuperando o id (mesmo findViewById)
        RecyclerView rvCardapio = binding.recyclerView;
        // configurando o formato da lista (nesse caso Linear um abaixo do outro)
        rvCardapio.setLayoutManager(new LinearLayoutManager(this));
        // vista dinamica ganha desempenho
        rvCardapio.setHasFixedSize(true);

        // passo para adapter a lista dos itens
        cardapioAdapter = new CardapioAdapter(cardapioArrayList,this);
        //cardapioAdapter = new CardapioAdapter(cardapioRepositoryArrayList,this); // quero buscar do repositório
       // passo para o rv o adapter com a lista completa
        rvCardapio.setAdapter(cardapioAdapter);
        criarProdutoLote();
        criaProduto();

        // chama evento de click na sacola
        sacola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irParaPedido();
            }
        });

        // chama evento adicionar a sacola
        // aqui precisa melhorar, evento de click sobre cada item, fiz só para demonstrar
        rvCardapio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IrParaAddPedido();
            }
        });

    } // fim oncreate

    // função ir para tela pedido
    private void irParaPedido() {
        Intent in = new Intent(this, Pedido.class);
        startActivity(in);
        finish();
    }

    // função ir para tela adicionar Pedido
    private void IrParaAddPedido() {
        Intent in = new Intent(this, CadastroPedido.class);
        startActivity(in);
        finish();
    }


    // função cria produtos manualmente
    private void criarProdutoLote(){

        //Burguer
        Cardapio produto1 = new Cardapio(
                R.drawable.dacasa,
                "Burguer da casa",
                "Burguer",
                "30,00",
                " Pão Hamburguer, Hamburguer Artesanal, Bacon, Maionese, queijo chedder, tomate e alface ");
        cardapioArrayList.add(produto1);

        Cardapio produto2 = new Cardapio(
                R.drawable.duplo,
                "Burguer Duplo ",
                "Burguer",
                "R$ 40,00",
                "  Pão Hamburguer, Dois Hamburguers, Maionese, queijo chedder, tomate e alface  ");
        cardapioArrayList.add(produto2);

        Cardapio produto3 = new Cardapio(
                R.drawable.veget,
                "Burguer Vegetariano",
                "Burguer",
                "R$ 25,00",
                " Pão Hamburguer, Hamburguer Soja, Maionese fit,  tomate e alface  ");
        cardapioArrayList.add(produto3);

        Cardapio produto4 = new Cardapio(
                R.drawable.kids,
                "Burguer Kids",
                "Burguer",
                "R$ 20,00",
                " Pão Hamburguer, escolher a Proteina , Queijo Chedder, Maionese,  tomate e alface ");
        cardapioArrayList.add(produto4);


        //Bebidas

        Cardapio produto5 = new Cardapio(
                R.drawable.agua,
                "Agua 500ml sem gás",
                "Bebidas",
                "R$ 3,00",
                null);
        cardapioArrayList.add(produto5);

        Cardapio produto6 = new Cardapio(
                R.drawable.coca,
                "Coca cola lata",
                "Bebidas",
                "R$ 5,00",
                null);
        cardapioArrayList.add(produto6);

        Cardapio produto7 = new Cardapio(
                R.drawable.cerveja,
                "Cerveja Bohemia lata 473ml",
                "Bebidas",
                "R$ 7,00",
                null);
        cardapioArrayList.add(produto7);
    }

    // adiciona Produto individual ao cardapio
    public void criaProduto(){
        Cardapio produto = new Cardapio(
                R.drawable.limoneto,
                "H2O Limoneto 500ml",
                "Bebidas",
                "R$ 5,00",
                null);
        cardapioArrayList.add(produto);

    }
}
