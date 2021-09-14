import uno.Practice;
import org.junit.Assert;
import org.junit.Test;



public class PacticeTest {

    @Test
    public void testOneEvenElement() {
        //for one even element
        Integer[] input3 = {38};
        Integer[] expectedOutput3 = {39};

        Integer[] actual3 = Practice.incrementEvenDecrementOdd(input3);

        Assert.assertArrayEquals(expectedOutput3, actual3);
    }

    @Test
    public void testOneOddElement() {
        //for one odd element
        Integer[] input4 = {91};
        Integer[] expectedOutput4 = {90};

        Integer[] actual4 = Practice.incrementEvenDecrementOdd(input4);

        Assert.assertArrayEquals(expectedOutput4, actual4);
    }


    @Test
    public void testOdd() {
        //for odd numbers
        Integer[] input1 = {101, 25, 11};
        Integer[] expectedOutput1 = {100, 24, 10};

        Integer[] actual1 = Practice.incrementEvenDecrementOdd(input1);

        Assert.assertArrayEquals(expectedOutput1, actual1);
    }

    @Test
    public void testEven() {
        //for even numbers
        Integer[] input2 = {34, 18, 700, 128, 110};
        Integer[] expectedOutput2 = {35, 19, 701, 129, 111};

        Integer[] actual2 = Practice.incrementEvenDecrementOdd(input2);

        Assert.assertArrayEquals(expectedOutput2, actual2);
    }



// Multiples //

    @Test
    public void test1() {
        test(1, false);
    }

    @Test
    public void test2() {
        test(3, true);
    }

    @Test
    public void test3() {
        test(7, false);
    }

    @Test
    public void test4() {
        test(6, true);
    }

    @Test
    public void test5() {
        test(9, true);
    }


    private void test(Integer value, Boolean expectedOutcome) {
        // when
        Boolean actualOutcome = Practice.multipleOf3(value);

        // then
        Assert.assertEquals(actualOutcome, expectedOutcome);
    }


    @Test
    public void test6() {
        test("Feelers", "er", "slF");
    }

    @Test
    public void test7() {
        test("Takers", "ers", "kaT");
    }

    @Test
    public void test8() {
        test("Takers", "res", "kaT");
    }

    @Test
    public void test9() {
        test("breaking", "kaer", "gnib");
    }

    private void test(String stringToManipulate, String charactersToRemove, String expected) {
        // when
        String actual = Practice.removeAndRev(stringToManipulate, charactersToRemove);

        // then
        Assert.assertEquals(expected, actual);
    }




}

