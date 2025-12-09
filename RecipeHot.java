
/**
 * Represents a hot recipe that requires cooking
 * Inherits from the abstract Recipe class
 *
 * @author (Varshiha)
 * @version (a version number or a date)
 */
public class RecipeHot extends Recipe
{
    private int cookingTime;
    /**
     * Creates a recipeHot with a given title, servings and cooking time
     */
    public RecipeHot(String title, double servings, int cookingTime)
    {
        super(title, servings);
        this.cookingTime = cookingTime;
    }

    /**
     * Creates a recipeHot with a given title and servings
     * A second constructor which doesn't ask the user to input a cooking time unless they know it
     */
    public RecipeHot(String title, double servings)
    {
        super(title, servings);
        this.cookingTime = 0;
    }

    /**
     * Returns the cooking time of the recipe in minutes
     */
    public int getCookingTime(){
        return cookingTime;
    }

    /**
     * Sets the cooking time for the recipe
     */
    public void setCookingTime(int cookingTime){
        this.cookingTime = cookingTime;
    }

    /**
     * Prints all details of the hor recipe
     */
    @Override
    public void printDetails()
    {
        System.out.println("=== Recipe Hot ===");
        super.printDetails();
        System.out.println("Cooking Time: " + cookingTime + " minutes");
    }
}
