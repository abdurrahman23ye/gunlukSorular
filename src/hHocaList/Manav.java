package hHocaList;

import java.util.Scanner;

public class Manav {

    static Scanner scan= new Scanner(System.in);



    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */

        //Geri dönersen not: Yanlışlıkla baslangic metodunuz içine seçim metodunu koydun ve scope yüzünden
        //  toparlamak çok zorlaşti o yüzden daha kasmadin
        // bu yüzden çok iyi bir çalışma olmayabilir.

        System.out.println("Lütfen almak istediğiniz ürünü seçiniz.\n1.Patates\n2.Soğan\n3.Domates\n4.Biber\n5.Elma");
        int baslangic = scan.nextInt();

        if(baslangic>5 || baslangic<1){baslangic(baslangic);}

        int secme=baslangic;

       urunsecme(secme);





    }

    private static void urunsecme(int secme) {
        double odenecekUcret=0;
        double kilo=0;
        double toplamucret=0;


        //1.Patates\n2.Soğan\n3.Domates\n4.Biber\n5.Elma"
        if(secme==1){

            System.out.println("Kaç kilo patates almak istiyorsunuz.");
            kilo= scan.nextInt();

            odenecekUcret=kilo*7.5;

            toplamucret +=odenecekUcret;
        }
        if(secme==2){

            System.out.println("Kaç kilo sogan almak istiyorsunuz.");

            odenecekUcret=kilo*7.5;

            toplamucret +=odenecekUcret;
        }
        if(secme==3){

            System.out.println("Kaç kilo domates almak istiyorsunuz.");

            odenecekUcret=kilo*17.5;

            toplamucret +=odenecekUcret;
        }
        if(secme==4){

            System.out.println("Kaç kilo biber almak istiyorsunuz.");

            odenecekUcret=kilo*22.5;

            toplamucret +=odenecekUcret;
        }if(secme==5){

            System.out.println("Kaç kilo elma almak istiyorsunuz.");

            odenecekUcret=kilo*7.5;
            toplamucret +=odenecekUcret;
        }
        System.out.println("alisverise devam etmek icin 1'e alis verisi sonlandirmak icin 2'e basiniz.");

        kilo= scan.nextInt();// halihazırda scanner var olduğu için yeniden oluştmak istemedim ama kilo ile alakali bir sonuc aramiyoruz.

        if(kilo==1){ urunsecme(secme);}
        else if(kilo==2){
            System.out.println(toplamucret); //cok uzadiği için hatali tercihleri kurcalamadim.
        }


    }

    private static void baslangic(int baslangic) {

        System.out.println("Hatali giriş yaptınız. Alışverişi sonlandırmak için 0'a basınız. Urun menusune donmek için 9'a basiniz.");
        baslangic=scan.nextInt();

        if(baslangic!=0 &&baslangic!=9 ){baslangic(baslangic);}

        else if(baslangic==0){
            System.out.println("Hoşçakalin");}

            else if(baslangic==9){
                System.out.println("Lütfen almak istediğiniz ürünü seçiniz.\n1.Patates\n2.Soğan\n3.Domates\n4.Biber\n5.Elma");
                baslangic = scan.nextInt();

                if(baslangic>5 || baslangic<1){baslangic(baslangic);}

                else{double urunsecım= scan.nextInt();
                urunsecım(urunsecım);
                }
            }

        }

    public static void urunsecım(double urunsecım) {

        double odenecekUcret=0;
        double kilo= scan.nextInt();
        double toplamucret=0;


        //1.Patates\n2.Soğan\n3.Domates\n4.Biber\n5.Elma"
        if(urunsecım==1){

            System.out.println("Kaç kilo patates almak istiyorsunuz.");

            odenecekUcret=kilo*7.5;

            toplamucret +=odenecekUcret;
        }
        if(urunsecım==2){

            System.out.println("Kaç kilo sogan almak istiyorsunuz.");

            odenecekUcret=kilo*7.5;

            toplamucret +=odenecekUcret;
        }
        if(urunsecım==3){

            System.out.println("Kaç kilo domates almak istiyorsunuz.");

            odenecekUcret=kilo*17.5;

            toplamucret +=odenecekUcret;
        }
        if(urunsecım==4){

            System.out.println("Kaç kilo biber almak istiyorsunuz.");

            odenecekUcret=kilo*22.5;

            toplamucret +=odenecekUcret;
        }if(urunsecım==5){

            System.out.println("Kaç kilo elma almak istiyorsunuz.");

            odenecekUcret=kilo*7.5;
            toplamucret +=odenecekUcret;
        }
        System.out.println("alisverise devam etmek icin 1'e alis verisi sonlandirmak icin 2'e basiniz.");

        kilo= scan.nextInt();// halihazırda scanner var olduğu için yeniden oluştmak istemedim ama kilo ile alakali bir sonuc aramiyoruz.

        if(kilo==1){urunsecım( urunsecım);}
        else if(kilo==2){
            System.out.println(toplamucret); //cok uzadiği için hatali tercihleri kurcalamadim.
        }





    }
}




