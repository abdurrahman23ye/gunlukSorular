package hHocaMethodCreation;

public class S1 {

    public static void main(String[] args) {
        /* TASK :
           String girildiginde ilk iki karakteri haric string return eden java method yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */

        String input="kalem";

        String output= method(input);

        System.out.println(output);
    }

    private static String method(String input) {

        String output="";

        if(input.startsWith("gh")){output=input.substring(2);}
        else if(input.startsWith("g")&& !input.substring(1,2).equals("h")){output=input.substring(0,1)+input.substring(2);}
        else if(input.substring(1,2).equals("h")){output=input.substring(1);}
        else {output=input.substring(2);}


    return output;}
}
