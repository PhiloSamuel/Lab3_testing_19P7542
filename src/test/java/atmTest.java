import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class atmTest {

    public static atm atm;
    public static atmRes atr;

    // Make sure class ATM extends ATMResStub
    @Nested
    class TopDown{
        @BeforeAll
        public static void init(){
            atm = new atm();
            atr = new atmRes();
        }

        @Test
        public void testatm1(){
            assertTrue(atm.input('u'));
        }

        @Test
        public void testatm2(){
            assertTrue(atm.input('f'));
        }

        @Test
        public void testatm3(){
            assertTrue(atm.input('l'));
        }

        @Test
        public void testatm4(){
            assertTrue(atm.input('o'));
        }

        @Test
        public void testatm5(){
            assertTrue(atm.input('u'));
        }

        @Test
        public void testatr(){
            assertFalse(atr.withdraw());
            atr.fill(1);
            assertTrue(atr.withdraw());
            assertFalse(atr.withdraw());
            atr.fill(3);
            assertTrue(atr.withdraw());
            assertTrue(atr.withdraw());
            assertTrue(atr.withdraw());
        }

    }


    // Make sure class ATM extends ATMRes
    @Nested
    class BottomUp{
        @BeforeAll
        public static void init(){
            atm = new atm();
            atr = new atmRes();
        }

        @Test
        public void testATR(){
            assertFalse(atr.withdraw());
            atr.fill(1);
            assertTrue(atr.withdraw());
            assertFalse(atr.withdraw());
            atr.fill(3);
            assertTrue(atr.withdraw());
            assertTrue(atr.withdraw());
            assertTrue(atr.withdraw());
        }


        @Test
        public void testatm1(){
            assertTrue(atm.input('l'));
        }

        @Test
        public void testatm2(){
            assertFalse(atm.input('w'));
        }

        @Test
        public void testatm3(){
            assertTrue(atm.input('d'));
        }

        @Test
        public void testatm4(){
            assertTrue(atm.input('w'));
        }

        @Test
        public void testatm5(){
            assertTrue(atm.input('o'));
        }

    }
    
}