package hHocaMethodCreation;

public class S8 {
    public static void main(String[] args) {
        /*
    TASK :
    Kullanıcıdan aldığınız bir String'deki kelimeleri sondan başa doğru yerleştiren
    String parametreli return type li reverseWord isminde bir method create ediniz

     Test Data :
    İnput : Allah Javacı arkadaşlara  zihin açıklığı versin
    Output : versin açıklığı zihin arkadaşlara Javacı Allah
     */

       String input = "Allah bizim Javacı arkadaşlarımıza  zihin açıklığı versin";

       String tersInput= girdiyiTerseCevirme(input);

        System.out.println("tersInput = " + tersInput);
    }

    private static String girdiyiTerseCevirme(String input) {

        String tersInput="";
        String[]arr=input.split(" ");

        for (int i = arr.length-1; i >=0 ; i--) {

            tersInput+=arr[i]+" ";

        }


                return tersInput;}
}
