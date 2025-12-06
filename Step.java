
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
    
    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }
    
    public String getDescription(){
        return description;
    }
    
    public String toString(){
        return number + ". " + description;
    }
}