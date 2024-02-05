package uvg.edu.gt;

import junit.framework.TestCase;
import java.util.Arrays;
import java.util.List;
public class QuikSortTest extends TestCase {

    public void testSort() {
        QuikSort<Integer> quikSort = new QuikSort<>();

        // Input list
        List<Integer> inputList = Arrays.asList(5, 2, 9, 1, 5, 6);
        List<Integer> expectedSorted = Arrays.asList(1, 2, 5, 5, 6, 9);

        // Perform sorting
        quikSort.sort(inputList);

        // Convert arrays to strings for comparison
        String expectedString = Arrays.toString(expectedSorted.toArray());
        String actualString = Arrays.toString(inputList.toArray());

        // Assert that the list is sorted correctly
        assertEquals(expectedString, actualString);
    }
}