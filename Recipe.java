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
    protected Difficulty difficulty;
    
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
    
    /**
     * The getTitle method
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * The getServings method
     */
    public double getServings() {
        return servings;
    }
    
    /**
     * The getIngredients method
     */
    public ArrayList<Ingredient> getIngredients(){
        return ingredients;
    }

    /**
     * The getSteps method
     */
    public ArrayList<Step> getSteps(){
        return steps;
    }
    
    public ArrayList<Rating> getRating(){
        return ratings;
    }
    
    /**
     * The getTag method
     */
    public HashSet<Tag> getTags(){
        return tags;
    }
    
    /**
     * The getDifficulty method
     */
    public Difficulty getDifficulty(){
        return difficulty;
    }
    
    /**
     * The addIngredient method
     */
    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }
    
     /**
     * The addStep method
     */
    public void addStep(Step step){
        steps.add(step);
    }
    
    /**
     * The addTag method
     */
    public void addTag(Tag tag){
        tags.add(tag);
    }
    
    /**
     * The addRating method
     */
    public void addRating (Rating stars){
        ratings.add(stars);
    }
    
    
    
    public boolean hasTag(Tag tag){
        return tags.contains(tag);
    }
    
    public boolean hasIngredient(String ingredientName){
        for(Ingredient i : ingredients){
            if(i.getName().equalsIgnoreCase(ingredientName)){
                return true;
            }
        }
        return false;
    }
    
    
    
    /**
     * The scale method
     */
    public void scale(double newServings){
        double factor = newServings/servings;
        for(Ingredient i : ingredients){
            i.scale(factor); 
        }
        servings = newServings;
    }
    
    
    /**
     * The printDetails method
     */
    public void printDetails(){
        System.out.println("=== Recipe ===");
        System.out.println("Title: " + title);
        System.out.println("Serving: " + servings);
        System.out.println("Dfficulty: " + difficulty);
        System.out.println("Ingredients: ");
        for(Ingredient i : ingredients){
            System.out.println("*" + i);
        }
        System.out.println("Steps: ");
        for(Step s : steps){
            System.out.println("- " + s.toString());
        }
        System.out.println("Ratings: " + ratings);
        for(Rating r : ratings){
            System.out.println(r.toString());
        }
        System.out.println("Tag: " + tags);
    }
    
    
}