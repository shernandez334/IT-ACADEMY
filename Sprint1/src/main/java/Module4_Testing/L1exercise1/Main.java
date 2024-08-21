package Module4_Testing.L1exercise1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Library> libraries = new ArrayList<>();
        Library library = new Library();
        libraries.add(library);

        libraries.get(0).addBookTitle("To Kill a Mockingbird");
        libraries.get(0).addBookTitle("La Colmena");
    }
}
