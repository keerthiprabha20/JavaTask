package library;

import static org.junit.Assert.*;
import org.junit.Test;

public class LibraryTest {

    @Test
    public void testAddNewBook() {
        Library lib = new Library();
        Book b1 = new Book("TSITP", "Jenny Han", "611");
        lib.addNewBook(b1);

        assertEquals("TSITP", lib.books[0].title);
        assertEquals("Jenny Han", lib.books[0].author);
        assertEquals("611", lib.books[0].ISBN);
        assertTrue(lib.books[0].available);
    }

    @Test
    public void testIssueTheBook() {
        Library lib = new Library();
        Book b1 = new Book("TSITP", "Jenny Han", "611");
        lib.addNewBook(b1);

        boolean issued = lib.issueTheBook(0);
        assertTrue(issued);
        assertFalse(lib.books[0].available);
    }

    @Test
    public void testReturnTheBook() {
        Library lib = new Library();
        Book b1 = new Book("TSITP", "Jenny Han", "611");
        lib.addNewBook(b1);

        lib.issueTheBook(0);
        boolean returned = lib.returnTheBook(0);
        assertTrue(returned);
        assertTrue(lib.books[0].available);
    }
}
