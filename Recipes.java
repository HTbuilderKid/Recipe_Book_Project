import java.util.ArrayList;

/**
 * Write a description of class Recipes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Recipes
{
    protected String title;
    protected double servings;
    protected ArrayList<Ingredient> ingredients;
    protected ArrayList<Rating> ratings;
    protected ArrayList<Step> steps;
    
    /**
     * Constructor for objects of class Recipes
     */
    public Recipes()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addIngredient(Ingredient ingredient){
        
    }
    
    public void addStep(Step step){
        
    }
    
    public void addRating (Rating rating){
        
    }
    
    public void addTag(Tag tag){
        
    }
    
    public void scale(double newServings){
        
    }
    
    public void printDetails(){
        
    }
}
