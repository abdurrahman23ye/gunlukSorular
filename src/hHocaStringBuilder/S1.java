package hHocaStringBuilder;

public class S1 {
    public static void main(String[] args) {

        /*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I
	        It is not a palindrome"

		 */

        StringBuilder sb1=new StringBuilder("I love Java");

        sb1.reverse();

        System.out.println("sb1 = " + sb1);

        String[] input= sb1.toString().split("");

        boolean polindromMu=true;

        for (int i = 0; i < input.length ; i++) {

            if(input[i].equals(input[input.length-1-i])){}else {polindromMu=false;;}}

        if(polindromMu){
            System.out.println("polindrom");
        }else{System.out.println("polindrom değil");}

    }
}
