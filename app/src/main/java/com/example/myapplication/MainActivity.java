package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();

        list.add(new DataFlags(R.drawable.ru, R.string.russia, R.string.russianRUB));
        list.add(new DataFlags(R.drawable.ir, R.string.america, R.string.americaUSD));
        list.add(new DataFlags(R.drawable.jp, R.string.japan, R.string.japanJPY));
        list.add(new DataFlags(R.drawable.cn, R.string.chine, R.string.chineCNY));

        MyListAdapter myListAdaptery = new MyListAdapter(this, list);
        listView.setAdapter(myListAdaptery);

    }
}

