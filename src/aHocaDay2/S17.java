package aHocaDay2;

public class S17 {

    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        String input="kelime";
        String input2="ali";

        String sonuc= input.length()>input2.length()?"input daha uzun":"input2 daha uzun";
        System.out.println("sonuc = " + sonuc);
    }
}
