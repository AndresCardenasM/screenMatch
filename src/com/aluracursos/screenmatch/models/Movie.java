package com.aluracursos.screenmatch.models;
//When Movie was moved to a new package, set access modifier (public,private)

public class Movie extends TItle{
    private  String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
