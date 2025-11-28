import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
/**
 * Write a description of class RecipeBook here.
 *
 * @author (your name)
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
    
    public void printBookDetails() {
        System.out.println("=== Recipe Book ===");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Total Recipes: " + recipes.size());
    }
    
    public void listAllRecipes() {
        if (recipes.isEmpty()) {
            System.out.println("No recipes in the book.");
            return;
        }
        
        for (Recipe r : recipes) {
            System.out.println("- " + r.getTitle());
        }
    }
    
    public ArrayList<Recipe> searchByTitle(String text) {
        ArrayList<Recipe> results = new ArrayList<>();
        for (Recipe r : recipes) {
            if (r.getTitle().toLowerCase().contains(text.toLowerCase())) {
                results.add(r);
            }
        }
        return results;
    }
}

