package Entidades;

public abstract class Pessoa {
    protected String nome;
    protected String email;
    protected Integer telefone;
    public Pessoa(String nome, String email, Integer telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    
}
