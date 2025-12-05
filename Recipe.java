import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

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
        int stepCount = steps.size();
        if (stepCount < 5) {
            return Difficulty.EASY;
        } else if (stepCount <= 10) {
            return Difficulty.MEDIUM;
        } else {
            return Difficulty.HARD;
        }
    }
    
    public int getStars(){
        int max = 0;
        for(Rating r : ratings){
            if(r.getRating() > max){
                max = r.getRating();
            }
        }
        return max;
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
    
    
    /**
     * The addRating method
     */
    public boolean hasTag(Tag tag){
        return tags.contains(tag);
    }
    
    
    /**
     * The hasIngredient method
     */
    public boolean hasIngredient(String ingredientName){
        for(Ingredient i : ingredients){
            if(i.getName().toLowerCase().contains(ingredientName.toLowerCase())){
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
        System.out.println("Title: " + title);
        System.out.println("Serving: " + servings);
        System.out.println("Tag: " + tags);
        System.out.println("Dfficulty: " + getDifficulty());
        System.out.println("\nIngredients: ");
        for(Ingredient i : ingredients){
            System.out.println("-" + i);
        }
        System.out.println("\nSteps: ");
        for(Step s : steps){
            System.out.println("- " + s.toString());
        }
        System.out.println("\nRatings: ");
        for(Rating r : ratings){
            System.out.println("- " + r.toString());
        }
        
    }
    
    public boolean removeIngredient(String ingredientName){
        Iterator<Ingredient> it = ingredients.iterator();
        while(it.hasNext()){
            Ingredient ing = it.next();
            if(ing.getName().equalsIgnoreCase(ingredientName)){
                it.remove();
                return true;
            }
        }
        return false;
    }
    
    
}