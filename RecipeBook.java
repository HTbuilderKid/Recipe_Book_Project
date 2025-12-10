import java.util.ArrayList;

/**
 * Represents a recipe book containing multiple recipes
 *
 * @author (Chenyu)
 * @version (some good version that does good stuff)
 */
public class RecipeBook
{
    private ArrayList<Recipe> recipes;
    private String title;
    private String author;

    /**
     * Creates a recipe book with a given title and author
     */
    public RecipeBook(String title, String author)
    {
        this.title = title;
        this.author = author;
        this.recipes = new ArrayList<>();
    }

    /**
     * Prints details about the recipe book
     */
    public void printBookDetails() {
        System.out.println("=✯= Recipe Book =✯=");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Total Recipes: " + recipes.size());
    }

    /**
     * Adds a recipe to the book if it doesn't already exists
     */
    public boolean addRecipe(Recipe r) {
        for(Recipe exists : recipes){
            if(exists.getTitle().equalsIgnoreCase(r.getTitle())){
               System.out.println("Recipe already exists: " + r.getTitle());
               return false;
            }
        }
        recipes.add(r);
        System.out.println("Thank you for your contribution to the RecipeBook! Your Recipe was successfully added!");
        return true;
    }
    
    /**
     * Removes a recipe from the book by title
     */
    public boolean removeRecipe(String title){
        for(int i = 0; i < recipes.size(); i++){
            if(recipes.get(i).getTitle().equalsIgnoreCase(title)){
                recipes.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Lists all recipe title in the book 
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
     * List all hot recipes in the book
     */
    public ArrayList<Recipe> listHotRecipes() {
        ArrayList<Recipe> results = new ArrayList<>();
        for (Recipe r : recipes) {
            if (r instanceof RecipeHot) {  // we can use the "instanceof" keyword to determine whether r is a specific instannce of the RecipeHot class
                results.add(r); 
            }
        }
        return results;
    }

    /**
     * List all cold recipes in the book
     */
    public ArrayList<Recipe> listColdRecipes() {
        ArrayList<Recipe> results = new ArrayList<>();
        for (Recipe r : recipes) {
            if (r instanceof RecipeCold) {
                results.add(r);
            }
        }
        return results;
    }

    /**
     * Searches recipes by a text in their title
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
     * Searches the recipes that contain a specific ingredient
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
     * Searches recipes by tag
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
     * Finds a recipe by exact title
     */ 
    public Recipe findByExactTitle(String title) {
        for (Recipe r : recipes) {
            if (r.getTitle().equalsIgnoreCase(title)) {
                return r;
            }
        }
        return null;
    }

    /**
     * Prints full details of a recipe
     */
    public void printRecipeDetails(String title) {
        Recipe r = findByExactTitle(title);
        // We need a way to handle the case where the Recipe isn't found
        if (r == null) {
            System.out.println("Recipe not found.");
            return;
        }

        System.out.println("=== " + r.getTitle() + " ===");
        System.out.println("Servings: " + r.getServings());
        System.out.println("Difficulty: " + r.getDifficulty());
        System.out.println("Rating: " + r.getRating());
        System.out.println("\nIngredient:");
        for (Ingredient ing : r.getIngredients()) {
            System.out.println("* " + ing);
        }

        System.out.println("\nSteps:");
        int num = 1;
        for (Step s : r.getSteps()) {
            System.out.println(num + ". " + s.getDescription());
            num++;
        }
        System.out.println("\nTags:");
        for (Tag t : r.getTags()) {
            System.out.println("- " + t);
        }
    }

    
    /**
     * Add a rating to a recipe
     */
    public boolean rateRecipe(String title, Rating stars) {
        Recipe r = findByExactTitle(title);
        if (r != null) {
            r.addRating(stars);
            return true;
        }
        return false;
    }

    /**
     * Lists all recipes that have a 5-star rating
     */
    public ArrayList<Recipe> listTopRated() {
        ArrayList<Recipe> results = new ArrayList<>();
        for (Recipe r : recipes) {
            if (r.getStars() == 5) {
                results.add(r);
            }
        }
        return results;
    }
    

}
