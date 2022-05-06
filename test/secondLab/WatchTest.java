package secondLab;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WatchTest {
    Watch watch;
    @BeforeEach
    public void init(){
        watch = new Watch();
    }

    @Nested
    @DisplayName("Normal State Test Cases")
    class Normal{
        @BeforeEach
        public void initialState(){
            watch.setState("NORMAL");
        }
        @Test
        public void inputaFromTimeToDate(){
            watch.setState1("TIME");
            assertEquals("DATE", watch.stateTransitions('a'));
        }
        @Test
        public void inputaFromDateToTime(){
            watch.setState1("DATE");
            assertEquals("TIME", watch.stateTransitions('a'));
        }
        @Test
        public void inputbFromNormalToAlarm(){
            assertEquals("ALARM", watch.stateTransitions('b'));
        }
        @Test
        public void inputcFromNormalToUpdate(){
            assertEquals("MIN", watch.stateTransitions('c'));
        }
    }
    @Nested
    @DisplayName("Update State Test Cases")
    class Update{
        @BeforeEach
        public void initialState2(){
            watch.setState("UPDATE");
        }
        @Test
        public void inputaFromMinToHour(){
            watch.setState1("MIN");
            assertEquals("HOUR", watch.stateTransitions('a'));
        }
        @Test
        public void inputaFromHourToDay(){
            watch.setState1("HOUR");
            assertEquals("DAY", watch.stateTransitions('a'));
        }
        @Test
        public void inputaFromDayToMonth(){
            watch.setState1("DAY");
            assertEquals("MONTH", watch.stateTransitions('a'));
        }
        @Test
        public void inputaFromMonthToYear(){
            watch.setState1("MONTH");
            assertEquals("YEAR", watch.stateTransitions('a'));
        }
        @Test
        public void inputaFromYearToNormal(){
            watch.setState1("YEAR");
            assertEquals("TIME", watch.stateTransitions('a'));
        }
        @Test
        public void inputbFromMinToMin(){
            watch.setState1("MIN");
            assertEquals("MIN", watch.stateTransitions('b'));
        }
        @Test
        public void inputbFromHourToHour(){
            watch.setState1("HOUR");
            assertEquals("HOUR", watch.stateTransitions('b'));
        }
        @Test
        public void inputbFromDayToDay(){
            watch.setState1("DAY");
            assertEquals("DAY", watch.stateTransitions('b'));
        }
        @Test
        public void inputbFromMonthToMonth(){
            watch.setState1("MONTH");
            assertEquals("MONTH", watch.stateTransitions('b'));
        }
        @Test
        public void inputbFromYearToYear(){
            watch.setState1("YEAR");
            assertEquals("YEAR", watch.stateTransitions('b'));
        }
        @Test
        public void inptdFromUpdateToNormal(){
            assertEquals("TIME", watch.stateTransitions('d'));
        }
    }
    @Nested
    @DisplayName("Alarm State Test Cases")
    class Alarm{
        @BeforeEach
        public void initialState3(){
            watch.setState("ALARM");
        }
        @Test
        public void inputaFromAlarmToChime(){
            watch.setState1("ALARM");
            assertEquals("CHIME", watch.stateTransitions('a'));
        }
        @Test
        public void inputdFromAlarmToNormal(){
            assertEquals("TIME", watch.stateTransitions('d'));
        }
    }
    @AfterEach
    public void clean(){
        watch = null;
    }
}