import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WhiteBoxTest {

    @Before
    public void setUp() throws Exception {
        wb = new WhiteBox();
    }

    private WhiteBox wb;

////     first task
    @Test
    public void testFindTaskOneOne() {
        int[] a = null;
        assertThrows(IllegalArgumentException.class, () -> wb.find(a, 2, 5));
    }

    @Test
    public void testFindTaskOneTwo() {
        int a = wb.find(new int[] {2, 5, -10}, 3, 3);
        assertEquals(-1, a);
    }
////   	 second task

    @Test
    public void testFindTaskTwo() {
        int[] a = {2, 4};
        int i = wb.find(a, 2, 4);
        assertEquals(1, i);
    }

////    	 third task
    @Test
    public void testFindTaskThree() {
        int[] a = {3};
        int i = wb.find(a, 1, 3);
        assertEquals(0, i);
    }
}
