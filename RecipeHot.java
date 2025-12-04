
/**
 * Write a description of class RecipeForHot here.
 *
 * @author (Varshiha)
 * @version (a version number or a date)
 */
public class RecipeHot extends Recipe
{
    private int cookingTime;
    /**
     * Constructor for objects of class RecipeForCold
     */
    public RecipeHot(String title, double servings, int cookingTime)
    {
        super(title, servings);
        this.cookingTime = cookingTime;
    }
    
    /**
     * A second constructor which doesn't ask the user to input a cooking time unless they know it
     */
    public RecipeHot(String title, double servings)
    {
        super(title, servings);
        this.cookingTime = 0;
    }

    public int getCookingTime(){
        return cookingTime;
    }
    
    public void setCookingTime(int cookingTime){
        this.cookingTime = cookingTime;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public void printDetails()
    {
        System.out.println("=== Recipe Hot ===");
        super.printDetails();
        System.out.println("Cooking Time: " + cookingTime + " minutes");
    }
}
