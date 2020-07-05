import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MassTestAddArr {
    private int[] arr;
    Arr arr1;

    public MassTestAddArr(int[] arr) {
        this.arr = arr;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 6}},
                {new int[]{2, 5, 8}},
                {new int[]{3, 5, 4,}},
        });
    }

    @Before
    public void init() {
        arr1 = new Arr();
    }

    @Test
    public void testAdd() {
        Assert.assertTrue(Arr.arr2(arr));
    }
}