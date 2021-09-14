package uno;

public class Practice {

    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {


        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 == 0) {
                integerArray[i]++;

            } else {
                integerArray[i]--;

            }
        }
        return integerArray;
    }


    public static Boolean multipleOf3(Integer num){
        if (num % 3 == 0) {
            return true;
        }else{
            return false;
        }
    }


}
//
