import com.example.Animal;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.internal.matchers.Any;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    private Animal animal;
    @Spy
    private Feline feline = new Feline();
    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
            feline.eatMeat();
        }

    @Test
    public void testGetKittensCount() throws Exception {
        feline.getKittens();
        Mockito.verify(feline).getKittens(1);

    }

    @Test
    public void getFamilyTest(){
        String family = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals("Возвратилось некорректное значение семьи", expected,family);
    }

    }

