package com.company.library;

public class Book extends Edition {

    protected final String genre;

    protected final String bookName;

    protected int volume;

    protected Book(int pageNumber, Author author, String printingHouse, int publishingYear, String genre, String bookName) {

        this(pageNumber, author, printingHouse, publishingYear, genre, bookName, 0);
    }

    @Override
    public String toString() {
        return "Book{" +
                "genre='" + genre + '\'' +
                ", bookName='" + bookName + '\'' +
                ", volume=" + volume +
                ", author=" + author +
                ", printingHouse='" + printingHouse + '\'' +
                ", publishingYear=" + publishingYear +
                '}';
    }

    protected Book(int pageNumber, Author author, String printingHouse, int publishingYear, String genre, String bookName, int volume) {
        super(pageNumber, author, printingHouse, publishingYear);
        this.genre = genre;
        this.bookName = bookName;
        this.volume = volume;
    }


    public String getGenre() {
        return genre;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getBookName() {
        return bookName;
    }


}
