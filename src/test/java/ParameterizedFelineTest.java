import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedFelineTest {
    private final int kittensCount;

    public ParameterizedFelineTest(int kittensCount) {
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
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
        feline.getKittens(kittensCount);
    }

}
