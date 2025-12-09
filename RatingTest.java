import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class RatingTest.
 * Tests include:
 * - Constrcutor and getter methods for stars and comment
 * - Changing the rating score with  validation(ensures that it remains between 0 and 5)
 * - The toString method for correct formatting of the stars and comment
 *
 * @author  (Chenyu)
 * @version (a version number or a date)
 */
public class RatingTest {
    @Test
    public void testConstructorAndGetters() {
        Rating r = new Rating(4, "Good");
        assertEquals(4, r.getRating());
        assertEquals("Good", r.getComment());
    }

    @Test
    public void testChangeScore() {
        Rating r = new Rating(3, "Okay");
        r.changeScore(5);
        assertEquals(5, r.getRating());

        r.changeScore(-1); // you -1 me? My basement shall be your doom! AHAHAHHA!
        assertEquals(5, r.getRating());

        r.changeScore(6); // since this is invalid also invalid, it should be ignored
        assertEquals(5, r.getRating());
    }

    @Test
    public void testToString() {
        Rating r = new Rating(4, "Tasty");
        assertEquals("4/5 Tasty", r.toString());
    }
}