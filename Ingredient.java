
/**
 * Write a description of class RecipeForHot here.
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
     * Constructor for objects of class Ingredient
     */
    public Ingredient(String name, double amount, Unit unit){
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }
    
    /**
     * The changeName method
     */
    public void changeName(String name){
        this.name = name;
    }
    
    /**
     * The changeAmount method
     */
    public void changeAmount(double amount){
        this.amount = amount;
    }
    
    /**
     * The changeUnit method
     */
    public void changeUnit(Unit unit){
        this.unit = unit;
    }
    
    /**
     *The getName method
     */
    public String getName(){
        return name;
    }
    
    /**
     * The getAmount method
     */
    public double getAmount(){
        return amount;
    }
    
    /**
     * The getUnit method
     */
    public Unit getUnit(){
        return unit;
    }
    
    /**
     * The scale method
     */
    public void scale(double factor){
        this.amount = this.amount*factor;
    }
    
    /**
     * The toString method
     */
    public String toString(){
        return amount + " " + unit + " of " + name;
    }
}
