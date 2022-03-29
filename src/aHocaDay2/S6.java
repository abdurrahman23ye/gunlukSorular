package aHocaDay2;

public class S6 {

    public static void main(String[] args) {
        /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */

        int input=1;

       // String sonuc= input<10 && input>0?"geçerli":"geçersiz";

      //  System.out.println("sonuc = " + sonuc);

        String sonuc="";

        if(input<10 && input>0){

            if(input==1){
                System.out.println(sonuc="bir");
            }else if(input==2){
                System.out.println(sonuc="iki");
            }else if(input==3){
                System.out.println("üç");}
            else if(input==4) {
                System.out.println("dört");
            } else if(input==5){
                System.out.println("beş");}
            else if(input==6){
                System.out.println("alti");}else if(input==7){
                System.out.println("yedi");}
            else if(input==8){
                System.out.println("sekiz");}
            else if(input==9){
                System.out.println("dokuz");}
            else{
            System.out.println("sayi geçersiz");
        }



    }}
}
