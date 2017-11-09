package ru.kuzmiankou.whattowatch;

import java.util.List;
import java.util.ArrayList;

public class SeriesList {
    List<String> getGenre(String spinner) {
        List<String> genre = new ArrayList<String>();
        if(spinner.equals("comedy")) {
            genre.add("Friends");
        }
        if(spinner.equals("fantasy")) {
            genre.add("Game of Thrones");
        }
        if(spinner.equals("horror")) {
            genre.add("Call");
        }
        if(spinner.equals("fantastic")) {
            genre.add("Star Trek, Discovery");
        }
        if(spinner.equals("crime")) {
            genre.add("Breaking bad");
        }
        return genre;
    }
}
