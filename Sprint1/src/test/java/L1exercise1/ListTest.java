package L1exercise1;
import Module4_Testing.L1exercise1.Library;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;
import java.util.List;

public class ListTest {

    @Test
    public void testNullList(){
        ArrayList<Library> libraries= new ArrayList<>();
        Library library = new Library();
        libraries.add(library);
        libraries.get(0).addBookTitle("Tom Sayer");
        assertNotNull(libraries.get(0).getBookList());
    }

    @Test
    public void testCheckListSize(){
        ArrayList<Library> libraries= new ArrayList<>();
        Library library = new Library();
        libraries.add(library);
        libraries.get(0).addBookTitle("Tom Sayer");
        libraries.get(0).addBookTitle("Tom Sayer");
        libraries.get(0).addBookTitle("Tom Sayer");
        assertEquals(3, libraries.get(0).getBookList().size());
    }

    @Test
    public void testFindBookByName(){
        int positBookFound;
        ArrayList<Library> libraries= new ArrayList<>();
        Library library = new Library();
        libraries.add(library);
        libraries.get(0).addBookTitle("Tom Sayer");
        libraries.get(0).addBookTitle("1984");
        libraries.get(0).addBookTitle("To Kill a Mockingbird");
        positBookFound = libraries.get(0).findBookByName("To Kill a Mockingbird");
        assertEquals(2, positBookFound);
    }

    @Test
    public void testDuplicateBookTitle(){
        boolean duplicateBook = false;
        ArrayList<Library> libraries= new ArrayList<>();
        Library library = new Library();
        libraries.add(library);
        libraries.get(0).addBookTitle("Tom Sayer");
        libraries.get(0).addBookTitle("1984");
        libraries.get(0).addBookTitle("To Kill a Mockingbird");
        List<String> bookList = new ArrayList<>(libraries.get(0).getBookList());
        Set<String> setBookList = new HashSet<>(bookList);
        if (setBookList.size() < bookList.size()){
            duplicateBook = true;
        }
        assertFalse(duplicateBook);
    }

    @Test
    public  void testFindBookByPos(){
        String bookByPosit;
        ArrayList<Library> libraries= new ArrayList<>();
        Library library = new Library();
        libraries.add(library);
        libraries.get(0).addBookTitle("Tom Sayer");
        libraries.get(0).addBookTitle("1984");
        libraries.get(0).addBookTitle("To Kill a Mockingbird");
        bookByPosit = libraries.get(0).findBookByPosition(2);
        assertEquals("To Kill a Mockingbird", bookByPosit);
    }

    @Test
    public void testAddBooksToTheList(){
        int idBookTFound;
        ArrayList<Library> libraries= new ArrayList<>();
        Library library = new Library();
        libraries.add(library);
        libraries.get(0).addBookTitle("Tom Sayer");
        List<String> bookList = new ArrayList<>(libraries.get(0).getBookList());
        idBookTFound = libraries.get(0).findBookByName(bookList.get(0));
        assertTrue(bookList.size() == 1 && idBookTFound == 0);
    }

    @Test
    public void removeBooksToTheList(){
        ArrayList<Library> libraries= new ArrayList<>();
        Library library = new Library();
        libraries.add(library);
        libraries.get(0).addBookTitle("Tom Sayer");
        libraries.get(0).addBookTitle("1984");
        libraries.get(0).addBookTitle("To Kill a Mockingbird");
        libraries.get(0).removeBook("1984");
        List<String> bookList = new ArrayList<>(libraries.get(0).getBookList());
        assertEquals(bookList.size(), 2);
    }

    @Test
    public void testSortedlist(){
        boolean isSorted = true;
        ArrayList<Library> libraries= new ArrayList<>();
        Library library = new Library();
        libraries.add(library);
        libraries.get(0).addBookTitle("To Kill a Mockingbird");
        libraries.get(0).addBookTitle("Tom Sayer");
        libraries.get(0).addBookTitle("1984");
        libraries.get(0).removeBook("1984");
        List<String> bookList = new ArrayList<>(libraries.get(0).getBookList());
        List<String> sortedBookList = new ArrayList<>(bookList);
        Collections.sort(sortedBookList);
        assertTrue(bookList.equals(sortedBookList));
    }
}