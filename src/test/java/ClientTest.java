import be.melchior.library.model.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {

    private Client client;

    @BeforeEach
    public void createClient(){
        client = new Client("Melchior", "Dengis", "0493911842");
    }


    @Test
    public void clientShouldHaveAFirstName(){
        assertEquals("Melchior", client.getFirstName());
    }

    @Test
    public void clientShouldHaveALastName(){
        assertEquals("Dengis", client.getLastName());
    }

    @Test
    public void clientShouldHaveAPhoneNumber(){
        assertEquals("0493911842", client.getPhoneNumber());
    }

    @Test
    public void clientFirstNameShouldChange(){
        client.setFirstName("Thomas");
        assertEquals("Thomas", client.getFirstName());
    }

    @Test
    public void clientLastNameShouldChange(){
        client.setLastName("Dangis");
        assertEquals("Dangis", client.getLastName());
    }

    @Test
    public void clientPhoneNumberShouldChange(){
        client.setPhoneNumber("0492981850");
        assertEquals("0492981850", client.getPhoneNumber());
    }
}
