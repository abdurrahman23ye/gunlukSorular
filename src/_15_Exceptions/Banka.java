package _15_Exceptions;

import java.util.Scanner;

public class Banka {

    public static void main(String[] args) {

        anaMenu();


    }

     static void anaMenu() {
        System.out.println("Yapmak istediğiniz işlemi seçiniz \n1. Müşteri ekleme\n2.Hesaba para ekleme\n3.Hesaptan para çekme");

        Scanner scan=new Scanner(System.in);

        boolean flag=false;
        int tercih=0;

        do {

            flag = false;

            tercih = 0;
            try {
                tercih = scan.nextInt();

                if (tercih > 3 || tercih < 1) {
                    throw new IllegalAccessException();
                }


            } catch (IllegalAccessException e) {
                System.out.println("1 ile 3 arasında bir tercih yapınız.");
                flag = true;

            } catch (Exception e) {
                System.out.println("Hatalı giriş yaptınız tekrar deneyiniz.");
                flag = true;
            }
        }while (flag);

        int a=0;
        int b=0;

        switch (tercih){

            case 1: Accaunt.hesapOlusturma(a,b);break;
            case 2:Accaunt.paraEkleme();break;
            case 3: Accaunt.paraCekme();break;

        }
    }
}
