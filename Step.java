
/**
 * Write a description of class Step here.
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

    public int number(){
        return number;
    }
    
    public String description(){
        return description;
    }
    
    public String toString(){
        return number + ". " + description;
    }
}