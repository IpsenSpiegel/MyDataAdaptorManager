package com.example.ipsenspiegel.mydataadaptormanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    private static final String TAG_MAIN_ACTIVITY = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView mListView = (ListView) this.findViewById(R.id.listViewMain);

        String[] mListValues = {"Android", "iPhone", "WindowsMobile", "Blackberry", "WebOS", "Ubuntu",
                "Windows 7", "Max OS X", "Linux", "OS/2", "Ubuntu", "Windows 7", "Max OS X", "Linux,",
                "Ubuntu", "Windows 7", "Max OS X", "Linux", "OS/2", "Android", "iPhone", "WindowsMobile"};


        mListView.setOnItemClickListener(this);
        mListView.setOnItemLongClickListener(this);

        /*
        mListView.setAdapter(new ArrayAdapter<String>(
         this,
                android.R.layout.simple_list_item_1
                listValues);
        );
*/

        List<Item> listItem = new ArrayList<>();

        for (int idx=0; idx < mListValues.length; idx++) {
            listItem.add(new Item("@mipmap/ic_launcher", mListValues[idx], ""));
        }



       // mListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mListValues));
            mListView.setAdapter(new MyListAdapter(this, 0, listItem));
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View whichView, int position, long id) {
        Log.d(TAG_MAIN_ACTIVITY, "on Item Clicked");
        Toast.makeText(this, "Element " + position + " with ID = " + id, Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id)
    {
        Log.i(MainActivity.TAG_MAIN_ACTIVITY, "Element " + position + ", with ID = " + id + "long-clicked");
        Toast.makeText(this, "Element " + position + ", with ID = " + id + " long-clicked", Toast.LENGTH_SHORT).show();

        return true;
    }
}