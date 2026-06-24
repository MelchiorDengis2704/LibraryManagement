package be.melchior.library.model;

import java.time.LocalDate;

public class Loan {

    private LocalDate taked;
    private LocalDate returned;
    private Client client;
    private Book book;

    public Loan(LocalDate taked, Client client, Book book){
        if(taked == null){
            throw new IllegalArgumentException("A borrow can't have a empty taked field");
        }
        if(client == null){
            throw new IllegalArgumentException("A borrow can't have a empty client field");
        }
        if(book == null){
            throw new IllegalArgumentException("A borrow can't have a empty book field");
        }
        this.taked = taked;
        this.client = client;
        this.book = book;
    }

    public LocalDate getTaked() {
        return this.taked;
    }

    public LocalDate getReturned() {
        return this.returned;
    }

    public Client getClient() {
        return this.client;
    }

    public Book getBook() {
        return this.book;
    }

    @Override
    public String toString() {
        return
                "Loan information" + "\n" +
                        "Client firstName : " + this.client.getFirstName() + "\n" +
                        "Client lastName : " + this.client.getLastName() + "\n" +
                        "Client phoneNumber : " + this.client.getPhoneNumber() + "\n" +
                        "Book title : " + this.book.getTitle() + "\n" +
                        "Book category : " + this.book.getCategory() + "\n" +
                        "Book date borrowed : " + this.getTaked() + "\n" +
                        "Book date returned : " + this.getReturned() + "\n";

    }


}
