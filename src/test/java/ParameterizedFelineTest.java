import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedFelineTest {
    private final int kittensCount;

    public ParameterizedFelineTest(int kittensCount) {
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters(name = "Количество котят. Кол-во = {0}")
    public static Object[][] getKittensQuantity() {
        return new Object[][]{
                {0},
                {1},
                {2},
                {3},
                {6},
                {10},
                {1000},
        };
    }

    @Test
    public void testGetKittensCount() throws IllegalArgumentException {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        assertEquals(kittensCount, actual);
    }

}
