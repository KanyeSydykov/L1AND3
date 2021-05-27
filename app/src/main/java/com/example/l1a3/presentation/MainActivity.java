package com.example.l1a3.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

import android.os.Bundle;

import com.example.l1a3.R;
import com.example.l1a3.databinding.ActivityMainBinding;
import com.example.l1a3.domain.Card;

public class MainActivity extends AppCompatActivity  {
    ActivityMainBinding binding;
    private RecyclerView recyclerView;
    private EmojiAdapter emojiAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.cards);
        emojiAdapter = new EmojiAdapter();
        recyclerView.setAdapter(emojiAdapter);
    }


}