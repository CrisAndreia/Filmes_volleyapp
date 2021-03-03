package com.crispereira.volleyapp.database;

import androidx.annotation.NonNull;
import androidx.room.Entity;

@Entity(primaryKeys = {"title"})

public class Filme {
    @NonNull
    String title;
    int year;
    String plot;
    String cartazURL;

    public Filme(@NonNull String title, @NonNull int year, @NonNull String plot, @NonNull String cartazURL) {
        this.title = title;
        this.year = year;
        this.plot= plot;
        this.cartazURL = cartazURL;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getPlot(){
        return plot;
    }
}
