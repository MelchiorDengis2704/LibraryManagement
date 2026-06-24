import be.melchior.library.model.Book;
import be.melchior.library.model.Category;
import be.melchior.library.model.Client;
import be.melchior.library.model.Loan;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class LoanTest {


    @Test
    public void shouldRejectEmptyTakedDate(){
        assertThrows(IllegalArgumentException.class, () -> new Loan(null, new Client("Melchior", "Dengis","0493911842"), new Book("La vie de rêve", new Category("Développement personnel"))));
    }


    @Test
    public void shouldRejectEmptyClient(){
        assertThrows(IllegalArgumentException.class, () -> new Loan(LocalDate.now(), null, new Book("La vie de rêve", new Category("Développement personnel"))));
    }

    @Test
    public void shouldRejectEmptyBook(){
        assertThrows(IllegalArgumentException.class, () -> new Loan(LocalDate.now(), new Client("Melchior", "Dengis", "0493911842"), null));
    }
}
