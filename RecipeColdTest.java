import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class RecipeColdTest.
 *
 * @author  (Chentyu)
 * @version (a version number or a date)
 */
public class RecipeColdTest {

    @Test
    public void testConstructorAndGetters() {
        RecipeCold recipe = new RecipeCold("Frozen Souls of The Damned", 2, 60);

        assertEquals("Frozen Souls of The Damned", recipe.getTitle());
        assertEquals(2, recipe.getServings());
        assertEquals(60, recipe.getChillTime());
    }

    @Test
    public void testScaleServings() {
        RecipeCold recipe = new RecipeCold("Cold", 2);
        Ingredient ing = new Ingredient("Cold", 5, Unit.GRAMME);
        recipe.addIngredient(ing);
        recipe.scale(4);
        assertEquals(4, recipe.getServings());
        assertEquals(10, recipe.getIngredients().get(0).getAmount());
    }

    @Test
    public void testChillTimeSetter() {
        RecipeCold recipe = new RecipeCold("Cold Iced Frozen Tea", 2);
        recipe.setCookingTime(45); // sets some chill time so we can chill
        assertEquals(45, recipe.getChillTime());
    }
}