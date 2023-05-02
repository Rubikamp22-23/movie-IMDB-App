package com.example.movieapp.model;

public class MovieModel {


    private String imageUrl;
    private String movieWorkName;


    public MovieModel(String imageUrl , String movieWorkName){

        this.imageUrl=imageUrl;
        this.movieWorkName=movieWorkName;

    }

    public String getImageUrl(){

        return imageUrl;
    }

    public void setImageUrl(String imageUrl){

        this.imageUrl=imageUrl;

    }

    public String getMovieName(){

        return getMovieName();
    }
    public void setMovieName(String movieWorkName){

        this.movieWorkName=movieWorkName;
    }
}


