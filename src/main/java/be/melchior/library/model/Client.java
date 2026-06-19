package be.melchior.library.model;

public class Client {

    private String firstName;
    private String lastName;
    private String phoneNumber;




    public Client(String firstName, String lastName, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getfirstName(){
        return this.firstName;
    }

    public String getLastname(){
        return this.lastName;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }


    @Override
    public String toString() {
        return
                "Client information" + "\n" +
                "firstName : " + firstName + "\n" +
                "lastName : " + lastName + "\n" +
                "phoneNumber : " + phoneNumber + "\n";
    }
}
