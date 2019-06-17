import java.util.Scanner;

public class LoopDebugging {


        public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userInput = "";

        userInput = keyboard.next();



        while (userInput != "") {
            System.out.println(userInput);
            System.out.println("Enter more characters");
            userInput = keyboard.next();
            }

    }
    }
