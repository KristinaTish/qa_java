import com.example.Animal;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    private Animal animal;
    @Spy
    private Feline feline = new Feline();

    @Test
    public void eatMeatTest() throws Exception {
        List<String> foodList = List.of("Животные", "Птицы", "Рыба");
        Feline feline = new Feline();
         Mockito.when(animal.getFood("Хищник")).thenReturn(foodList);
        List<String> actual = feline.eatMeat();
        assertEquals("Список еды не совпадает", foodList, actual);
    }

    @Test
    public void testGetKittensCount() throws Exception {
        feline.getKittens();
        Mockito.verify(feline).getKittens(1);
    }

    @Test
    public void getFamilyTest() {
        String family = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals("Возвратилось некорректное значение семьи", expected, family);
    }
}

