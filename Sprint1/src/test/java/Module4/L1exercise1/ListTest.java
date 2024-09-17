package Module4.L1exercise1;
import Module4_Testing.L1exercise1.Library;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;
import java.util.List;

public class ListTest {

    Library lib;
    @Before
    public void setUp(){
        lib = new Library();
        lib.addBookTitle("Tom Sawyer");
        lib.addBookTitle("1984");
        lib.addBookTitle("To Kill a Mockingbird");
    }

    @Test
    public void testNullList(){
        assertNotNull("The list is  ot null.", lib.getBookList());
    }

    @Test
    public void testCheckListSize(){
        assertEquals(3, lib.getBookListSize());
    }

    @Test
    public void testFindBookByName(){
        assertEquals(2, lib.findBookByName("To Kill a Mockingbird"));
    }

    @Test
    public void testDuplicateBookTitle(){
        Set<String> uniqueBooks = new HashSet<>(lib.getBookList());
        assertEquals(uniqueBooks.size(), lib.getBookListSize());
    }

    @Test
    public  void testFindBookByPos(){
        assertEquals("To Kill a Mockingbird", lib.findBookByPosition(2));
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
}