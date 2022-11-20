import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        int counter = 0;

        while(true) {
            String input = scan.nextLine();
            counter++;
            if (counter == 4) {
                System.out.printf("User %s blocked!", password);
                break;
            }
            String result = "";
            for (int i = input.length()-1; i >= 0 ; i--) {
                result+= input.charAt(i);
            }
            if (result.equals(password)) {
                System.out.printf("User %s logged in.", password);
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }

        }

    }
}