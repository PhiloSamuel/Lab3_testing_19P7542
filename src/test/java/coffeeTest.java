import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class coffeeTest {

    public static coffee cm;
    public static coffeeRes cr;

    // Make sure class CoffeeMachine extends CoffeeResStub
    @Nested
    class TopDown{
        @BeforeAll
        public static void init(){
            cm = new coffee();
            cr = new coffeeRes();
        }

        @Test
        public void testCm1(){
            assertTrue(cm.input('c'));
        }

        @Test
        public void testCm2(){
            assertTrue(cm.input('l'));
        }

        @Test
        public void testCm3(){
            assertTrue(cm.input('m'));
        }

        @Test
        public void testCm4(){
            assertTrue(cm.input('r'));
        }

        @Test
        public void testCm5(){
            assertTrue(cm.input('c'));
        }



        @Test
        public void testCr(){
            assertFalse(cr.useCOFFEE());
            assertFalse(cr.useWater());
            assertFalse(cr.useLABAN());
            assertFalse(cr.useCOFFEE());
            cr.reCOFFEE(1);
            cr.reWAter(1);
            cr.reLABAN(1);
            cr.reCOFFEE(1);
            assertTrue(cr.useCOFFEE());
            assertTrue(cr.useWater());
            assertTrue(cr.useLABAN());
            assertTrue(cr.useCOFFEE());
        }

    }


    // Make sure class CoffeeMachine extends CoffeeRes
    @Nested
    class BottomUp{
        @BeforeAll
        public static void init(){
            cm = new coffee();
            cr = new coffeeRes();
        }

        @Test
        public void testCr(){
            assertFalse(cr.useCOFFEE());
            assertFalse(cr.useWater());
            assertFalse(cr.useLABAN());
            assertFalse(cr.useCOFFEE());
            cr.reCOFFEE(1);
            cr.reWAter(1);
            cr.reLABAN(1);
            cr.reCOFFEE(1);
            assertTrue(cr.useCOFFEE());
            assertTrue(cr.useWater());
            assertTrue(cr.useLABAN());
            assertTrue(cr.useNESQUIK());
        }


        @Test
        public void testCm1(){
            assertFalse(cm.input('m'));
        }

        @Test
        public void testCm2(){
            assertFalse(cm.input('w'));
        }

        @Test
        public void testCm3(){
            assertFalse(cm.input('b'));
        }

        @Test
        public void testCm4(){
            assertTrue(cm.input('v'));
        }

        @Test
        public void testCm5(){assertTrue(cm.input('c'));
        }


    }


}