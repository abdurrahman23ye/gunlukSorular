package hHocaStringM;

public class S5 {

    public static void main(String[] args) {
         /*
        TASK :
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.

          */
        String  str1= "%13.99";
        String str2= "%10.55";

        System.out.println( Double.valueOf(str1. replaceAll("%",""))+Double.valueOf(str2. replaceAll("%","")));






    }
}
