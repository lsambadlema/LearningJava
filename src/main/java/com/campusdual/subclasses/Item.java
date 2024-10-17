package com.campusdual.subclasses;

public class Item {
    private String title;
    private String publicationDate;
    private boolean checkedOut = false;

    public Item(String title, String publicationDate) {
        this.title = title;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getDetails() {
        return "Title: " + this.title + ", Publication date: " + this.publicationDate + ", Checked Out: " + this.checkedOut;
    }
}
