package hHocaList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

        Scanner scan=new Scanner(System.in);

        int input= scan.nextInt();

        List<Integer> list= new ArrayList<>();

        list.add(1);
        list.add(1);

        for (int i = 1; i <input ; i++) {




                    list.add(list.get(list.size()-1)+list.get(list.size()-2));

            i=list.get(list.size()-1);

        }

        System.out.println(list);
    }
}
