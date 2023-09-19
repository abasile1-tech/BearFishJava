import org.example.Bear;
import org.example.Salmon;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BearTest {
    private Bear bear;

    @Before
    public void before() {
        bear = new Bear("Charmin'");
    }

    @Test
    public void hasName() {
        assertEquals("Charmin'", bear.getName());
    }

    @Test
    public void bellyStartsEmpty() {
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void canEatFish() {
        Salmon salmon = new Salmon();
        bear.eat(salmon);
        assertEquals(1, bear.foodCount());
    }
}
