package org.example.week3;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean borrowed;
    private int numberOfPages;

    public Book(String title, String author, int publicationYear, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.numberOfPages = numberOfPages;
        borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void intermediateSetter(int numberOfPages){
        setNumberOfPages(numberOfPages);
    }

    private void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear='" + publicationYear + '\'' +
                ", numberOfPages='" + numberOfPages + '\'' +
                ", borrowed=" + borrowed +
                '}';
    }


}