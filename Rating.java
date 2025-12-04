
/**
 * Write a description of class RecipeForHot here.
 *
 * @author (Varshiha)
 * @version (a version number or a date)
 */
public class Rating
{
    // instance variables - replace the example below with your own
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
    
    public int getRating(){
        return stars;
    }
    
    public String getComment(){
        return comment;
    }
    
    public void changeScore(int newStar){
        if(newStar >= 0 && newStar <= 5){
            this.stars = newStar;
        }
    }
    

    public String toString(){
        return stars + "/5 " + comment;
    }
}
