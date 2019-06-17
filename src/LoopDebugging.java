import java.util.Scanner;

public class LoopDebugging {


        public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userInput = "";

        userInput = keyboard.next();



        while (userInput != "") {
            System.out.println(userInput);
            userInput = keyboard.next();
            System.out.println("Do you want to keep going? Y/N");
            String answer = keyboard.next();
            if (answer.equalsIgnoreCase("Y")){
                continue;
            }
            break;
            }

    }
    }
