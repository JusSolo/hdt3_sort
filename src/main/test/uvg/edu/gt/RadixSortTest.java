package uvg.edu.gt;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;
public class RadixSortTest extends TestCase {

    public void testSort() {
        RadixSort<Integer> radixSort = new RadixSort<>();

        // Input list
        List<Integer> inputList = Arrays.asList(542, 219, 438, 352, 999, 802, 246, 5000 , 1000, -111);
        List<Integer> expectedSorted = Arrays.asList(-111,219, 246, 352, 438, 542, 802, 999,1000,5000);

        // Perform sorting
        radixSort.sort(inputList);

        // Convert arrays to strings for comparison
        String expectedString = Arrays.toString(expectedSorted.toArray());
        String actualString = Arrays.toString(inputList.toArray());
        // Assert that the list is sorted correctly
        assertEquals(expectedSorted, inputList);
    }
}