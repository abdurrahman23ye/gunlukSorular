package hHocaStringM;

import java.util.Scanner;

public class S6 {

    public static void main(String[] args) {
         /*
        TASK :
        kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */

        Scanner scan=new Scanner(System.in);

        String input=scan.nextLine();

        if(input.contains("hotmail")){input=input.replaceAll("hotmail","gmail");}

        System.out.println("input = " + input);
    }
}
