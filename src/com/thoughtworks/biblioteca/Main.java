package com.thoughtworks.biblioteca;

public class Main {

    public static void main(String[] args) {
        Library library = new Library(System.out);
        library.welcome();
        library.addBook("A Tree Grows in Brooklyn");
        library.addBook("The Wind-up Bird Chronicle");
        library.listBooks();


    }
}
