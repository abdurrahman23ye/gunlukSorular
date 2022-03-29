package gun4;

public class S8 {

    public static void main(String[] args) {

         /* TASK :
        Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */

        int input=40;

        for (int i = 1; i <=input-2 ; i++) {

           if(i %2==1){ System.out.print(i+"-");}

        } if((input-2)%2==0){
            System.out.print(input-1);
        } else if((input-2)%2!=0){
            System.out.println(input);
        }
    }
}
