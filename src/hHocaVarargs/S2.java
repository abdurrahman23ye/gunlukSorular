package hHocaVarargs;

public class S2 {
    public static void main(String[] args) {
        // verilen int lerden ilki haric tum sayilari toplayan ve
        // buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.

        int input=2;
        int input1=2;
        int input2=3;
        int input3=4;

        islem(input,input1,input2,input3);
    }

    private static void islem(int input,int...input1) {

        int toplam=0;

        for (int each: input1
             ) { toplam+=each;}
        System.out.println(input*toplam);}
}
