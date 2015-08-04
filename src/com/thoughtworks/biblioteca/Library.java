package com.thoughtworks.biblioteca;

import java.io.PrintStream;

public class Library {

    private PrintStream printStream;

    public Library(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void welcome() {
        printStream.println("Welcome!");
    }


}
