
/**
 * Write a description of class RecipeForHot here.
 *
 * @author (Varshiha)
 * @version (a version number or a date)
 */
public class RecipeHot extends Recipe
{
    /**
     * Constructor for objects of class RecipeForCold
     */
    public RecipeHot(String title, double servings)
    {
        super(title, servings);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printDetails(){
        System.out.println("=== Recipe Hot ===");
        System.out.println("Title: " + title);
        System.out.println("Serving: " + servings);
        System.out.println("Ingredients: " + ingredients );
        System.out.println("Total Ingredients: " + ingredients.size());
        System.out.println("Steps: " + steps);
        System.out.println("Total Steps: " + steps.size());
        System.out.println("Ratings: " + ratings);
        System.out.println("Total Ratings: " + ratings.size());
        System.out.println("Tag: " + tags);
    }
}
