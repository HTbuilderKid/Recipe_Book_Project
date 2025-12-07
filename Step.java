
/**
 * Write a description of class RecipeForHot here.
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
     * Constructor for objects of class Step
     */
    public Step(int number, String description)
    {
        this.number = number;
        this.description = description;
    }
    
    /**
     * The setNumber method
     */
    public void setNumber(int number){
        this.number = number;
    }

    /**
     * The getNumber method
     */
    public int getNumber(){
        return number;
    }
    
    /**
     * The changeDescription method
     */
    public void changeDescription(String description){
        this.description = description;
    }
    
    /**
     * The getDescription method
     */
    public String getDescription(){
        return description;
    }
    
    /**
     * The toString method
     */
    public String toString(){
        return number + ". " + description;
    }
}