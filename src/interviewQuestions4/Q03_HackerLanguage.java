package interviewQuestions4;

public class Q03_HackerLanguage {

    public static void main(String[] args) {
        // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.

        String input="java ile hersey guzel";
        String hDiliInput="";

        String[] input1=input.split("");

        for (int i = 0; i <input1.length ; i++) {

            if(input1[i].equals("a")){input1[i]="4";}
            if(input1[i].equals("s")){input1[i]="5";}
            if(input1[i].equals("e")){input1[i]="3";}
            if(input1[i].equals("i")){input1[i]="1";}
            if(input1[i].equals("o")){input1[i]="0";}

            hDiliInput+=input1[i];

        }
        System.out.println("hDiliInput = " + hDiliInput);
    }
}
