
/**
 * Write a description of class Rating here.
 *
 * @author (Varshiha)
 * @version (a version number or a date)
 */
public class Rating
{
    // instance variables - replace the example below with your own
    private int score;
    private String comment;
    /**
     * Constructor for objects of class Rating
     */
    public Rating(int scoreOutOfFive, String comment)
    {
        this.score= scoreOutOfFive;
        this.comment = comment;
    }
    
    public int getScore(){
        return score;
    }
    
    public String getComment(){
        return comment;
    }

    public String toString(){
        return score + "/5 " + comment;
    }
}
