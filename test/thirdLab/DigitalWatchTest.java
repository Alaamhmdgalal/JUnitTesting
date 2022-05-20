package thirdLab;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class DigitalWatchTest {
    DigitalWatch watch;

    @BeforeEach
    public void init(){
        watch = new DigitalWatch();
    }

    @Test
    @DisplayName("View Watch")
    public void test_view(){
        watch.setHours(03);
        watch.setMinutes(15);
        watch.setSeconds(40);
        assertEquals("3:15:40", watch.view());
    }

    @Test
    @DisplayName("Adjust Function Test")
    public void test_adjust(){
        assertEquals("3:15:40", watch.adjust(03,15,40));
    }

    @Test
    @DisplayName("Alarm Function Test")
    public void test_alarm(){
        watch.setAlarm(03,15,40);
        assertEquals("Ringing", watch.alarm(03, 15,40));
    }
}
