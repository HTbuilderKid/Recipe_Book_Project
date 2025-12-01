import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Collections;
/**
 * Write a description of class RecipeBook here.
 *
 * @author (Chenyu)
 * @version (a version number or a date)
 */
public class RecipeBook
{
    private ArrayList<Recipe> recipes;
    private String title;
    private String author;

    /**
     * Constructor for objects of class RecipeBook
     */
    public RecipeBook(String title, String author)
    {
        this.title = title;
        this.author = author;
        this.recipes = new ArrayList<>();
    }
    
    /**
     * The printBookDetails method, 
     */
    public void printBookDetails() {
        System.out.println("=✯= Recipe Book =✯=");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Total Recipes: " + recipes.size());
    }
    
    /**
     * The listAllRecipes method, 
     */
    public void listAllRecipes() {
        if (recipes.isEmpty()) {
            System.out.println("No recipes in the book.");
            return;
        }
        
        for (Recipe r : recipes) {
            System.out.println("- " + r.getTitle());
        }
    }
    
    /**
     * The searchByTitle method, 
     */
    public ArrayList<Recipe> searchByTitle(String text) {
        ArrayList<Recipe> results = new ArrayList<>();
        for (Recipe r : recipes) {
            if (r.getTitle().toLowerCase().contains(text.toLowerCase())) {
                results.add(r);
            }
        }
        return results;
    }
        
    /**
     * The searchByIngredient method, which uses the hasIngredient method of the
     * Recipe class (not-yet written).
     */
    public ArrayList<Recipe> searchByIngredient(String ingredientName) {
        ArrayList<Recipe> results = new ArrayList<>();
        for (Recipe r : recipes) {
            if (r.hasIngredient(ingredientName)) {
                results.add(r);
            }
        }
        return results;
    }
    
    /**
     * The searchByTitle method, 
     */
    public ArrayList<Recipe> searchByTag(Tag tag) {
        ArrayList<Recipe> results = new ArrayList<>();
        for (Recipe r : recipes) {
            if (r.hasTag(tag)) {
                results.add(r);
            }
        }
        return results;
    }
    
    /**
     * The printRecipeDetails method, 
     */ 
    public void printRecipeDetails(String title) {
        Recipe r = findByExactTitle(title);
        // the condition, but I have to commit first :)
    }
}
