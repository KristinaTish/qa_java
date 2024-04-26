import com.example.Feline;
import com.example.Lion;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LionTest {
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void unsupportableSexThrowsException() throws Exception {
        final String type = "unknown";
        final String message = "Используйте допустимые значения пола животного - самец или самка";

        Feline feline = new Feline();

        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage(message);

        Lion lion = new Lion(feline, type);
    }
}

