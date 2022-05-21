import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class watchTest {
    public static watch dw;
    public static chime am;

    // Make sure class DigitalWatch extends AlarmModStub
    @Nested
    class TopDown{
        @BeforeAll
        public static void init(){
            dw = new watch();
            am = new chime();
        }

        @Test
        public void testdw1(){
            assertTrue(dw.input('t'));
        }

        @Test
        public void testdw2(){
            assertTrue(dw.input('a'));
        }

        @Test
        public void testdw3(){
            assertTrue(dw.input('u'));
        }

        @Test
        public void testdw4(){
            assertTrue(dw.input('s'));
        }

        @Test
        public void testdw5(){
            assertTrue(dw.input('c'));
        }

        @Test
        public void testdw6(){
            assertTrue(dw.input('t'));
        }

        @Test
        public void testdw7(){
            assertTrue(dw.input('s'));
        }



        @Test
        public void testam(){
            assertFalse(am.CHECKA());
            assertFalse(am.UNSETA());
            assertTrue(am.SETA());
            assertTrue(am.CHECKA());
            assertTrue(am.SETA());
            assertFalse(am.SETA());
            assertTrue(am.UNSETA());
        }

    }


    @Nested
    class BottomUp {
        @BeforeAll
        public static void init() {
            dw = new watch();
            am = new chime();
        }

        @Test
        public void testam() {
            assertFalse(am.CHECKA());
            assertFalse(am.UNSETA());
            assertTrue(am.SETA());
            assertTrue(am.CHECKA());
            assertTrue(am.SETA());
            assertFalse(am.SETA());
            assertTrue(am.UNSETA());
        }


        @Test
        public void testdw1(){
            assertTrue(dw.input('t'));
        }

        @Test
        public void testdw2(){
            assertTrue(dw.input('a'));
        }

        @Test
        public void testdw3(){
            assertTrue(dw.input('s'));
        }

        @Test
        public void testdw4(){
            assertTrue(dw.input('c'));
        }

        @Test
        public void testdw5(){
            assertTrue(dw.input('s'));
        }

        @Test
        public void testdw6(){
            assertTrue(dw.input('u'));
        }

        @Test
        public void testdw7(){
            assertTrue(dw.input('t'));
        }

        @Test
        public void testdw8(){
            assertTrue(dw.input('s'));
        }
}
}