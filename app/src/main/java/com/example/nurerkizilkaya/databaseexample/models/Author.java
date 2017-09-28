package com.example.nurerkizilkaya.databaseexample.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.List;

/**
 * Created by a s u s on 27.9.2017.
 */

    @Table(name = "authors")
    public class Author extends Model {

        @Column(name = "name")
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Book> getBooks(){
            return this.getMany(Book.class, "author");
        }
    }

