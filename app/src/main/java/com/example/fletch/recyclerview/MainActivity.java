package com.example.fletch.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView rv = (RecyclerView) findViewById(R.id.recyclerView_main);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new MainAdapter(new String[] { "Pierre"
                , "Jean", "Jacques", "Adil", "Kevin", "Simon", "Anthony", "Mohammed"
                , "Cédric", "Antoine", "Jonathan", "George", "Jean-François", "Medhi"
                , "Samir"}));

    }
}
