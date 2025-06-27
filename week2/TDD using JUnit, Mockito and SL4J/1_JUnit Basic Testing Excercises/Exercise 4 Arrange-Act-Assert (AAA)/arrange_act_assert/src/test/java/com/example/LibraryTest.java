package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    private Library library;

    @Before
    public void setUp() {
        System.out.println("\n--- Setting up test fixtures ---");
        library = new Library();
        library.addBook("The Alchemist");
        library.addBook("To Kill a Mockingbird");
        System.out.println("Test fixtures ready: Books added: The Alchemist, To Kill a Mockingbird");
    }

    @After
    public void tearDown() {
        System.out.println("--- Cleaning up test fixtures ---");
        library.clearLibrary();
        System.out.println("Test fixtures cleaned up\n");
    }

    @Test
    public void testBookIsAvailable() {
        System.out.println("TEST: testBookIsAvailable");
        boolean result = library.isBookAvailable("The Alchemist");
        assertTrue(result);
        System.out.println("✓ Book availability test passed");
    }

    @Test
    public void testBookIsNotAvailable() {
        System.out.println("TEST: testBookIsNotAvailable");
        boolean result = library.isBookAvailable("Harry Potter");
        assertFalse(result);
        System.out.println("✓ Non-existent book check passed");
    }

    @Test
    public void testRemoveBook() {
        System.out.println("TEST: testRemoveBook");
        library.removeBook("The Alchemist");
        boolean result = library.isBookAvailable("The Alchemist");
        assertFalse(result);
        System.out.println("✓ Book removal test passed");
    }

    @Test
    public void testAddBook() {
        System.out.println("TEST: testAddBook");
        library.addBook("1984");
        boolean result = library.isBookAvailable("1984");
        assertTrue(result);
        System.out.println("✓ Book addition test passed");
    }
}
