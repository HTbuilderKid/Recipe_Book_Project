
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
    
    
    public Ingredient(String name, double amount, Unit unit){
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }
    
    public String getName(){
        return name;
    }
    
    public double getAmount(){
        return amount;
    }
    
    public Unit getUnit(){
        return unit;
    }
    
    public void scale(double factor){
        this.amount = this.amount*factor;
    }
    
    public String toString(){
        return amount + " " + unit + "S of " + name;
    }
}
