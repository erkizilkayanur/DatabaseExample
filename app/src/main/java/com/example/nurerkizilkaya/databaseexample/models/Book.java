package com.example.nurerkizilkaya.databaseexample.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.List;

/**
 * Created by a s u s on 27.9.2017.
 */
    @Table(name = "books")
    public class Book extends Model {

        @Column(name = "name")
        private String name;

        @Column(name = "author")
        private Author author;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }
}

