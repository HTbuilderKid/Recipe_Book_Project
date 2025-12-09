
/**
 * Represents a single ingredient in a recipe
 * Stores the ingredient's name, amount, and unit
 *
 * @author (Varshiha)
 * @version (a version number or a date)
 */
public class Ingredient
{
    private String name;
    private Unit unit;
    private double amount;
    
    
    /**
     * Creates a new Ingredient with a given name, amount, and unit
     */
    public Ingredient(String name, double amount, Unit unit){
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }
    
    /**
     * Changes the name of the ingredient
     */
    public void changeName(String name){
        this.name = name;
    }
    
    /**
     * Changes the amount of the ingredient
     */
    public void changeAmount(double amount){
        this.amount = amount;
    }
    
    /**
     * Changes the unit of the ingredient
     */
    public void changeUnit(Unit unit){
        this.unit = unit;
    }
    
    /**
     * Returns the name of the ingredient
     */
    public String getName(){
        return name;
    }
    
    /**
     * Returns the amount of the ingredient
     */
    public double getAmount(){
        return amount;
    }
    
    /**
     * Returns the unit of the ingredient
     */
    public Unit getUnit(){
        return unit;
    }
    
    /**
     * Scales the ingredient amount by a given factor
     */
    public void scale(double factor){
        this.amount = this.amount*factor;
    }
    
    /**
     * Returns a string
     */
    public String toString(){
        return amount + " " + unit + " of " + name;
    }
}
