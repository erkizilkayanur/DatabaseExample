package com.example.nurerkizilkaya.databaseexample.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nurerkizilkaya.databaseexample.R;
import com.example.nurerkizilkaya.databaseexample.models.Author;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by a s u s on 28.9.2017.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder>{

    public List<Author> data;

    public CustomAdapter(List<Author> data)
    {
        this.data=data;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.item_list_authors, parent, false);

        return new CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {

        Author t=data.get(position);
        holder.authorId.setText(t.getName().toString());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder {

       @Bind(R.id.authorId)
       TextView authorId;
       @Bind(R.id.bookId)
       TextView bookId;
       public CustomViewHolder(View itemView) {
           super(itemView);
           ButterKnife.bind(this,itemView);
       }
   }
}
