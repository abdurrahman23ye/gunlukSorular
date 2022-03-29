package aHocaDay2;

public class S19 {
    public static void main(String[] args) {
        String kelime="abcd";

        String yeniKelime=kelime.substring(3) +kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);

        System.out.println("yeniKelime = " + yeniKelime);
    }
}
