package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LibraryTest {

    private Library library;
    private PrintStream printStream;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        library = new Library(printStream);
    }

    @Test
    public void shouldPrintWelcomeWhenLibraryIsOpened() {

        library.welcome();
        verify(printStream).println("Welcome!");
    }


    @Test
    public void shouldPrintNothingWhenNoBooks() {

        library.listBooks();
        verify(printStream).println(contains(""));
    }

    @Test
    public void shouldPrintBookWhenOneBook() {

        library.addBook("A Tree Grows in Brooklyn");
        library.listBooks();

        verify(printStream).println(contains("A Tree Grows in Brooklyn"));
    }

    @Test
    public void shouldPrintBooksWhenTwoBooks() {
        // note: doesn't verify that list is printed in order

        library.addBook("A Tree Grows in Brooklyn");
        library.addBook("The Wind-up Bird Chronicle");
        library.listBooks();

        verify(printStream).println(contains("A Tree Grows in Brooklyn"));
        verify(printStream).println(contains("The Wind-up Bird Chronicle"));
    }

}
