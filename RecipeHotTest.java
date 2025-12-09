import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashSet;

/**
 * Unit tests for the RecipeHot class
 *
 * @author  (Chenyu)
 * @version (a version number or a date)
 */
public class RecipeHotTest
{
    /**
     * Default constructor for test class RecipeHotTest
     */
    @Test
    public void testConstructorAndSetters() {
        RecipeHot recipe = new RecipeHot("Mama Malevola's Hella Spicy Magma Soup", 4, 30);
        assertEquals("Mama Malevola's Hella Spicy Magma Soup", recipe.getTitle());
        assertEquals(4, recipe.getServings());
        assertEquals(30, recipe.getCookingTime());
        // Since we haven't added anything to the lists, they should all be empty
        // like my brain
        // why is it smooth ;-;
        assertEquals(0, recipe.getIngredients().size());
        assertEquals(0, recipe.getSteps().size());
        assertEquals(0, recipe.getRating().size());
        assertEquals(0, recipe.getTags().size());
    }

    /**
     * Tests adding ingredients, steps, and ratings to a RecipeHot
     */
    @Test
    public void testAddIngredientAndStepAndRatingBecauseIAmTooLazyToWriteSeparateTestsForEachOne() {
        RecipeHot recipe = new RecipeHot("Steve's Lava Chicken!!!", 4, 30);
        Ingredient ingredient = new Ingredient("Lava", 2, Unit.TSP);
        recipe.addIngredient(ingredient);
        assertTrue(recipe.getIngredients().contains(ingredient));
        assertTrue(recipe.hasIngredient("Lava"));
        // Test the steps ohhhhh ahhhh
        Step step = new Step(1, "Boil lava");
        recipe.addStep(step);
        assertTrue(recipe.getSteps().contains(step));
        // Banana split
        Rating rating = new Rating(5, "Bussin like Hell Yeah!");
        recipe.addRating(rating);
        assertTrue(recipe.getRating().contains(rating));
    }

    /**
     * Tests the difficulty logic of RecipeHot based on the number of steps
     */
    @Test
    public void testDifficultyLogic() {
        RecipeHot recipe = new RecipeHot("Spicy Soup", 4, 30);
        // If it's below five, it's gonna hit like a truck uck uckkk
        assertEquals(Difficulty.EASY, recipe.getDifficulty());

        // 5 to 10 is the ken... kentucky fried chicken???
        for(int i = 0; i < 5; i++) recipe.addStep(new Step(i+1, "Step " + i));
        assertEquals(Difficulty.MEDIUM, recipe.getDifficulty());

        // It's so hard! Why is it SO HARD?
        for(int i = 0; i < 6; i++) recipe.addStep(new Step(i+6, "Extra step " + i));
        assertEquals(Difficulty.HARD, recipe.getDifficulty());
    }
}