import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class LionTest {
    private String type = "unknown";


    @Test
    public void unsupportableAnimalKind(){
        Feline feline = new Feline();
       try {
           Lion lion = new Lion(feline, type);
           fail("Expected Exception to be thrown");
       }
     catch (Exception e){
           assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
     }
    }
}

