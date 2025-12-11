

/**
 * Write a description of class Main here.
 *
 * @author (Chenyu)
 * @version (Elon Musk)
 */
public class Main {
    public static void main(String[] args) {
        RecipeBook book = new RecipeBook("My Recipes", "Gigachad");
        RecipeAdder adder = new RecipeAdder(book);

        System.out.println("=== Welcome to GigaMan's Recipe Book Creator! ===");
        adder.createAndAddRecipe();
        System.out.println("\n=== Your Recipe has been added! ===");
        book.listAllRecipes();
    }

}