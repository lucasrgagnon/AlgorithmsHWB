import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Created by lucasgagnon on 2/5/16.
 */
public class TestIsPalindrome{

    IsPalindrome testIsPal = new IsPalindrome();

    @Test
    public void testExampleCases(){
        assertTrue((testIsPal.function("")));
        assertTrue((testIsPal.function("f")));
        assertTrue(!(testIsPal.function("fo")));
        assertTrue((testIsPal.function("ff")));
        assertTrue((testIsPal.function("fof")));
        assertTrue((testIsPal.function("fof")));
        assertTrue((testIsPal.function("foof")));
        assertTrue(!(testIsPal.function("forf")));
    }

}