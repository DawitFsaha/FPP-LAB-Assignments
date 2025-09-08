import org.junit.Test;

import static org.junit.Assert.*;

public class RecursionTest {

    // --------- findMinChar() tests ---------

    @Test
    public void testMinChar_basic() {
        char act = Recursion.findMinChar("Berket");
        char exp = 'B';
        assertEquals(exp, act);
    }

    @Test
    public void testMinChar_lowercase() {
        char act = Recursion.findMinChar("world");
        char exp = 'd';
        assertEquals(exp, act);
    }



    // --------- reverseArray() tests ---------

    @Test
    public void testReverseArray() {
        int[] arr = {1, 2, 3, 4};
        int[] exp = {4, 3, 2, 1};
        Recursion.reverseArray(arr);
        assertArrayEquals(exp, arr);
    }


    // --------- isPalindrome() tests ---------

    @Test
    public void testIsPalindrome_trueCase() {
        Recursion rec = new Recursion();
        boolean act = rec.isPalindrome(121);
        boolean exp = true;
        assertEquals(exp, act);
    }

    @Test
    public void testIsPalindrome_falseCase() {
        Recursion rec = new Recursion();
        boolean act = rec.isPalindrome(123);
        boolean exp = false;
        assertEquals(exp, act);
    }


    // --------- findMax() tests ---------

    @Test
    public void testFindMax_basic() {
        Recursion rec = new Recursion();
        int[] arr = {2, 5, 1, 9, 3};
        int act = rec.findMax(arr);
        int exp = 9;
        assertEquals(exp, act);
    }


}
