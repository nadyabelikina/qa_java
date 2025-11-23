import com.example.Lion;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        assertEquals(expectedFood, lion.getFood());
    }

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        int expectedCountKittens = 5;
        Mockito.when(feline.getKittens()).thenReturn(expectedCountKittens);
        assertEquals(expectedCountKittens, lion.getKittens());
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean expectedHaveMane = false;
        assertEquals(expectedHaveMane, lion.doesHaveMane());
    }
    @Test
    public void doesHaveManeThrowsExceptionTest() {
        try {
            Lion lion = new Lion("Котик", feline);
        } catch (Exception exception) {
            String textException = "Используйте допустимые значения пола животного - самец или самка";
            assertEquals(textException, exception.getMessage());
        }
    }

}
