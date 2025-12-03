
/**
 * Write a description of class RecipeForHot here.
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
    public Rating(int score, String comment)
    {
        if(score >= 0 && score <= 5){
            this.score = score;
        }
        this.comment = comment;
    }
    
    public int getScore(){
        return score;
    }
    
    public String getComment(){
        return comment;
    }
    
    public void changeScore(int newScore){
        if(newScore >= 0 && newScore <= 5){
            this.score = newScore;
        }
    }

    public String toString(){
        return score + "/5 " + comment;
    }
}
