package com.example.nurerkizilkaya.databaseexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.activeandroid.ActiveAndroid;
import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;
import com.example.nurerkizilkaya.databaseexample.models.Author;
import com.example.nurerkizilkaya.databaseexample.models.Book;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NoteActivity extends AppCompatActivity {
    @Bind(R.id.yazarID)
    EditText yazarID;
    @Bind(R.id.kitapID)
    EditText kitapID;
    @Bind(R.id.saveID)
    Button saveID;

    public Author author;
    public Book book;
    String yazarAdi;
    String kitapAdi;
    @OnClick(R.id.saveID) void saveNote()
    {

        yazarAdi=yazarID.getText().toString();
       // kitapAdi=kitapID.getText().toString();


        Author author=new Author();
        author.setName(yazarAdi);
        author.save();


        Toast.makeText(getApplicationContext(),"Kayıt eklenmiştir.",Toast.LENGTH_LONG).show();
       // final List<Author> allAuthors = new Select().all().from(Author.class).execute();
        //final List<Author> authors = new Select().from(Author.class).where("name = ?", "Bahadır AKIN").execute();

        //Toast.makeText(this, "AllAuthors Size: " + allAuthors.size() + " Authros size: " + authors.size(), Toast.LENGTH_LONG).show();

        Intent intent=new Intent(NoteActivity.this,AuthorListActivity.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        ButterKnife.bind(this);
       // new Delete().from(Author.class).execute();
    }
}


