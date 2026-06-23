import be.melchior.library.model.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CategoryTest {


    @Test
    public void shouldRejectEmptyName(){
        assertThrows(IllegalArgumentException.class, () -> new Category(""));
    }


    @Test
    public void shouldRejectNullName(){
        assertThrows(IllegalArgumentException.class, () -> new Category(null));
    }
}
