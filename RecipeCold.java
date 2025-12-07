
/**
 * Write a description of class RecipeForHot here.
 *
 * @author (Varshiha)
 * @version (a version number or a date)
 */
public class RecipeCold extends Recipe
{
    private int chillTime;
    
    /**
     * Constructor for objects of class RecipeForCold
     */
    public RecipeCold(String title, double servings, int chillTime)
    {
        super(title, servings);
        this.chillTime = chillTime;
    }
    
    /**
     * A second constructor which doesn't ask the user to input a cooking time unless they know it
     */
    public RecipeCold(String title, double servings)
    {
        super(title, servings);
        this.chillTime = 0; // we can set a default value instead of letting the user put the time (this just helps improve RecipeAdder)
    }

    /**
     * The getChillTime method
     */
    public int getChillTime(){
        return chillTime;
    }
    
    /**
     * The setCookingTime method
     */
    public void setCookingTime(int chillTime){
        this.chillTime = chillTime;
    }
    
    /**
     * The printDetails()
     */
    @Override
    public void printDetails()
    {
        System.out.println("=== Recipe Cold ===");
        super.printDetails();
        System.out.println("Chill Time: " + chillTime + " minutes");
    }
}
