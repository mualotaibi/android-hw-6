package com.example.cw_6;

public class movie {
    private String title ;
    private String mainActor ;
    private Double movieRate;
    private int pgRate ;
    private String genre ;

    public movie(String title, String mainActor, double movieRate, int pgRate , String genre){
        this.title= title;
        this.mainActor=mainActor;
        this.movieRate=movieRate;
        this.pgRate=pgRate;
        this.genre=genre;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }


    public String getMainActor() {
        return  mainActor;
    }

    public void setMainActor(String MainActor) {
        this.mainActor = MainActor;
    }

    public Double getMovieRate(){
        return movieRate;
    }

    public void setMovieRate(Double movieRate) {
        this.movieRate = movieRate ;
    }

    public int getPgRate(){
        return pgRate;
    }
    public void setPgRate(int pgRate){
        this.pgRate = pgRate;
    }

    public String getGenre () {
        return genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }



}
