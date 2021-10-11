# Questionnere B

1st download as a zip file

2nd run test cases on machine.

#steps 
1. code to sum everything together. 
2. divide all by total number.


#code
public class QestionB {

    public static Integer getSum(Integer [] intArr) {

Integer a = 0;
for(Integer i : intArr){
a += i;
}
return a;
}

    public static Double getAverage(Integer [] intArr) {

return Double.valueOf(getSum(intArr)/ intArr.length);




    }



}

#test
public class QuestionBTest {


    @Test
    public void tesOne(){

        Integer [] input = {1, 2, 3, 4, 5};
        Double expected = 3.0;

        Double actual = QestionB.getAverage(input);

        Assert.assertEquals(expected, actual, 0.01);
    }
