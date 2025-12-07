
/**
 * Write a description of class RecipeForHot here.
 *
 * @author (Varshiha)
 * @version (a version number or a date)
 */
public class Rating
{
    private int stars;
    private String comment;
    
    /**
     * Constructor for objects of class Rating
     */
    public Rating(int stars, String comment)
    {
        if(stars >= 0 && stars <= 5){
            this.stars = stars;
        }
        this.comment = comment;
    }
    
    /**
     * The getRating method, 
     */
    public int getRating(){
        return stars;
    }
    
    /**
     * The getComment method, 
     */
    public String getComment(){
        return comment;
    }
    
    /**
     * The changeScore method, 
     */
    public void changeScore(int newStar){
        if(newStar >= 0 && newStar <= 5){
            this.stars = newStar;
        }
    }
    
    /**
     * The toString method, 
     */
    public String toString(){
        return stars + "/5 " + comment;
    }
}
