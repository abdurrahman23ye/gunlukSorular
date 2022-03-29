package hHocaArr;

public class S8 {

    public static void main(String[] args) {
        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

        dolareuroayırma(str);


        }


    private static void dolareuroayırma(String str) {

        String[] str1= str.split(" ");

        String[] str2=new String[str1.length];
        String[] str3=new String[str1.length];


        int dolarToplam=0;
        int euroToplam=0;



        for (int i = 0; i < str1.length; i++) {

            if(str1[i].contains("$")){

                dolarToplam+= Integer.valueOf(str1[i].replace("$",""));}

            else{euroToplam+=Integer.valueOf(str1[i].replace("£",""));}


        }System.out.println(dolarToplam);
        System.out.println(euroToplam);

    }
    }

