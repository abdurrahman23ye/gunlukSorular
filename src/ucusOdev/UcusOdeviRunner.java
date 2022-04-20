package ucusOdev;

import java.util.Scanner;

public class UcusOdeviRunner {

    static Scanner scan=new Scanner(System.in); // 1. static olmasına ihtiyaç duyabileceğim için ne olur ne olmaz Scanner ı buraya aldım.



    public static void main(String[] args) {

          /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz

         */

        System.out.println("Lütfen gitmek istediğiniz şehri seçiniz. \n1.A \n2.B \n3.C");

        int sehirTercihi= scan.nextInt();

        System.out.println("Lütfen yaşınızı belirtiniz.");

        int yasTercihi=scan.nextInt();

        System.out.println("Dönüş bileti de isterseniz lütfen 1'e basiniz.");

        int biletTercihi=scan.nextInt();

         new UcusOdevi(sehirTercihi,yasTercihi,biletTercihi);











    }
}
