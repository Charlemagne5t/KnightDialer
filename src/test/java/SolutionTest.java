import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void knightDialerTest1() {
        int n = 1;
        int expected = 10;
        int actual = new Solution().knightDialer(n);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void knightDialerTest2() {
        int n = 2;
        int expected = 20;
        int actual = new Solution().knightDialer(n);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void knightDialerTest3() {
        int n = 3131;
        int expected = 136006598;
        int actual = new Solution().knightDialer(n);

        Assert.assertEquals(expected, actual);
    }
}
