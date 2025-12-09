import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * An abstract class representing a Recipe
 * 
 * It allows:
 * - Adding/removing recipes
 * - Scaling ingredients
 * - Calculating the difficulty and highest rating
 * - Printing the recipe details
 * 
 * Specific recipes(hot/cold)
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
     * Creates a new Recipe with a given title and servings
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
    
    // Getters
    
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
    
    /**
     * The getRating method 
     */
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
     * Calculates recipe difficulty based on the number of steps
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
    
    /**
     * Returns the highest start rating from all ratings
     */
    public int getStars(){
        int max = 0;
        for(Rating r : ratings){
            if(r.getRating() > max){
                max = r.getRating();
            }
        }
        return max;
    }
    
    // Add methods
    
    /**
     * The addIngredient method
     */
    public void addIngredient(Ingredient ingredient){
        for(Ingredient i : ingredients){
            if(i.getName().equalsIgnoreCase(ingredient.getName())){
                System.out.println("Ingredient already exists: " + ingredient.getName());
                return;
            }
        }
        ingredients.add(ingredient);
    }
    
     /**
     * The addStep method
     */
    public void addStep(Step step){
        for(Step s : steps){
            if(s.getNumber() == step.getNumber()){
                System.out.println("Step " + step.getNumber() + " already exists.");
                return;
            }
        }
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
    
    // Check methods
    
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
     * Scales all ingredients based on the new number of servings
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
    
    /**
     * The removeIngredient method 
     */
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
    
    // Remove methods
    
    /**
     * The removeStep method 
     */
    public boolean removeStep(int stepNumber){
        Iterator<Step> it = steps.iterator();
        while(it.hasNext()){
            Step s = it.next();
            if(s.getNumber() == stepNumber){
                it.remove();
                renumberStep();
                return true;
            }
        }
        return false;
    }
    
    /**
     * The renumberStep method 
     */
    private void renumberStep(){
        int num = 1;
        for(Step s : steps){
           s.setNumber(num);
           num++;
        }
    }
    
    /**
     * The removeRating method
     */
    public boolean removeRating(int index){
        int i = 0;
        while(i < ratings.size()){
            if(i == index){
                ratings.remove(i);
                return true;
            }
            i++;
        }
        return false;
    }
    
}