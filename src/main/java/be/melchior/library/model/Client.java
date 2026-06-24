package be.melchior.library.model;

public class Client {

    private String firstName;
    private String lastName;
    private String phoneNumber;




    public Client(String firstName, String lastName, String phoneNumber){
        if(firstName == null || firstName.isEmpty()){
            throw new IllegalArgumentException("The first name of a client can't be null or empty ");
        }
        if(lastName == null || lastName.isEmpty()){
            throw new IllegalArgumentException("The last name of a client can't be null or empty ");
        }
        if(phoneNumber == null || phoneNumber.isEmpty()){
            throw new IllegalArgumentException("The phone number of a client can't be null or empty ");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }


    @Override
    public String toString() {
        return
                "Client information" + "\n" +
                "firstName : " + this.firstName + "\n" +
                "lastName : " + this.lastName + "\n" +
                "phoneNumber : " + this.phoneNumber + "\n";
    }
}
