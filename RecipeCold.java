
/**
 * Represents a cold recipe that needs chilling before eating
 * Extends the Recipe class and adds chill time in minutes
 *
 * @author (Varshiha)
 * @version (a version number or a date)
 */
public class RecipeCold extends Recipe
{
    private int chillTime;
    
    /**
     * Creates a new cold recipe with a title, number of servings and chill time
     */
    public RecipeCold(String title, double servings, int chillTime)
    {
        super(title, servings);
        this.chillTime = chillTime;
    }
    
    /**
     * Creates a new cold recipe with a title and number of servings
     * A second constructor which doesn't ask the user to input a cooking time unless they know it
     */
    public RecipeCold(String title, double servings)
    {
        super(title, servings);
        this.chillTime = 0; // we can set a default value instead of letting the user put the time (this just helps improve RecipeAdder)
    }

    /**
     * Returns the chill time of the recipe in minutes
     */
    public int getChillTime(){
        return chillTime;
    }
    
    /**
     * Sets the chill time for the recipe in minutes
     */
    public void setCookingTime(int chillTime){
        this.chillTime = chillTime;
    }
    
    /**
     * Prints the recipe details, including chill time
     * Overrides the printDetails method in Recipe class
     */
    @Override
    public void printDetails()
    {
        System.out.println("=== Recipe Cold ===");
        super.printDetails();
        System.out.println("Chill Time: " + chillTime + " minutes");
    }
}
