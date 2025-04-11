package javaTesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

public class IntegerStudyTest {

    @Test
    public void integerStudy() {

        Integer vuit = new Integer(8);
        Integer vint = new Integer("20");
        Integer tretze = 13;
        int esperat = 13;

        int minim = -2147483648;


        assertEquals(" El nombre tretze val realment 13 ", esperat, tretze.intValue());

        assertEquals("El nombre vint val realment 20 ", 20, vint.intValue());

        assertEquals("El valor mínim d'un int es -2147483648 ", minim, Integer.MIN_VALUE);

    }

    @Test
    public void integerComparationStudy() {

        Integer vuit = new Integer(8);
        Integer eight = new Integer("8");

        assertEquals(" El nombre vuit val realment 8 ", 8, vuit.intValue());

        assertEquals("El nombre eight val realment 8 ", 8, eight.intValue());

        //assertTrue(vuit == eight);

        assertTrue(vuit.equals(eight));
    }

    @Test
    public void binaryStudy() {

        Integer dos = new Integer(2);
        Integer vint = new Integer("20");
        Integer tretze = 13;

        String tipusPersones = "Hi ha " + Integer.toBinaryString(dos) + " de persones, les que entenen binari i les que NO!";

        assertEquals(tipusPersones, 2, dos.intValue());

        //assertEquals("El nombre vint val realment 20 ", 20, vint.intValue());

    }
}