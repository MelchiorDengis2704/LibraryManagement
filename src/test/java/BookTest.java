import be.melchior.library.model.Book;
import be.melchior.library.model.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BookTest {


    @Test
    public void shouldRejectEmptyTitle(){
        assertThrows(IllegalArgumentException.class, () -> new Book("", new Category("Science-Fiction")));
    }


    @Test
    public void shouldRejectNullTitle(){
        assertThrows(IllegalArgumentException.class, () -> new Book(null,  new Category("Science-Fiction")));
    }
}
