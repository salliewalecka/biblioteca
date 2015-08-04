package com.thoughtworks.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class Library {

    private PrintStream printStream;
    private ArrayList<String> books;

    public Library(PrintStream printStream) {

        this.printStream = printStream;
        books = new ArrayList<>();
    }

    public void welcome() {
        printStream.println("Welcome!");
    }


    public void listBooks() {
        String ret = "";
        for (String s: books) {
            ret += s + " \n";
        }

        printStream.println(ret);
    }

    public void addBook(String s) {
        books.add(s);
    }
}
