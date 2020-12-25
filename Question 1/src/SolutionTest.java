import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    @org.junit.Test
    public void twoSum() {
        Solution test = new Solution();
        int[] arrayTest = new int[]{2,7,11,15};
        System.out.println(Arrays.toString(test.twoSum(arrayTest, 9)));

        int[] arrayTest2 = new int[]{3,2,4};
        System.out.println(Arrays.toString(test.twoSum(arrayTest2, 6)));

        int[] arrayTest3 = new int[]{0,4,3,0};
        System.out.println(Arrays.toString(test.twoSum(arrayTest3, 0)));
    }
}