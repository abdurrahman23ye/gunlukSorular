package interviewQuestions3;

import java.util.ArrayList;

public class Q05_ArrayListTask {

    public static void main(String[] args) {
        // Part1:
        // Create an arraylist of Strings
        // add - "Red", "Green", "Blue", "Yellow" and "Black" inside
        // print out all the elements, each element on new line

        // Part2:
        // Create a method that accepts a String arraylist and a String as parameters
        // method should add the element at the first index of arraylist

        // Part3:
        // Create a method that accepts a String arraylist and a String as parameters
        // it should add element before last element
        // ex:  [1, 2, 3]  -> [1, 2, 4, 3]

        ArrayList<String> renkler=new ArrayList<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Yellow");
        renkler.add("Black");

        System.out.println("renkler = " + renkler);

        elementiBasaEkleme(renkler);

        System.out.println("renkler = " + renkler);

        sondanBirOnceyeElementEkleme(renkler);

        System.out.println("renkler = " + renkler);

    }

    private static void sondanBirOnceyeElementEkleme(ArrayList<String> renkler) {

        String input="purple";

        renkler.add(renkler.size()-1,input);


    }

    private static void elementiBasaEkleme(ArrayList<String> renkler) {

        String input="white";

        renkler.add(0,input);





    }
}
