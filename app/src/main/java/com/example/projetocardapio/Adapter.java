package com.example.projetocardapio;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetocardapio.models.Produto;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
   private List<Produto> listaProdutos;

   // construtor
   public Adapter(List<Produto> lista){
       this.listaProdutos = lista;
   }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // passei o adapterListaCardapio para que ele use na criação da minha lista
        View itemlista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_listacardapio, parent, false);

        return new MyViewHolder(itemlista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //holder.descricao.setText();

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView descricao;
        TextView ingredientes;
        TextView valor;
        TextView tamanho;
        ImageView foto;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            descricao = itemView.findViewById(R.id.textdescricao);
            ingredientes = itemView.findViewById(R.id.textingredientes);
            valor = itemView.findViewById(R.id.textvalor);
            //descricao = itemView.findViewById(R.id.textdescricao);


        }
    }


}
