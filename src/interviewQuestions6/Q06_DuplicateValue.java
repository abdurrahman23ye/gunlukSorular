package interviewQuestions6;

import java.util.*;

public class Q06_DuplicateValue {
    public static void main(String[] args) {
        /*
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

        String str="Javaisalsoeasy";

        String[] input=str.split("");

        Set<String> list=new HashSet<>();

        for (int i = 0; i < input.length ; i++) {
            for (int j =i+1; j < input.length ; j++) {

                if(input[i].equals(input[j])){
                    list.add(input[i]);


                }

            }


        }System.out.println("list = " + list);

    }
}
