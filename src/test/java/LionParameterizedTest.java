import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private String sex;
    private boolean hasMane;

    public LionParameterizedTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters (name = "Пол льва и грива. Тестовые данные: пол = {0}, грива ={1}")
    public static Object[][] getLionsSex() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    Feline feline = Mockito.mock(Feline.class);

    @Test
    public void getKittensNoParamsTest() throws Exception {
        Lion lion = new Lion(feline, sex);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void haveManeTest() throws Exception {
        Lion lion = new Lion(feline, sex);
        Boolean actual = lion.doesHaveMane();
        assertEquals("Ошибка, у львицы или другого вида животных нет гривы", hasMane, actual);
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(feline, sex);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> lionFood = lion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Ожидается список: Животные,Птицы, Рыба", expected, lionFood);
    }
}
