package com.example.nurerkizilkaya.databaseexample;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.activeandroid.query.Select;
import com.example.nurerkizilkaya.databaseexample.adapter.CustomAdapter;
import com.example.nurerkizilkaya.databaseexample.models.Author;
import com.example.nurerkizilkaya.databaseexample.models.Book;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class AuthorListActivity extends AppCompatActivity {

    @Bind(R.id.grdList)
    RecyclerView grdList;

    public CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author_list);
        ButterKnife.bind(this);


        LinearLayoutManager ll=new LinearLayoutManager(this);
        ll.setOrientation(LinearLayoutManager.VERTICAL);
        grdList.setLayoutManager(ll);

        final List<Author> allAuthors = new Select().all().from(Author.class).execute();

        adapter=new CustomAdapter(allAuthors);
        grdList.setAdapter(adapter);

    }
}
