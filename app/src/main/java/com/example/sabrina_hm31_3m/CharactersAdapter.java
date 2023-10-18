package com.example.sabrina_hm31_3m;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CharactersAdapter extends RecyclerView.Adapter<CharactersViewHolder> {

    private ArrayList<String> charactersNameList;

    public CharactersAdapter(ArrayList<String> charactersNameList) {
        this.charactersNameList = charactersNameList;
    }

    @NonNull
    @Override
    public CharactersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CharactersViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_characters, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CharactersViewHolder holder, int position) {
        holder.onBind(charactersNameList.get(position));
    }

    @Override
    public int getItemCount() {
        return charactersNameList.size();
    }
}
