import java.util.ArrayList;
import java.util.HashSet;
/**
 * Write a description of class RecipeForHot here.
 *
 * @author (Varshiha)
 * @version (a version number or a date)
 */
public abstract class Recipe
{
    protected String title;
    protected double servings;
    protected ArrayList<Ingredient> ingredients;
    protected ArrayList<Rating> ratings;
    protected ArrayList<Step> steps;
    protected HashSet<Tag> tags;
    
    /**
     * Constructor for objects of class Recipes
     */
    public Recipe(String title, double servings)
    {
        this.title = title;
        this.servings = servings;
        this.ingredients = new ArrayList<>();
        this.steps = new ArrayList<>();
        this.tags = new HashSet<>();
        this.ratings = new ArrayList<>();
    }
    
    public String getTitle() {
        return title;
    }
    
    public double getServings() {
        return servings;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }
    
    public ArrayList<Ingredient> getIngredients(){
        return ingredients;
    }
    public void addStep(Step step){
        steps.add(step);
    }
    public ArrayList<Step> getSteps(){
        return steps;
    }
    
    public void addRating (Rating rating){
        ratings.add(rating);
    }
    
    public ArrayList<Rating> getRatings(){
        return ratings;
    }
    
    public void addTag(Tag tag){
        tags.add(tag);
    }
    
    public void scale(double newServings){
        double factor = newServings/servings;
        for(Ingredient i : ingredients){
            //i.scale(factor); (ingredients method doesn't have scale yet)
        }
        servings = newServings;
    }
    
    public void printDetails(){
        System.out.println("=== Recipe ===");
        System.out.println("Title: " + title);
        System.out.println("Serving: " + servings);
        System.out.println("Ingredients: " + ingredients );
        System.out.println("Steps: " + steps);
        System.out.println("Ratings: " + ratings);
        System.out.println("Tag: " + tags);
    }
}
