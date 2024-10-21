package com.campusdual.subclasses;

public class DVD extends Item{

    private String director;
    private int duration;

    public DVD(String title, String director, String publicationDate, int duration) {
        super(title, publicationDate);
        this.director = director;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    public void play() {
        System.out.println("Playing DVD: " + this.getDetails());
    }

}

