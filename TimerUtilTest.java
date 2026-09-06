package TimerUtil;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TimerUtilTest {
    
    @Test
    void testNormalCase() {
        TimerUtil timer = new TimerUtil();

        assertEquals(15, timer.secondsBetween(10, 25));
    }

    @Test
    void testBoundaryCase() {
        TimerUtil timer = new TimerUtil();

        assertEquals(0, timer.secondsBetween(0, 0));
    }

    @Test
    void testInvalidInput() {
        TimerUtil timer = new TimerUtil();

        assertThrows(
            IllegalArgumentException.class,
            () -> timer.secondsBetween(25, 10)
        );
    }
    
}
