package hHocaStringM;

import java.util.Scanner;

public class S1 {

    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scan=new Scanner(System.in);

        String input= scan.nextLine();

        boolean boslukVarMi=false;

        if(input.contains(" ")){boslukVarMi=true;}

        System.out.println(boslukVarMi);

    }
}
