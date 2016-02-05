import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lucasgagnon on 2/5/16.
 */
public class TestIsAnagram {

    IsAnagram testIsAna = new IsAnagram();

    @Test
    public void testExampleCases() {
        assertTrue((testIsAna.function("car", "arc")));
        assertTrue((testIsAna.function("food", "doof")));
        assertTrue(!(testIsAna.function("food", "ddof")));
    }

    @Test
    public void testLengthCases() {
        assertTrue(!(testIsAna.function("car", "arcc")));
        assertTrue(!(testIsAna.function("car", "")));
        assertTrue(!(testIsAna.function("", "arcc")));
    }

    @Test
    public void testEmptyCase() {
        assertTrue(testIsAna.function("", ""));
    }

}