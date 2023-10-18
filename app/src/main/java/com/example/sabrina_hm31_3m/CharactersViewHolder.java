package com.example.sabrina_hm31_3m;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CharactersViewHolder extends RecyclerView.ViewHolder {

    private TextView tvName;
    public CharactersViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tv_name);

    }

    public void onBind(String charactersName){
        tvName.setText(charactersName);
    }
}
