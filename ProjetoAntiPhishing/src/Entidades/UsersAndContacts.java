package Entidades;

import java.util.ArrayList;

public class UsersAndContacts {
    ArrayList<Pessoa> UsersAndContacts = new ArrayList<Pessoa>();
    
    public UsersAndContacts(){
        UsersAndContacts.add(new Contato("Kassio", "kassio@bankapp.com", 999999999));
        UsersAndContacts.add(new Contato("Kelvin", "kelvin@bankapp.com", 999999999));
        UsersAndContacts.add(new Contato("Levi", "levi@bankapp.com", 999999999));
    }

    public ArrayList<Pessoa> getUsersAndContacts() {
        return UsersAndContacts;
    }
    
}
