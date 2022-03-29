package aHocaDay2;

public class S3 {

    public static void main(String[] args) {
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
        String gun="Sali";

        switch (gun){

            case "Pazartesi":
            case "Sali":
                System.out.println("Java dersleri"); break;
            case "Perşembe":
            case "Cuma":
                System.out.println("Selenyum"); break;
            case "Çarşamba":
            case "Cumartesi":
                System.out.println("SQL"); break;
            default:
                System.out.println("İzin günü"); // hoca öyle istemiş diye buraya gün giriniz daha uygun olabilirdi.
        }

    }
}
