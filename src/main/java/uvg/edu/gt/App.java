package uvg.edu.gt;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        RadixSort<Integer> radixSort = new RadixSort<>();

        // Input list
        List<Integer> inputList = Arrays.asList(542, 219, 438, 352, 999, 802, 246);
        List<Integer> expectedSorted = Arrays.asList(219, 246, 352, 438, 542, 802, 999);

        // Perform sorting
        radixSort.sort(inputList);

        // Convert arrays to strings for comparison
        String expectedString = Arrays.toString(expectedSorted.toArray());
        String actualString = Arrays.toString(inputList.toArray());
        System.out.println(expectedString);
    }
}
