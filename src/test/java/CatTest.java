import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Test
   public void  getSoundTest() {
        String expectedSound = "Мяу";
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String meow = cat.getSound();
        assertEquals("Звук не совпадает с ожидаемым", expectedSound, meow);
    }

    @Mock
    private Feline feline;

    @Test
    public void catFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Ошибка: ожидаемый текст не совпал с реальным", expected, cat.getFood());
    }
}
