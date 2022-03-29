package hHocaProje;

import java.util.Random;
import java.util.Scanner;

public class tasKagitMakas {

    static Scanner scan=new Scanner(System.in);
    static Random rnd=new Random();





    public static void main(String[] args) {

        System.out.println("Tas,kagit,makas oynamak ister misiniz?\n Evet için 1'e basiniz.\n Hayir için 2'e basiniz.");

        int oyunTercihi=scan.nextInt();





        if(oyunTercihi==1){

            tasKagitMakasOyunu();


        } else if(oyunTercihi==2){

            System.out.println("Hoşçakal");
        } else{
            System.out.println("Hatali giriş yaptiniz. Lütfen 1 ya da 2 tercihi yapiniz.");

            oyunTercihi=scan.nextInt();

            if(oyunTercihi==1){

                tasKagitMakasOyunu();


            } else if(oyunTercihi==2){

                System.out.println("Hoşçakal");
            }

        }





        }






    private static void tasKagitMakasOyunu() {


        System.out.println("Lütfen tas,kagit ya da makas tercihlerinden birini yazarak belirtiniz");

        String kullaniciTercihi= scan.next().toLowerCase();

        //tas=0 kağıt=1 makas=2

        int bilgisayarTercihi= rnd.nextInt(2);

        int kullaniciSayac=0;
        int bilgisayarSayac=0;

        if(kullaniciTercihi.equals("tas")){

            if(bilgisayarTercihi==0){
                System.out.println("Bilgisayarin da tercihi tas Berabere");
            } else if(bilgisayarTercihi==1){
                System.out.println("Bilgisayarin tercihi kagit; bilgisayar kazandi.");

                bilgisayarSayac++;
            } else if (bilgisayarTercihi==2){
                System.out.println("bilgisayarin tercihi makas;kullanici kazandi.");

                kullaniciSayac++;
            }
        }

        if(kullaniciTercihi.equals("kagit")){

            if(bilgisayarTercihi==0){
                System.out.println("Bilgisayarin tercihi tas;kullainici kazandi");

                kullaniciSayac++;
            } else if(bilgisayarTercihi==1){
                System.out.println("Bilgisayarin tercihi de kagit; berabere");


            } else if (bilgisayarTercihi==2){
                System.out.println("bilgisayarin tercihi makas;bilgisayar kazandi.");

                bilgisayarSayac++;
            }
        }

        if(kullaniciTercihi.equals("makas")){

            if(bilgisayarTercihi==0){
                System.out.println("Bilgisayarin tercihi tas;bilgisayar kazandi");

                bilgisayarSayac++;


            } else if(bilgisayarTercihi==1){
                System.out.println("Bilgisayarin tercihi kagit; kullanici kazandi.");
                kullaniciSayac++;


            } else if (bilgisayarTercihi==2){
                System.out.println("bilgisayarin tercihi de makas;berabere");


            }
        }
        System.out.println("oyuna devam etmek için 1; sonlandirmak için 2'e basin.");

        int kullaniciTercihi2=scan.nextInt();

        if(kullaniciTercihi2==1){

            tasKagitMakasOyunu();

        } else if (kullaniciTercihi2==2){

            sonuc(kullaniciSayac,bilgisayarSayac);
        } else{
            System.out.println("Hatali giriş yaptiniz. Lütfen 1 ya da 2 tercihi yapiniz.");

            kullaniciTercihi2=scan.nextInt();

            if(kullaniciTercihi2==1){

                tasKagitMakasOyunu();


            } else if(kullaniciTercihi2==2){

                sonuc(kullaniciSayac,bilgisayarSayac);
            }

        }


    }

    private static void sonuc(int kullaniciSayac, int bilgisayarSayac) {

    if(kullaniciSayac>bilgisayarSayac){
        System.out.println("Kazanan kullanici:"+"kullanici-"+kullaniciSayac+"-"+"bilgisayar"+bilgisayarSayac);
    }else if(kullaniciSayac<bilgisayarSayac){
        System.out.println("Kazanan bilgisayar:"+"kullanici-"+kullaniciSayac+"-"+"bilgisayar"+bilgisayarSayac);
    }else{
        System.out.println("Oyun berabere bitti:"+"kullanici-"+kullaniciSayac+"-"+"bilgisayar"+bilgisayarSayac);
    }


    }
}



