package Module8_Lambdas.L2exercise2;

import javax.management.StringValueExp;

public class Main {
    public static void main(String[] arg){
        int[] numList = {3, 55, 44};
        System.out.println(filterNumbers(numList));
    }

    public static String filterNumbers(int[] numList){
        String strList = "";
        for (int number: numList){
            if (number == numList[numList.length - 1]){
                if (number % 2 == 0) {
                    strList += "e" + String.valueOf(number) + ".";
                } else {
                    strList += "o" + String.valueOf(number) + ".";
                }
            }else if (number % 2 == 0){
                strList += "e" + String.valueOf(number) + ",";
            }else{
                strList += "o" + String.valueOf(number) + ",";
            }
        }
        return strList;
    }
}
