
/**
 * Represents a rating for a recipe that includes a star score and a comment
 *
 * @author (Varshiha)
 * @version (a version number or a date)
 */
public class Rating
{
    private int stars;
    private String comment;
    
    /**
     * Creates a rating with a given start and comment
     * Ensuures that the start is between 0 and 5
     */
    public Rating(int stars, String comment)
    {
        if(stars >= 0 && stars <= 5){
            this.stars = stars;
        }
        this.comment = comment;
    }
    
    /**
     * Returns the star rating
     */
    public int getRating(){
        return stars;
    }
    
    /**
     * Returns the comment associated with that rating
     */
    public String getComment(){
        return comment;
    }
    
    /**
     * Changes the star score of the rating
     * Ensures that it remains between 0 and 5
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
