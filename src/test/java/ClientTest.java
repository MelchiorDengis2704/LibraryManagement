import be.melchior.library.model.Client;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ClientTest {


    @Test
    public void shouldRejectEmptyFirstName() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Client("", "Dengis", "0493911842")
        );
    }

    @Test
    public void shouldRejectEmptyLastName() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Client("Melchior", "", "0493911842")
        );
    }

    @Test
    public void shouldRejectEmptyPhoneNumber() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Client("Melchior", "Dengis", "")
        );
    }

    @Test
    public void shouldRejectNullFirstName() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Client(null, "Dengis", "0493911842")
        );
    }

    @Test
    public void shouldRejectNullLastName() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Client("Melchior", null, "0493911842")
        );
    }

    @Test
    public void shouldRejectNullPhoneNumber() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Client("Melchior", "Dengis", null)
        );
    }

}
