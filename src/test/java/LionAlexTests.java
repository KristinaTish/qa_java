import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionAlexTests {
    @Test
    public void getAlexsFriendsTest() throws Exception {
        Feline feline = new Feline();
        LionAlex alex = new LionAlex(feline);
        List<String> actual = alex.getFriends();
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        assertEquals("Список друзей не совпадает", expected, actual);
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        Feline feline = new Feline();
        LionAlex alex = new LionAlex(feline);
        String actual = alex.getPlaceOfLiving();
        String expected = "Нью-Йоркский зоопарк";
        assertEquals("Место жительства не совпадает", expected, actual);
    }

    @Test

    public void getAlexsKittensTest() throws Exception {
        Feline feline = new Feline();
        LionAlex alex = new LionAlex(feline);
        int actual = alex.getKittens();
        int expected = 0;
        assertEquals("Котят должно быть ноль", expected, actual);
    }
}