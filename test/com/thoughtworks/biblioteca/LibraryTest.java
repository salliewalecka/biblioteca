package com.thoughtworks.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LibraryTest {

    @Test
    public void shouldPrintWelcomeWhenLibraryIsOpened() {
        PrintStream printStream = mock(PrintStream.class);
        Library library = new Library(printStream);

        library.welcome();

        verify(printStream).println("Welcome!");
    }

}
