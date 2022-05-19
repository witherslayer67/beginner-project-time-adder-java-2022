import java.util.Scanner;
//this is a time adder, you put ion the current time and you put how much time you want to go forward in

public class Driver {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Current Hour:"); // you enter the current hour
        int currentHour = scan.nextInt();
        System.out.println("Enter Current Minute:");
        int currentMinute = scan.nextInt();
        System.out.println("Enter Current Second:");
        int currentSecond = scan.nextInt();

        System.out.println("Enter Hour To Go Forward:");
        int forwardHour = scan.nextInt();
        System.out.println("Enter Minute To Go Forward:");
        int forwardMinute = scan.nextInt();
        System.out.println("Enter Second To Go Forward:");
        int forwardSecond = scan.nextInt();

        int answerHour = 0, answerMinute = 0, answerSecond = 0;
        int carrySecond = 0, carryMinute = 0;
        boolean isNextDay = false;
        
        answerSecond = currentSecond + forwardSecond;

        if (answerSecond >= 60){
            answerSecond -= 60;
            carrySecond = 1;
        }
        answerMinute = currentMinute + forwardMinute + carrySecond;

        if (answerMinute >= 60){
            answerMinute -= 60;
            carryMinute = 1;
        }
        answerHour = currentHour + forwardHour + carryMinute;

        if (answerHour >= 24){
            answerHour -= 24;
            isNextDay = true;
        }

        if (isNextDay){
            System.out.println("The Answer Is" +answerHour +":" +answerMinute + ":" +answerSecond + "on the next day"); //this shit made me lose my sanity
        }

        else {
            System.out.println("The Answer Is" +answerHour +":" +answerMinute + ":" +answerSecond); //idk why a if if else works, bs
        }
    }
}