import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 * The test class RecipeBookTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RecipeBookTest
{
    /**
     * Default constructor for test class RecipeBookTest
     */
    public RecipeBookTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {

    }

    @Test
    public void testAddRecipe(){
        RecipeBook book = new RecipeBook("The Croc Book", "Mr. Crocodile");
        Recipe hotRecipe = new RecipeHot("Sausages", 2, 25);
        
        book.addRecipe(hotRecipe);

        ArrayList<Recipe> allHot = book.listHotRecipes();
        assertEquals(1, allHot.size());
        assertEquals(hotRecipe, allHot.get(0));

    }
    
    /**
     * I didn't do listColdRecipes because it is the same thing as this one
     */
    @Test
    public void testListHotRecipes(){
        RecipeBook book = new RecipeBook("Stranger Things", "Duffer Bros");
        
        RecipeHot hot1 = new RecipeHot("Beef", 3, 30);
        RecipeHot hot2 = new RecipeHot("Chicks", 8, 100);
        RecipeCold cold1 = new RecipeCold("Ice Cream", 1, 50);
        
        book.addRecipe(hot1);
        book.addRecipe(hot2);
        book.addRecipe(cold1);
        
        ArrayList<Recipe> hotRecipes = book.listHotRecipes();
        
        assertEquals(2, hotRecipes.size());
        assertTrue(hotRecipes.contains(hot1));
        assertTrue(hotRecipes.contains(hot2));
        assertFalse(hotRecipes.contains(cold1));
    }

    @Test
    public void testSearchByTitle(){
        RecipeBook book = new RecipeBook("Nami's Favourites", "Sanji");
        
        RecipeHot hot1 = new RecipeHot("Spicy ramen", 1, 25);
        RecipeHot hot2 = new RecipeHot("Hot beef", 2, 45);
        RecipeCold  cold1 = new RecipeCold("Not hot tea", 2, 5);
        
        book.addRecipe(hot1);
        book.addRecipe(hot2);
        book.addRecipe(cold1);
        
        ArrayList<Recipe> results = book.searchByTitle("hot");
        
        assertEquals(2, results.size());
        assertTrue(results.contains(hot2));
        assertTrue(results.contains(cold1));
        assertFalse(results.contains(hot1));
    }
    
    @Test 
    public void testSearchByIngredient(){
        RecipeBook book = new RecipeBook("Wasabi Cook", "Guava Juice");
        
        RecipeHot hot = new RecipeHot("Pesto Pasta", 4, 20);
        RecipeCold cold = new RecipeCold("Chocolate Cake", 3, 120);
        
        hot.addIngredient(new Ingredient("Milk", 250, Unit.ML));
        hot.addIngredient(new Ingredient("Flour", 2, Unit.CUP));
        cold.addIngredient(new Ingredient("Chocolate milk", 200, Unit.ML));
        cold.addIngredient(new Ingredient("Cacoa", 2, Unit.TSP));
        
        book.addRecipe(hot);
        book.addRecipe(cold);
        
        ArrayList<Recipe> results = book.searchByIngredient("Milk");
        assertEquals(2, results.size());
        assertTrue(results.contains(hot));
        assertTrue(results.contains(cold));
    }
    
    
    @Test
    public void testSearchByTag(){
        RecipeBook book = new RecipeBook("Byler Cook", "Guava Juice");
        
        RecipeHot hot = new RecipeHot("Soup", 4, 20);
        RecipeCold cold = new RecipeCold("Leaf", 3, 120);
        
        hot.addTag(Tag.VEGAN);
        cold.addTag(Tag.VEGETARIAN);
        cold.addTag(Tag.LOW_CARB);
        
        book.addRecipe(hot);
        book.addRecipe(cold);
        
        ArrayList<Recipe> results = book.searchByTag(Tag.VEGETARIAN);
        assertEquals(1,results.size());
        assertTrue(results.contains(cold));
        assertFalse(results.contains(hot));
    }
    
    @Test
    public void testFindByExactTitle(){
        RecipeBook book = new RecipeBook("Ananas", "SpongeBob");
        
        RecipeHot hot = new RecipeHot("Noodles", 4, 20);
        RecipeCold cold = new RecipeCold("Octopus", 3, 120);
        
        book.addRecipe(hot);
        book.addRecipe(cold);
        
        Recipe result = book.findByExactTitle("noodles");
        assertNotNull(result);
        assertEquals(hot, result);
        
        result = book.findByExactTitle("Cake");
        assertNull(result);
    }
    
    @Test
    public void testRateRecipe(){
        RecipeBook book = new RecipeBook("Ananas", "SpongeBob");
        
        RecipeHot hot = new RecipeHot("Noodles", 4, 20);
        book.addRecipe(hot);
        
        Rating rating = new Rating(3, "Not bad, but not good");
        
        boolean success = book.rateRecipe("Noodles", rating);
        
        assertTrue(success);
        assertEquals(1, hot.getRating().size());
        assertEquals(rating, hot.getRating().get(0));
        
        //Recipe does not exist
        Rating rating2 = new Rating(9, "Very Good");
        
        success = book.rateRecipe("Brook", rating2);
        
        assertFalse(success);
    }
    
    @Test
    public void testListTopRated(){
        RecipeBook book = new RecipeBook("Ananas", "SpongeBob");
        
        RecipeHot hot = new RecipeHot("Noodles", 4, 20);
        RecipeCold cold = new RecipeCold("Octopus", 3, 120);
        
        book.addRecipe(hot);
        book.addRecipe(cold);
        
        hot.addRating(new Rating(5, "Excellent"));
        cold.addRating(new Rating(3, "Ok"));
        
        ArrayList<Recipe> topRated = book.listTopRated();
        
        assertEquals(1, topRated.size());
        assertTrue(topRated.contains(hot));
        assertFalse(topRated.contains(cold));
        
    }
    
    @Test
    public void testPrintBookDetails()
    {
        RecipeBook recipeBo1 = new RecipeBook("Avocado", "Mo Camole");
        recipeBo1.printBookDetails();
    }

    @Test
    public void testListAllRecipes()
    {
        RecipeBook recipeBo1 = new RecipeBook("Mohammad", "Willy Wonders");
        recipeBo1.listAllRecipes();
    }

}

