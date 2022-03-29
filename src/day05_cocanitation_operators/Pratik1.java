package day05_cocanitation_operators;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Pratik1 {



    public static void main(String[] args) {

        /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */










    }}

        /*
        /*
		Kullanicidan bir kelime girmesini isteyin.
		 Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		 kelimenin ortasindaki karakteri yazdirin.


    Scanner scan= new Scanner(System.in);

    String kelime= scan.next();


    int karakterSayisi= kelime.length();
    int SonIndex=kelime.length()-1;

        if(kelime.length() %2==1 && kelime.length()>=3 ){
                char ortadakiKarakter= kelime.charAt(karakterSayisi/2) ;

                System.out.println(ortadakiKarakter);
                } else{
                System.out.println("direktif yok.");
                }





        String name1= "mehmet";

        String name2= "ahmet";

        int uzunluk= name1.length();
        int index= name1.length()-1;

        if(uzunluk %2==0){
            System.out.println(name1.substring(0,(index/2)+1)+name2+name1.substring((index/2)+1));
        }else if (uzunluk%2!=0){
            System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");
        }


                  girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz

         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false


        String kelime ="axyzm" ;

         if(kelime.contains("xyz")){
             System.out.println("true");
         } else {
             System.out.println("false");
         }

         */





























          /* String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)

          ORNEK:          INPUT     OUTPUT
                          goat        gat
                         photo        hoto
                         ghost        ghost
                         kalem        lem



    String kelime= "goat";
    String kelime1= "photo";
    String kelime2= "ghost";
    String kelime3= "kalem";

    String sonuc=kelime3;



        if(sonuc.substring(0,1).equals("g")){ if(sonuc.substring(1,2).equals("h")){
                System.out.println(sonuc);
                }else if (!sonuc.substring(1,2).equals("h")){
                System.out.println((sonuc.substring(0,1))+sonuc.substring(2));
                }} else if(!sonuc.substring(0,1).equals("g")){ if(sonuc.substring(1,2).equals("h")){
                System.out.println(sonuc.substring(1));
                }else if (!sonuc.substring(1,2).equals("h")){
                System.out.println(sonuc.substring(2));
                }}

        Scanner scan= new Scanner(System.in);

        String isim= scan.next().toLowerCase();

        String SoyIsim= scan.next().toUpperCase();

        String KrediKarti= scan.next();

        String yeniIsim= isim.substring(0,1).toUpperCase()+ (isim.substring(1).replaceAll("\\w","*"));

        System.out.println("yeniIsim = " + yeniIsim);

        String yeniSoyIsim= SoyIsim.substring(0,1).toUpperCase()+ (SoyIsim.substring(1).replaceAll("\\w","*"));

        System.out.println("yeniIsim = " + yeniSoyIsim);

         */


          /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.

     *


        String kelime1= scan.next();
        String kelime2= scan.next();
        String kelime3= scan.next();
        String kelime4= scan.next();
        String nokta=".";
        String bosluk= " ";

        String cumle= kelime1.concat(bosluk).concat(kelime2).concat(bosluk).concat(kelime3).concat(bosluk).concat(kelime4).concat(nokta);
        System.out.println(cumle);


         // kullanicidan 4 kelimeli bir kelime isteyin ve bunu tersten yazdırın.

        String str= scan.next();

        int index= str.length()-1;

        if(index==3) {

            String str2 = str.substring(3) + str.substring(2, 3) + str.substring(1, 2) + str.substring(0, 1);

            System.out.println("str2 = " + str2);

        } else{
            System.out.println("lütfen 4 harfli bir kelime giriniz.");
        }


         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el


    Scanner scan= new Scanner(System.in);

    String str= scan.next();

    int sonIndex= str.length()-1;

        System.out.println("sonIndex = " + sonIndex);

                if(sonIndex>=2){
                System.out.print(str.substring(sonIndex-1));
                System.out.print(str.substring(sonIndex-1));
                System.out.print(str.substring(sonIndex-1));

                }else{
                System.out.println(str);
                }



               // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"

        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        String  str1= "$13.99";
        String str2= "$10.55";

        str1= str1.replaceAll("/D","");
        str2= str2.replaceAll("/D","");



        str1= str1.substring(1);
        str2= str2.substring(1);

        System.out.println("str2 = " + str2);
        System.out.println("str1 = " + str1);

        double a= Double.valueOf(str1) +  Double.valueOf(str1);



        System.out.println("a = " + a);


        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen iki kelime giriniz");
        System.out.println("ilk kelime");

        String str1= scan.next();
        System.out.println("ikinci kelime");
        String str2= scan.next();

        String str3, str4;

        str3= str1.concat(str2);
        System.out.println("str3 = " + str3);

        str4= str1.substring(1)+str2.substring(1);

        System.out.println("str4 = " + str4);




    }}

// 2 Strings olusturun -> string1 = "01234" and string2 = "56789"
    // 1.yol: concat() function ile concatenate string1 and string2
    // 2.yol: operator kullanarak concatenate string1 and string2
    // konsolda yazdiriniz

    /*

    String str1="01234", str2="56789" ,str3, str4;

        str3=str1.concat(str2);

                str4= str1+str2;

                System.out.println("str3 = " + str3);
                System.out.println("str4 = " + str4);






         /*
          /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz


    Scanner scan= new Scanner(System.in);

    int sayi= scan.nextInt();

    String sonuc= sayi<0 || sayi>9? "geçersiz": "rakam";

        System.out.println("sonuc = " + sonuc);

                if(sayi<0 || sayi>9){
        System.out.println("geçersiz");
        }else {
        System.out.println("rakam");
        }



		 * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
		 * ornek
		 *  Kullanici  : A , B , C harflerinden birini secsin
			 A'yi secmis ise, ==> Java is easy
			 B'yi secmis ise, ==> Java is fun
			 C'yi secmis ise, ==> I need to study :)


        Scanner scan= new Scanner(System.in);

        char harf= scan.next().toUpperCase().charAt(0);

        switch (harf) {

            case 'A':
                System.out.println("Java is easy");
                break;
            case 'B':
                System.out.println("Java is fun");
                break;

            case 'C':
                System.out.println("I need to study");
                break;

            default:
                System.out.println("A, B veya C giriniz.");
                break;
        }


          */








        /*
        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen günü giriniz");

        String gun= scan.next().toLowerCase();

        switch (gun) {

            case "pazartesi":
            case "salı":
                System.out.println("Java dersi gunleri");
                break;
            case "çarşamba":
                System.out.println("SQL dersi gunleri");
                break;
            case "perşembe":
            case "cuma":
                System.out.println("Selenyum dersi gunleri");
                break;
            case "cumartesi":
                System.out.println("SQL dersi gunleri");
                break;
            case "pazar":
                System.out.println("izin gunu");
                break;
        }
        }
    }

         /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)


          */




    /*

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen not giriniz:(A,B,C)");

        char finalNotu= scan.next().toUpperCase().charAt(0);



       String sonuc= finalNotu=='A'? "gayet basarılı":finalNotu=='B'? "Basarili":"Ha gayret";

        System.out.println("sonuc = " + sonuc);

          /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz

    Scanner scan=


     */



      /*  Kullanici dan yas bilgisini alarak

        oy kullanma yasi :
        age >= 18  ==> oy kullanmaya uygun
        age >= 70  ==> uc kez oy kullanabilir
        70 > age >=50 ==> iki kez oy kullanabilir
        50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz




        Scanner scan= new Scanner(System.in);

        int kullaniciYasi= scan.nextInt();

        if(kullaniciYasi>=18){ if (kullaniciYasi>=70){
            System.out.println("üç oy");
        }else if (kullaniciYasi>=50){
            System.out.println("iki oy");} else {
            System.out.println(" oy kullanabilir.");



        } }else if (kullaniciYasi>=0 && kullaniciYasi<18) {
            System.out.println("oy kullanamazsiniz.");
        } else {
            System.out.println("Lütfen geçerli bir yaş giriniz.");
        }


    }}

        /*

        String arananKelime="1-48 of 132 results for \"nutella\"";

        int ilkBosluk=arananKelime.indexOf(" ");
        System.out.println("ilkBosluk = " + ilkBosluk);


        int ikinciBosluk= arananKelime.indexOf(" ",ilkBosluk+1);
        System.out.println("ikinciBosluk = " + ikinciBosluk);
        int ucuncuBosluk= arananKelime.indexOf(" ",ikinciBosluk+1);
        System.out.println("ucuncuBosluk = " + ucuncuBosluk);


        String sayi= arananKelime.substring(ikinciBosluk+1,ucuncuBosluk);

        System.out.println(sayi);

        //Buraya kadar sorun yok



      int b;
        b = Integer.valueOf(sayi);

        // b saut'tan çıkmıyor; Mehmet hocanın yaptığından farkı bulamıyorum.


      // (int a= Integer.parseInt(sayi)); farklı yöntem deneyeyim dedim, bu da olmadı

       // Integer c= a; denemiş olayım dedim, bu da olmadı
      //  Integer d= b; denemiş olayım dedim, bu da olmadı

        if (b>100) {
            System.out.println("deneme");
        }else{
            System.out.println("deneme 2");
        }



        System.out.println(b);






        
    }}

       /* TASK :
        Kullanicidan bir sayi aliniz
        Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
                Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.




        Scanner scan= new Scanner(System.in);

        int sayi= scan.nextInt();

        String karsilastirma= sayi>0 ? sayi<10? "rakam": "pozitif sayı": "negatif sayı";

        System.out.println("karsilastirma = " + karsilastirma);
    }}

       // Kullanıcıdan vize ve final notlarını alınız.
        //Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
       // not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
       // "Malesef dersten kaldınız..." yazdırınız

        /*

        eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak AA,
        80(80dahil)   ile 90 arasında ise  BA,
                70(70 dahil)   ile 80 arasında ise BB,
                60(60dahil) ile 70 arasında ise CB,
                50(50 dahil) ile 60 arasında ise CC,
                40(40 dahil) ile 50 arasında ise DC,
                30(30 dahil) ile 40 arasında ise DD,
                30 'dan düşük ise FF            gelmeli.

                /*
         */

        /*

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen vize notunu giriniz");



        double vizeNotu= scan.nextDouble();

        System.out.println("Lütfen final notunu giriniz");
        double finalNotu= scan.nextDouble();

        System.out.println("Lütfen vize oranını giriniz");


        double vizeOrani= scan.nextDouble();
        System.out.println("Lütfen final oranını giriniz");
        double finalOrani= scan.nextDouble();

        double sonuc= (vizeNotu*(vizeOrani/100)+ (finalNotu*finalOrani/100));

        if( vizeOrani+finalOrani!= 100){
            System.out.println("vize oranı ya da final oranını hatalı girdiniz. ");
        } else if (vizeNotu<0 || finalNotu<0) {System.out.println("Notlarınızı ");}



        if(sonuc>=90){
            System.out.println("harfnotu: AA");
        } else if(sonuc>=80 && sonuc<90){
            System.out.println("harfnotu: BA");}
        else if(sonuc>=70 && sonuc<80){
            System.out.println("harfnotu: BB");}
        else if(sonuc>=60 && sonuc<70){
            System.out.println("harfnotu: diğerleri");}







    }}

        /*

       // Kullanıcıdan bir tarihi gün, ay ve yıl şeklinde alıp bu tarihi
        //ay, gün, yıl ve yıl, ay, gün sıralarına çevirerek yazan bir kod yazınız.

        Scanner scan= new Scanner(System.in);

        int gun= scan.nextInt();
        int ay= scan.nextInt();
        int yil= scan.nextInt();

        if (ay==2 && gun>29) {System.out.println("lütfen geçerli bir tarih giriniz");} else

        if(gun>0 && gun<32 && ay>0 && ay<13) {



            System.out.println(ay + "." + gun + "." + yil);

            System.out.println(yil + "." + ay + "." + gun);




            }

    else {
            System.out.println("lütfen geçerli bir tarih giriniz");
        }





    }}


        /*

        System.out.println("Lütfen 4 basamaklı bir sayı giriniz.");

        Scanner scan= new Scanner(System
                .in);

        double sayi= scan.nextDouble();
        double sonBasamak= sayi%10;

        if (sayi<1000 || sayi>9999){
            System.out.println("Lütfen dört basamaklı bir sayı giriniz.");
        } else if( sayi %5==0 && sonBasamak==0 ){
            System.out.println("5'e bölünebilen dört basamaklı çift sayı");
        } else if( sayi %5==0 && sonBasamak==5 ){
            System.out.println("5'e bölünebilen dört basamaklı tek sayı");}else{
            System.out.println("Lütfen 5'e bölünebilen bir sayı yazınız.");
        }




    }}

        /*
        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen şifre giriniz.");

        String sifre= scan.next();

        if(sifre.charAt(0)>='a' && sifre.charAt(0)<='z'){
            if (sifre.equals("a")){
                System.out.println("Geçerli şifre");
            }else{
                System.out.println("şifreniz geçersiz.");
            }
        }  else if(sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            if (sifre.equals("A")){
                System.out.println("Geçerli şifre");
            }else{
                System.out.println("şifreniz geçersiz.");
            }}else {
            System.out.println("Lütfen harflerden oluşan bir şifre giriniz.");
        }








        }

    }





    /*

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        double sayi= scan.nextDouble();

        if (sayi%5==0 && sayi%8==0){
            System.out.println("sayi 5 ve 8'e bölünür.");
        } else if(sayi% 10==5 && sayi%9==0){
            System.out.println("Sayi 9'a tam bölünür ve 10'a bölümünden kalan 5'tir.");
        }









        /*

        TASK :
        45 değerinde bir double oluşturun.
        Eğer double 5'e bölününce kalan 0 ise ve double 8'e bölününce kalan 0 ise
        "able to divide by 5 and 8" yazdırınız.
                Eğer double 10'a bölününce kalan 5 ise ve double 9'a bölününce kalan 0 ise
        "able to divide by 9 and divide by 10 reminder is 5" yazdırınız.
                */





    /*
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen ürün adedini giriniz");
        int urunAdedi= scan.nextInt();
        System.out.println("Lütfen ürün fiyatını giriniz");
        int urunFiyati= scan.nextInt();
        System.out.println("Müşteri kartınız var mı (evet ya da hayır)");
        String musteriKarti= scan.next();



        if (musteriKarti.equalsIgnoreCase("evet")){

            if(urunAdedi>10) {urunFiyati=urunFiyati-(urunFiyati/5);

                System.out.println(urunAdedi);
                System.out.println(urunFiyati);
                int odenecekFiyat= urunAdedi*urunFiyati;

                System.out.println("odenecekFiyat = " + odenecekFiyat);}

            else if(urunAdedi<11 && urunAdedi>0){
                urunFiyati=urunFiyati-(urunFiyati*15/100);

                System.out.println(urunAdedi);
                System.out.println(urunFiyati);
                int odenecekFiyat= urunAdedi*urunFiyati;

                System.out.println("odenecekFiyat = " + odenecekFiyat);
            } else if(urunAdedi<0){
                System.out.println("Lütfen 0'dan büyük bir sayı giriniz");

            }
        } else if (musteriKarti.equalsIgnoreCase("hayır")){

            if(urunAdedi>10) {urunFiyati=urunFiyati-(urunFiyati*15/100);

                System.out.println(urunAdedi);
                System.out.println(urunFiyati);
                int odenecekFiyat= urunAdedi*urunFiyati;

                System.out.println("odenecekFiyat = " + odenecekFiyat);

            } else if(urunAdedi<11 && urunAdedi>0){
                urunFiyati=urunFiyati-(urunFiyati/10);

                System.out.println(urunAdedi);
                System.out.println(urunFiyati);
                int odenecekFiyat= urunAdedi*urunFiyati;

                System.out.println("odenecekFiyat = " + odenecekFiyat);
            } else if(urunAdedi<0){
                System.out.println("Lütfen 0'dan büyük bir sayı giriniz");
            }





        }




     /*   Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
* musteri karti olup olmadigini sorun
                * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
* Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
* alirsa %10 indirim yapan code create ediniz.


      */


       // * TASK :
 // Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada
    //    hatali giris seklinde code create ediniz

        /*System.out.println("Lütfen bir harf giriniz.");

        Scanner scan= new Scanner(System.in);

        char karakter= scan.next().charAt(0);

        if (karakter>='a' && karakter<='z'){
            System.out.println("küçük harf");
        } else if(karakter>='A' && karakter<='Z' ){
            System.out.println("Büyük harf");
        }else {
            System.out.println("hatalı giriş");
        }



    }}

        /*
    }

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen x değerini giriniz");


        int x= scan.nextInt();

        System.out.println("Lütfen y değerini giriniz");

        int y= scan.nextInt();

        if (x>0 && y>0) {
            System.out.println("1. bölge");
        } else if (x<0 && y>0) {
            System.out.println("2. bölge");
        } else if (x<0 && y<0) {
            System.out.println("3. bölge");
        } else if (x>0 && y<0) {
            System.out.println("4. bölge");
        }



        //TASK :  Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız


        


        /*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.


        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen kilonuzu giriniz");


        int kilo = scan.nextInt();

        System.out.println("Lütfen yaşınızı giriniz");

        int yas= scan.nextInt();

        if(yas<18){
            System.out.println("Kan bağışı yapamazsınız.");
        } else if(yas>=18) { if(kilo>=50){
            System.out.println("Kan bağışı yapabilirsiniz.");
        }else if(kilo<50){
            System.out.println("Kan bağışı yapamazsınız.");
        }}


    }}

        /*  TASK :
		 *  Kullanicidan IT alanini bilgisini alarak console'a
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		bilgilileri yazdiriniz


        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen IT bilginizi giriniz: ( qa, dev, ba, pm)");

        String bilgi= scan.next();

        if(bilgi.equalsIgnoreCase("qa")){
            System.out.println("Quality Analyst");
        }else if(bilgi.equalsIgnoreCase("dev")){
            System.out.println("Developer");} else if(bilgi.equalsIgnoreCase("ba")){
            System.out.println("Business analyst");} else if(bilgi.equalsIgnoreCase("pm")){
            System.out.println("Project Manager");} else{
            System.out.println("Lütfen geçerli bir bilgi girişi yapınız");
        }

        */





        /*


        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen kilonuzu giriniz");


        double kilo = scan.nextDouble();

        System.out.println("Lütfen boyunuz giriniz(metre cinsi)");

        double boy= scan.nextDouble();



        double vucutKitleEndexi= kilo/(boy*boy);
        System.out.println("vucutKitleEndexi = " + vucutKitleEndexi);

        if(vucutKitleEndexi<=20){
            System.out.println("oldukça zayıfsınız");
        } else if(vucutKitleEndexi>20 && vucutKitleEndexi<=25){
            System.out.println("Normal sınırlardasınız");
        } else if(vucutKitleEndexi>25 && vucutKitleEndexi<=30){
            System.out.println("fazla kilonuzu mevcut");
        } else if(vucutKitleEndexi>30){
            System.out.println("Obezite riski");
        }


    }}

        /* TASK :
		 * Kullanicinin boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.






        /*


        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz.");

        int kenar1= scan.nextInt();

        int kenar2= scan.nextInt();

        int kenar3= scan.nextInt();

        if(kenar1<1 || kenar2<1 || kenar3<1){
            System.out.println("Lütfen geçerli bir uzunluk giriniz.(0'dan büyük)");
        }

        if(kenar2-kenar3<kenar1 &&kenar1< kenar2+kenar3 && kenar2-kenar1<kenar3 &&kenar3< kenar2+kenar1 &&

        kenar1-kenar3<kenar2 &&kenar2< kenar1+kenar3){
            System.out.println("Üçgen için uygun kenar uzunlukları");
        } else if (kenar1==kenar2 && kenar3==kenar2){
            System.out.println("eşkenar üçgen");
        }else{
            System.out.println("üçgen için geçersiz uzunluklar girdiniz.");
        }

        //  TASK :
	 //*  Kullanicidan 3 tene pozitif  tam sayi alniz.
	 //*  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	   // eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

    }
}

    /*

    public static void main(String[] args) {



        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen işlem yapmk istediğiniz ilk ve ikinci sayıyı giriniz.");

        System.out.println("İlk sayı");

        double sayi1= scan.nextDouble();

        System.out.println("İkinci sayı");
        double sayi2= scan.nextDouble();

        System.out.println("Lütfen yapmak istediğiniz işlemi yazınız");

        String islem= scan.next().toLowerCase(Locale.ROOT);

        switch (islem){

            case "toplama":
                System.out.println(sayi1+"+"+sayi2+"="+(sayi1+sayi2));break;
            case "çıkarma":
                System.out.println(sayi1+"-"+sayi2+"="+(sayi1-sayi2));break;
            case "çarpma":
                System.out.println(sayi1+"*"+sayi2+"="+(sayi1*sayi2));break;
            case "bölme":
                System.out.println(sayi1+"+"+sayi2+"="+(sayi1/sayi2));break;

            default:
                System.out.println("Lütfen geçerli bir işlem yazınız.");break;
        }




        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */






    /*soru10

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen hızınızı giriniz.");

     int hiz= scan.nextInt();

        System.out.println("Lütfen ehliyet durumunuzu(var ya da yok) giriniz.");

     String ehliyetDurumu= scan.next();

     int ehliyetCezasi=0;
     int hizCezasi;

     int toplamCeza;

        String var= "var";
     String yok= "yok";



     if (ehliyetDurumu.equalsIgnoreCase(var)){ ehliyetCezasi=0;} else if (ehliyetDurumu.equalsIgnoreCase(yok)){
        ehliyetCezasi=200;
     }else  {
         System.out.println("Lütfen var ya da yok ifadelerini giriniz.");
     }

     if(hiz>54 && hiz< 75){hizCezasi=100;} else if (hiz>74 && hiz< 84){hizCezasi=150;} else if(hiz>84 && hiz< 95){hizCezasi=320;}

     else if(hiz>94){hizCezasi=500;} else {hizCezasi=0;}

      toplamCeza= (hizCezasi + ehliyetCezasi);

        System.out.println(toplamCeza);




     }



     */






