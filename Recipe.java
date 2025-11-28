import java.util.ArrayList;
import java.util.HashSet;
/**
 * Write a description of class Recipes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Recipe
{
    protected String title;
    protected int servings;
    protected ArrayList<Ingredient> ingredients;
    protected ArrayList<Rating> ratings;
    protected ArrayList<Step> steps;
    protected HashSet<Tag> tags;
    
    /**
     * Constructor for objects of class Recipes
     */
    public Recipe(String title, int servings)
    {
        this.title = title;
        this.servings = servings;
        this.ingredients = new ArrayList<>();
        this.steps = new ArrayList<>();
        this.tags = new HashSet<>();
        this.ratings = new ArrayList<>();
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
