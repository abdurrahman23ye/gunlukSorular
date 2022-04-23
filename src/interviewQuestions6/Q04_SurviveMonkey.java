package interviewQuestions6;

public class Q04_SurviveMonkey {

    public static void main(String[] args) {
        /*
		There is a lonely monkey in the island
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island
		Create following variables and find how many days
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;
		*/

        int numberOfBananas =165;
       int survivalDays = 41;

        boolean monkeyAlive = true;

        while (survivalDays>0){
            survivalDays--;

            numberOfBananas=numberOfBananas-4;

        }if(numberOfBananas>0){}else {monkeyAlive=false;}

        if(monkeyAlive){
            System.out.println("Monkey still alive.");
        }else {
            System.out.println("Monkey has dead.");
        }


        }

    }

