package ucusOdev;




public class UcusOdevi {



  static   double ASehri=500;
   static double BSehri=700;
   static double CSehri=900;

   public UcusOdevi(int sehitTercihi,int yasBilgisi,int donusTercihi){

       if(sehitTercihi==1){ ASehri=500*0.1; }
       if(sehitTercihi==2){ BSehri=700*0.1; }
       if(sehitTercihi==3){ CSehri=900*0.1; }

       if(yasBilgisi>65){
           ASehri=ASehri-ASehri*30/100;
           BSehri=BSehri-BSehri*30/100;
           CSehri=CSehri-CSehri*30/100;

       }

       else if(yasBilgisi>=12 && yasBilgisi<=24){

           ASehri=ASehri-ASehri*10/100;
           BSehri=BSehri-BSehri*10/100;
           CSehri=CSehri-CSehri*10/100;

       }
       else if(yasBilgisi>12){

           ASehri=ASehri-ASehri*50/100;
           BSehri=BSehri-BSehri*50/100;
           CSehri=CSehri-CSehri*50/100;
       }

       if(donusTercihi==1){
           ASehri=ASehri-ASehri*20/100;
           BSehri=BSehri-BSehri*20/100;
           CSehri=CSehri-CSehri*20/100;

       }

       if(sehitTercihi==1){System.out.println("ödemeniz gereken ücret:"+ASehri);}
       if(sehitTercihi==2){System.out.println("ödemeniz gereken ücret:"+BSehri);}
       if(sehitTercihi==3){System.out.println("ödemeniz gereken ücret:"+CSehri);}





   }











  }




        /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz




    sehirTercihi(ucretAsehri,ucretBsehri,ucretCsehri,sehirTercihi);

}

    private static void sonuc1(double ucretAsehri, double ucretBsehri, double ucretCsehri, int sehirTercihi) {

        if(sehirTercihi==1){System.out.println(ucretAsehri);}
        if(sehirTercihi==2){System.out.println(ucretBsehri);}
        if(sehirTercihi==3){System.out.println(ucretCsehri);}}


    private static void sehirTercihi(double ucretAsehri, double ucretBsehri, double ucretCsehri, int sehirTercihi) {


        if(sehirTercihi==1)ucretBsehri=70;
        if(sehirTercihi==2)ucretBsehri=70;
        if(sehirTercihi==3)ucretCsehri=90;

        yasBilgisi(ucretAsehri,ucretBsehri,ucretCsehri,sehirTercihi);}

    private static void biletBilgisi(double ucretAsehri, double ucretBsehri, double ucretCsehri, int sehirTercihi) {

        System.out.println("Dönüş bileti de almak istiyorsanız 1'e basın");
        int donusTercihi= scan.nextInt();
        if(donusTercihi==1){
            ucretAsehri=ucretAsehri-ucretAsehri*20/100;
            ucretBsehri=ucretBsehri-ucretBsehri*20/100;
            ucretCsehri=ucretCsehri-ucretCsehri*20/100;
            sonuc1(ucretAsehri,ucretBsehri,ucretCsehri,sehirTercihi);
        }
    }

    private static void yasBilgisi(double ucretAsehri, double ucretBsehri, double ucretCsehri, int sehirTercihi) {

        System.out.println("Lütfen yasinizi giriniz.");

        int yasbilgisi=scan.nextInt();

        if(yasbilgisi>65){
            ucretAsehri=ucretAsehri-ucretAsehri*30/100;
            ucretBsehri=ucretBsehri-ucretBsehri*30/100;
            ucretCsehri=ucretCsehri-ucretCsehri*30/100;
        }

        else if(yasbilgisi>=12 && yasbilgisi<=24){
            ucretAsehri=ucretAsehri-ucretAsehri*10/100;
            ucretBsehri=ucretBsehri-ucretBsehri*10/100;
            ucretCsehri=ucretCsehri-ucretCsehri*10/100;
        }
        else if(yasbilgisi>12){
            ucretAsehri=ucretAsehri-ucretAsehri*50/100;
            ucretBsehri=ucretBsehri-ucretBsehri*50/100;
            ucretCsehri=ucretCsehri-ucretCsehri*50/100;

        }

        biletBilgisi(ucretAsehri,ucretBsehri,ucretCsehri,sehirTercihi);  }}

}

         */
