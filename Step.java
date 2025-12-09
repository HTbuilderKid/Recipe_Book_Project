
/**
 * Represents a single step in a recipe
 * Each step has a number(its order in the recipe) and a description of what to do
 *
 * @author (Varshiha)
 * @version (a version number or a date)
 */
public class Step
{
    // instance variables - replace the example below with your own
    private int number;
    private String description;
    
    /**
     * Creates a new Step with a given number and description
     */
    public Step(int number, String description)
    {
        this.number = number;
        this.description = description;
    }
    
    /**
     * Stes a new number for the step
     */
    public void setNumber(int number){
        this.number = number;
    }

    /**
     * Returns the number of the step
     */
    public int getNumber(){
        return number;
    }
    
    /**
     * Changes the description of the step
     */
    public void changeDescription(String description){
        this.description = description;
    }
    
    /**
     * Returns the description of the step
     */
    public String getDescription(){
        return description;
    }
    
    /**
     * Returns a String
     */
    public String toString(){
        return number + ". " + description;
    }
}