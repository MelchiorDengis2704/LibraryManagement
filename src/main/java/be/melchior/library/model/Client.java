package be.melchior.library.model;

public class Client {

    private String firstName;
    private String lastName;
    private String phoneNumber;




    public Client(String firstName, String lastName, String phoneNumber){
        validate(firstName, "first name");
        validate(lastName, "last name");
        validate(phoneNumber, "phone number");

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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void validate(String value, String fieldName){
        if(value == null || value.isEmpty()){
            throw new IllegalArgumentException(fieldName + " cannot be empty");
        }
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
