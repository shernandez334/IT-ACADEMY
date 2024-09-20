package Module4_Testing.L1exercise1;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Library {
    private ArrayList<String> bookList;
    private static final Logger logger = LoggerFactory.getLogger(Library.class);


    public Library(){
        this.bookList = new ArrayList<>();
    }

    public ArrayList<String> getBookList(){
        return this.bookList;
    }

    public void addBookTitle(String book){
        bookList.add(book);
    }

    public void seeBookList(){
        bookList.forEach(System.out::println);
    }

    public int getBookListSize(){
        return bookList.size();
    }

    public String findBookByPosition(int pos){
        String bookFound = "";
        try{
            bookFound = this.bookList.get(pos);
        } catch (IndexOutOfBoundsException e){
            logger.error("Error: Book position {} (1-based) is out of bounds. List size: {} (0-based). Exception: {}",
                    pos, bookList.size(), e.getMessage(), e);
        }
        return bookFound;
    }

    public void addBookByPosition(String bookTitle, int pos){
        try {
            bookList.add(pos - 1, bookTitle);
        } catch (IndexOutOfBoundsException e){
            logger.error("Error: Book position {} (1-based) is out of bounds. List size: {} (0-based). Exception: {}",
                    pos, bookList.size(), e.getMessage(), e);
        }
    }

    public int findBookByName(String bookTitle){
        return bookList.indexOf(bookTitle);
    }

    public String removeBook(String bookTitle){
        String answer = "";
        int idBookFound = findBookByName(bookTitle);
        if (idBookFound == -1){
            answer = "There are no books with that name.";
        } else{
            bookList.remove(idBookFound);
            answer = "The book" + bookTitle + " has been deleted from the list.";
        }
        return answer;
    }

}
