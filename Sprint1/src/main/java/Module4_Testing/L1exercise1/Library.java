package Module4_Testing.L1exercise1;
import java.util.ArrayList;


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

    public int getBookListSize(){
        return bookList.size();
    }

    public String findBookByPosition(int pos){
        String bookFound = "";
        try{
            bookFound = this.bookList.get(pos);
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        return bookFound;
    }

    public void addBookByPosition(String bookTitle, int pos){
        try {
            bookList.add(pos - 1, bookTitle);
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
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
