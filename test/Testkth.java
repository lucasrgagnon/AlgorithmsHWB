import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by lucasgagnon on 2/5/16.
 */
public class Testkth{

    kth testkth = new kth();

    @Test
    public void testExampleCases(){
        Integer[] testArray = {3, 4, 1, 3};
        ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(testArray));

        Integer[] resultArray1 = {3, 4, 1, 3};
        List<Integer> resultList = new ArrayList<Integer>(Arrays.asList(resultArray1));
        assertTrue(resultList.equals(testkth.function(testList, 1)));

        Integer[] resultArray2 = {4, 3};
        resultList = new ArrayList<Integer>(Arrays.asList(resultArray2));
        assertTrue(resultList.equals(testkth.function(testList, 2)));

        Integer[] resultArray3 = {1};
        resultList = new ArrayList<Integer>(Arrays.asList(resultArray3));
        assertTrue(resultList.equals(testkth.function(testList, 3)));

        Integer[] resultArray4 = {3};
        resultList = new ArrayList<Integer>(Arrays.asList(resultArray4));
        assertTrue(resultList.equals(testkth.function(testList, 4)));

        resultList = new ArrayList<Integer>();
        assertTrue(resultList.equals(testkth.function(testList, 5)));
    }

    @Test
    public void testEmptyList(){
        ArrayList<Integer> testList = new ArrayList<Integer>();
        assertTrue(testList.equals(testkth.function(testList, 5)));
        assertTrue(testList.equals(testkth.function(testList, 3)));
        assertTrue(testList.equals(testkth.function(testList, 1)));
    }

    @Test
    public void testNegativek(){
        Integer[] testArray = {3, 4, 1, 3};
        ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(testArray));

        try {
            testkth.function(testList, -1);
        } catch (ArrayIndexOutOfBoundsException ex) {
            assertTrue(true);
        }
    }
}