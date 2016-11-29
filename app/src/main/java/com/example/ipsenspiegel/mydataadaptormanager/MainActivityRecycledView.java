package com.example.ipsenspiegel.mydataadaptormanager;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivityRecycledView extends AppCompatActivity {

    private static final String TAG = MainActivityRecycledView.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_with_cecycler_view);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view_main);

        String[] mListValues = {"Android", "iPhone", "WindowsMobile", "Blackberry", "WebOS", "Ubuntu",
                "Windows 7", "Max OS X", "Linux", "OS/2", "Ubuntu", "Windows 7", "Max OS X", "Linux,",
                "Ubuntu", "Windows 7", "Max OS X", "Linux", "OS/2", "Android", "iPhone", "WindowsMobile"};

        List<Item> listItem = new ArrayList<>();

        for (int idx=0; idx < mListValues.length; idx++) {
            listItem.add(new Item("@mipmap/ic_launcher", mListValues[idx], " "));
        }

        //el mira el tamaño y lo ahce fijo (lo optimiza)
        recyclerView.setHasFixedSize(true);


        //cambiable a gridlayout
        recyclerView.setLayoutManager(new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false));
//el último atributo hace que sea una lista circular


        recyclerView.setAdapter(new MyListAdapterRecycler(this, listItem));

    }

}
