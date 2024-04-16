package com.aluracursos.screenmatch.Main;

import com.aluracursos.screenmatch.models.Movie;
import com.aluracursos.screenmatch.models.Serie;

import java.util.ArrayList;

public class MainWClasses {
    public static void main(String[] args) {
        Movie miMovie = new Movie("The Dark Knight", 2008);
        Movie otherMovie = new Movie("Forrest Gump",1994);
        var andresMovie = new Movie("Lord of the rings",2001);
        Serie breakingBad = new Serie("Breaking Bad", 2008);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(andresMovie);
        movieList.add(miMovie);
        movieList.add(otherMovie);
    }
}
