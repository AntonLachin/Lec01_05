import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WhiteBoxTest {

    @Before
    public void setUp() throws Exception {
        wb = new WhiteBox();
    }

    private WhiteBox wb;

    // first task
    @Test
    public void testFindTaskOne() {
        int[] a = null;
        assertThrows(IllegalArgumentException.class, () -> wb.find(a, 2, 5));
    }

    //	 second task
    @Test
    public void testFindTaskTwoOne() {
        int[] a = null;
        assertThrows(IllegalArgumentException.class, () -> wb.find(a, 2, 5));
    }

    @Test
    public void testFindTaskTwoTwo() {
        int[] a = new int[]{2, 4};
        int i = wb.find(a, 2, 4);
        assertEquals(1, i);
    }

    //	 third task
    @Test
    public void testFindTaskThreeOne() {
        int[] a = null;
        assertThrows(IllegalArgumentException.class, () -> wb.find(a, 2, 5));
    }

    @Test
    public void testFindTaskThreeTwo() {
        int[] a = new int[]{2, 4};
        int i = wb.find(a, 2, 4);
        assertEquals(-1, i);
    }
}
