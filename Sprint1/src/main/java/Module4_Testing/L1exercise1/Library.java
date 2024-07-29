package Module4_Testing.L1exercise1;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Comparator;

import static org.junit.Assert.assertFalse;


public class Library {
    private ArrayList<String> bookList;

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

    public String findBookByPosition(int pos){
        return this.bookList.get(pos);
    }

    public void addBookByPosition(String bookTitle, int pos){
        bookList.add(pos, bookTitle);
    }

    public int findBookByName(String bookTitle){
        int i = 0;
        int idBookFound = -1;
        boolean idFoundBook = false;
        while (i < this.bookList.size() && !idFoundBook){
            if (bookTitle.equalsIgnoreCase(bookList.get(i))){
                idBookFound = i;
                idFoundBook = true;
            }
            i++;
        }
        return idBookFound;
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
