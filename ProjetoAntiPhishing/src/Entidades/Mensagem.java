package Entidades;

import java.util.Date;

import java.util.UUID; //Example: 54947df80e9e4471a2f99af509fb5889

public class Mensagem {
    private String corpo;
    private Pessoa pessoa;
    private String token = UUID.randomUUID().toString().replaceAll("-", "");
    private Date date = new java.util.Date(System.currentTimeMillis());
    private String contactType; // Informar se o contato é via email ou telefone(sms).
    
    
    public Mensagem(String corpo, Pessoa pessoa, String contactType) {
        this.corpo = corpo;
        this.pessoa = pessoa;
        this.contactType = contactType;

        if (contactType != "email" & contactType != "telefone" & contactType != "Email e Telefone") {
            throw new IllegalArgumentException("Necessário selecionar email, telefone ou email e telefone");}

    }


    @Override
    public String toString() {
        return "Mensagem [corpo= " + corpo + ", \n pessoa=" + pessoa.toString() + ", \n token=" + token + ", \n date=" + date
                + ", contactType=" + contactType + "]";
    }

    

    
}