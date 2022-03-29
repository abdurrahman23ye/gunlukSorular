package aHocaDay2;

import java.util.Scanner;

public class S18 {

    public static void main(String[] args) {

        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.
        Scanner scan= new Scanner(System.in);

        String input=" ";
        boolean inputDoluMu=false;
        boolean inputtaBoslukVarMı=false;

        if(!input.isEmpty()) {inputDoluMu=true;}
        if(input.contains(" ")){ inputtaBoslukVarMı=true;}

        System.out.println("inputdaBoslukVarMı = " + inputtaBoslukVarMı);
        System.out.println("inputDoluMu = " + inputDoluMu);
    }
}
