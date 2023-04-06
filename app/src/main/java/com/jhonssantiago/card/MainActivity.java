package com.jhonssantiago.card;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<Pessoa> myDataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.myRecyclerView);
        recyclerView.setHasFixedSize(true);
        myDataset = new ArrayList<>();
        Pessoa p1 = new Pessoa("Jhon", 25, "Uma Pessoa");
        Pessoa p2= new Pessoa("Duda", 25, "Uma Pessoa");
        Pessoa p3= new Pessoa("Duda", 25, "Uma Pessoa");
        Pessoa p4 = new Pessoa("Duda", 25, "Uma Pessoa");
        Pessoa p5 = new Pessoa("Duda", 25, "Uma Pessoa");
        Pessoa p6 = new Pessoa("Duda", 25, "Uma Pessoa");
        Pessoa p7 = new Pessoa("Duda", 25, "Uma Pessoa");
        Pessoa p8 = new Pessoa("Duda", 25, "Uma Pessoa");
        myDataset.add(p1);
        myDataset.add(p2);
        myDataset.add(p3);
        myDataset.add(p4);
        myDataset.add(p5);
        myDataset.add(p6);
        myDataset.add(p7);
        myDataset.add(p8);



        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(myDataset);
        recyclerView.setAdapter(mAdapter);
    }


}