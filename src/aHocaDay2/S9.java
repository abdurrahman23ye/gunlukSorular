package aHocaDay2;

public class S9 {

    public static void main(String[] args) {
        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey  */

        String  str1= "$13.99";
         String str2= "$10.55";

         String str11= str1.substring(1);
        String str12=str2.substring(1);

        double input=Double.valueOf(str11);
        System.out.println("str11 = " +input);
        double input2= Double.valueOf(str12);

        System.out.println(input+input2);


    }
}
