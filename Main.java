
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OptionMenuSaving saving = new OptionMenuSaving();
        OptionMenuChecking checking = new OptionMenuChecking();
        System.out.println("choice the operation you want");
        System.out.println("1-Checking Account");
        System.out.println("2-Saving Account");
        System.out.println("3-Exit");
        int selection = input.nextInt();
        switch (selection) {
            case 1 -> {
                checking.login();
            }
            case 2 -> saving.login();
            case 3 -> System.out.println(" Thanks...");
        }
    }
}