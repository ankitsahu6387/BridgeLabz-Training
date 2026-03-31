package junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class PerformanceServiceTest {

    PerformanceService service = new PerformanceService();

    @Test
    @Timeout(2) // test fails if execution > 2 seconds
    void testLongRunningTaskTimeout() throws InterruptedException {
        service.longRunningTask();
    }
}