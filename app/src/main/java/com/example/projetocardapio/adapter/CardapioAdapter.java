package com.example.projetocardapio.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetocardapio.databinding.ItemcardapioBinding;
import com.example.projetocardapio.model.Cardapio;

import java.util.ArrayList;

public class CardapioAdapter extends RecyclerView.Adapter<CardapioAdapter.CardapioViewHolder> {

    // Um array (cardapioList) para armazenar o cardapio
    private final ArrayList<Cardapio> cardapioList;
    private final Context context;

    //construtor da lista
    public CardapioAdapter(ArrayList<Cardapio> cardapioList, Context context) {
        this.cardapioList = cardapioList;
        this.context = context;
    }

    // RESPONSAVEL POR CRIAR OS ITENS DA MINHA LISTA
    @NonNull
    @Override
    public CardapioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // variavel listItem recebe o layout
        ItemcardapioBinding listItem;
        listItem = ItemcardapioBinding.inflate(LayoutInflater.from(context),parent,false);
        return new CardapioViewHolder(listItem);
    }

    // RESPONSAVEL POR EXIBIR OS ITENS DA LISTA
    @Override
    public void onBindViewHolder(@NonNull CardapioViewHolder holder, int position) {
        //passo para o binding os dados do cardapio baseado na posição da lista
        holder.binding.imgproduto.setBackgroundResource(cardapioList.get(position).getImgprod());
        holder.binding.textdescricao.setText(cardapioList.get(position).getDescricao());
        holder.binding.textingredientes.setText(cardapioList.get(position).getIngredientes());
        holder.binding.textvalor.setText(cardapioList.get(position).getValor());
    }

    // RESPONSAVEL POR VER QUANTOS ITENS TEM NA LISTA
    @Override
    public int getItemCount() {
        return cardapioList.size();
    }

    //classe ViewHolder
    public static class CardapioViewHolder extends RecyclerView.ViewHolder{

        //recupera as referencias do layout
        //variavel binding recebe o layout (layout + nome da bilioteca)
       ItemcardapioBinding binding;

       //construtor - passa layout como parametro
        public CardapioViewHolder(ItemcardapioBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
