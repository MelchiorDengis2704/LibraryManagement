package be.melchior.library.model;

import java.time.LocalDate;

public class Loan {

    private LocalDate taked;
    private LocalDate returned;
    private Client client;
    private Book book;

    public Loan(LocalDate taked, Client client, Book book){
        if(taked == null){
            throw new IllegalArgumentException("A borrow can't have a taked date empty ");
        }
        this.taked = taked;
        this.client = client;
        this.book = book;
    }

    public LocalDate getTaked() {
        return taked;
    }

    public LocalDate getReturned() {
        return returned;
    }

    public Client getClient() {
        return client;
    }

    public Book getBook() {
        return book;
    }

    @Override
    public String toString() {
        return
                "Loan information" + "\n" +
                        "Client firstName : " + client.getFirstName() + "\n" +
                        "Client lastName : " + client.getLastName() + "\n" +
                        "Client phoneNumber : " + client.getPhoneNumber() + "\n" +
                        "Book title : " + book.getTitle() + "\n" +
                        "Book category : " + book.getCategory() + "\n" +
                        "Book date borrowed : " + this.getTaked() + "\n" +
                        "Book date returned : " + this.getReturned() + "\n";

    }


}
