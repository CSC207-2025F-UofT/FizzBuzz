package lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/*
  Some test cases for Multiples.
 */
public class MultiplesTest {


    @Test
    public void testFifteen() {
        assertEquals(7,
                Multiples.multiples(16, 3, 5),
                "Multiples.multiples(16, 3, 5) is incorrect, the values" +
                        " it should be counting are: 3, 5, 6, 9, 10, 12, 15");
    }

    @Test
    public void testTen() {
        assertEquals(4,
                Multiples.multiples(10, 3, 5),
                "Multiples.multiples(10, 3, 5) is incorrect, the values" +
                        " it should be counting are: 3, 5, 6, 9");
    }

    @Test
    public void testThousand() {
        assertEquals(466,
                Multiples.multiples(1000, 3, 5),
                "Multiples.multiples(1000, 3, 5) is incorrect.");
    }

    @Test
    public void testEquals() {
        assertEquals(249,
                Multiples.multiples(1000, 4, 4),
                "Multiples.multiples(1000, 4, 4) is incorrect.");
    }

}