package com.example.sabrina_hm31_3m;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> charactersNameList = new ArrayList<>();
    private RecyclerView rvCharacters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initVeiw();
        loadData();
    }

    private void loadData() {
        charactersNameList.add("Tartaglia");
        charactersNameList.add("Albedo");
        charactersNameList.add("Charlotte");
        charactersNameList.add("Furina");
        charactersNameList.add("Neuvillette");
        charactersNameList.add("Freminet");
        charactersNameList.add("Lyney");
        charactersNameList.add("Lynette");
        charactersNameList.add("Dainsleif");
        charactersNameList.add("Scaramouche");
        charactersNameList.add("Shenhe");
        charactersNameList.add("Columbina");
        charactersNameList.add("Arlecchino");
        charactersNameList.add("Kokomi");
        charactersNameList.add("Yae Miko");
        initAdapter();
    }

    private void initAdapter() {
        CharactersAdapter adapter = new CharactersAdapter(charactersNameList);
        rvCharacters.setAdapter(adapter);
    }

    private void initVeiw() {
        rvCharacters = findViewById(R.id.rv_characters);
    }
}