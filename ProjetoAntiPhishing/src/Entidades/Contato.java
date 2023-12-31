package Entidades;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
public class Contato extends Pessoa {
    
    private Date creationDate = new java.util.Date(System.currentTimeMillis());
    private ArrayList<Date> updates = new ArrayList<Date>(Arrays.asList(new java.util.Date(System.currentTimeMillis())));

    public Contato(String nome, String email, Integer telefone) {
        super(nome, email, telefone);
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public ArrayList<Date> getUpdates() {
        return updates;
    }

    @Override
    public String toString() {
        return "Contato [nome= " + nome + ", \n creationDate=" + creationDate + ", \n updates=" + updates + "]";
    }

    
    
    
}
