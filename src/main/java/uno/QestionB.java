package uno;

public class QestionB {


   public static Integer getSum(Integer [] intArr){
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

