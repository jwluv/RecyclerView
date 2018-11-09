package com.example.edu.recyclerview;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerAdapter adapter;
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<HashMap<String,Object>> arrayList = new ArrayList<HashMap<String,Object>>();
        HashMap<String,Object> hashMap = null;
        hashMap = new HashMap<String,Object>();
        hashMap.put("title", "Chapter Two");
        hashMap.put("detail", "Item two details");
        hashMap.put("image", R.drawable.android_image_1);
        arrayList.add(hashMap);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        floatingActionButton = (FloatingActionButton)findViewById(R.id.floatingActionButton);
        floatingActionButton.setOnClickListener(this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapter(arrayList);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        HashMap<String,Object> hashMap = new HashMap<String,Object>();
        hashMap.put("title", "Chapter one");
        hashMap.put("image", R.drawable.android_image_2);
        adapter.addItem(1,hashMap);
    }
}
