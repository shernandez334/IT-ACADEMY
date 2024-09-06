package Module1_Patterns.L2Exercise1;

import java.util.ArrayList;
import java.util.List;

public class ContactApp{
    private List<Contacts> contacts;

    public ContactApp(){
        this.contacts = new ArrayList<>();
    }

    public List<Contacts> getContacts(){
        return this.contacts;
    }

}
