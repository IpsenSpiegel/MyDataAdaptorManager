package com.example.ipsenspiegel.mydataadaptormanager;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by A5Alumno on 29/11/2016.
 */

public class MyListAdapterRecycler extends RecyclerView.Adapter<MyListAdapterRecycler.ViewHolder>{



    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imgView;
        public TextView tvTitle;
        public TextView tvBody;

        public ViewHolder(View rowView) {
            super(rowView);

            //para hacerlos clicables tenemos que
            this.imgView = (ImageView) rowView.findViewById(R.id.img_view_custom_row_layout);
            this.tvTitle = (TextView) rowView.findViewById(R.id.tv_title_custom_row_layout);
            this.tvBody = (TextView) rowView.findViewById(R.id.textViewBody);
        }
    }

    Context mContext;
    List<Item> mItemList;

    MyListAdapterRecycler(Context context, List<Item> itemList) {
        this.mContext = context;
        this.mItemList = itemList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View viewRow = LayoutInflater.from(this.mContext).inflate(R.layout.list_view_custom_layout, parent, false);
        //clicables
        viewRow.setOnClickListener(new View.OnClickListener(){
                                       @Override
                                       public void onClick(View whichview) {

                                       }
                                   }


        );

        ViewHolder viewHolder = new ViewHolder(viewRow);


                return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

       // holder.imgView.setImageResource();
        holder.tvTitle.setText(this.mItemList.get(position).getmTitle());


    }


    @Override
    public int getItemCount() {
        return mItemList.size();
    }
}
