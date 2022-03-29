package hHocaTask;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */

        Scanner scan=new Scanner(System.in);

        int input= scan.nextInt();

        ikininKuvvetiMi(input);
    }

    private static void ikininKuvvetiMi(int input) {

        boolean ikininKuvvetiMi=false;

        for (int i = 2; i <=input ; i*=i) {

            if(i==input){
                ikininKuvvetiMi=true;
            }

        }
        System.out.println("ikininKuvvetiMi = " + ikininKuvvetiMi);

    }
}
