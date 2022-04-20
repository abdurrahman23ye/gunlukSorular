package aHocaDay6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S2 {

    public static void main(String[] args) {
        // String[] list = {"fruits", "vegetables", "meat", "milk"};
        // print array with for each loop
        // print length of each element

        // Part 2:
        // Print all the elements from array using for eachLoop
        // If an element starts with 'v' then quit the loop

        String[] list = {"fruits", "vegetables", "meat", "milk"};

        List<String> list1 = new ArrayList<>();


        for (String each : list) {
            System.out.print(each.split("").length + " ");
        }


        for (String each : list) {
            if (each.startsWith("v")) {
                break;
            }
            System.out.println(each);
        }


    }}