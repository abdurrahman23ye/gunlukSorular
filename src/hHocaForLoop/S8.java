package hHocaForLoop;

public class S8 {

    public static void main(String[] args) {
         /* TASK :
        Kullanicidan bir String isteyin. Kullanicinin girdigi
        String’in palindrome olup olmadigini kontrol eden bir program yazin.

         */

        String input="kısık";

        String[] input1=input.split("");

        Boolean palindrome=false;

        for (int i = 0; i <input1.length ; i++) {

            if(input1[i].equals(input1[input1.length-1-i])){
                palindrome=true;
            }else {palindrome=false;}

        } if (palindrome){
            System.out.println("Bu bir palindromedur");
        }else {
            System.out.println("Bu bir palindrome değildir.");
        }
    }
}
