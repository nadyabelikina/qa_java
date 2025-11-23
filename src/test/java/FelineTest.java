
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    Feline feline;

    @Test
    public void getMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, feline.eatMeat());
    }

    @Test
    public void getFamilyTest() throws Exception {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensDefaultTest() throws Exception {
        Feline feline = new Feline();
        int expectedCountKittens = 1;
        int actualCountKittens =  feline.getKittens();
        assertEquals(expectedCountKittens, actualCountKittens);
    }

    @Test
    public void getKittensTest() throws Exception {
        Feline feline = new Feline();
        int expectedCountKittens = 5;
        int actualCountKittens =  feline.getKittens(5);
        assertEquals(expectedCountKittens, actualCountKittens);
    }


}
