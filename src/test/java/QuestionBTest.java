import uno.QestionB;
import org.junit.Assert;
import org.junit.Test;


public class QuestionBTest {


    @Test
    public void tesOne(){

        Integer [] input = {1, 2, 3, 4, 5};
        Double expected = 3.0;

        Double actual = QestionB.getAverage(input);

        Assert.assertEquals(expected, actual, 0.01);
    }

@Test
   public void testUno(){
   int a= 6;
   int b= 12;

   int expected = 2;
   int actual = 12/6;


   Assert.assertEquals(expected, actual);
//
}








}

