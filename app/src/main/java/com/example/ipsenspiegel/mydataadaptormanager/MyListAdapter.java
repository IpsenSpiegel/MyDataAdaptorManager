package com.example.ipsenspiegel.mydataadaptormanager;

import android.content.ClipData;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by A5Alumno on 29/11/2016.
 */

public class MyListAdapter extends ArrayAdapter <Item> {
    Context mContext;
    ArrayList<Item> mitemList;

    public MyListAdapter(Context context, int resource, ArrayList<Item> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mitemList = objects;
    }



    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        super.getView(position, convertView, parent);

        LayoutInflater inflater = (LayoutInflater) this.mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.list_view_custom_layout, null);
        //hasta aqui todas las filas son iguales y ahora toca modificar los campos




        return convertView;
    }
}
