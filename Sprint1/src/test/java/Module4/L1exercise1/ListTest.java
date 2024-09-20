package Module4.L1exercise1;
import Module4_Testing.L1exercise1.Library;
import java.util.*;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListTest {

    Library lib;
    @BeforeEach
    public void setUp(){
        lib = new Library();
        lib.addBookTitle("1984");
        lib.addBookTitle("To Kill a Mockingbird");
        lib.addBookTitle("Tom Sawyer");
    }

    @Test
    public void testNullList(){
        assertFalse(lib.getBookList().isEmpty());
    }

    @Test
    public void testCheckListSize(){
        assertEquals(3, lib.getBookListSize());
    }

    @Test
    public void testFindBookByName(){
        assertEquals(1, lib.findBookByName("To Kill a Mockingbird"));
    }

    @Test
    public void testDuplicateBookTitle(){
        Set<String> uniqueBooks = new HashSet<>(lib.getBookList());
        assertEquals(uniqueBooks.size(), lib.getBookListSize());
    }

    @Test
    public void testFindBookByPos(){
        assertEquals("Tom Sawyer", lib.findBookByPosition(2));
    }

    @Test
    public void testAddBooksToTheList(){
        lib.addBookTitle("Moby Dick");
        assertEquals(4, lib.getBookListSize());
    }

    @Test
    public void removeBooksToTheList(){
        lib.removeBook("Moby Dick");
        assertEquals(lib.getBookListSize(), 3);
    }

    @Test
    public void testSortedlist(){
        List<String> sortedBookList = lib.getBookList().stream()
                .sorted().toList();
        assertEquals(sortedBookList, lib.getBookList());
    }

    @Test
    public void testAddBookByPos(){
        lib.addBookByPosition("Dune", 3);
        assertEquals("Dune", lib.findBookByPosition(2));
    }

    @Test
    public void testAddBookByPosInvalid(){
        lib.addBookByPosition("Invalid Book", 10);
    }
}