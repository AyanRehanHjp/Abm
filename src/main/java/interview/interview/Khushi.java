package interview.interview;
import java.util.Scanner;

public class Khushi {

    public static void printHeart() {
        System.out.println("       **     **       ");
        System.out.println("     **  ** **  **     ");
        System.out.println("   **      *      **   ");
        System.out.println("  **               **  ");
        System.out.println("   **             **   ");
        System.out.println("     **         **     ");
        System.out.println("       **     **       ");
        System.out.println("         ** **         ");
        System.out.println("          ***          ");
        System.out.println("           *           ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Asking for her name to make it personal
        System.out.println("Hey! My Dear Bestie please enter your cute name?");
        String name = scanner.nextLine();

        // Step 2: Check if it's Khushi, and if not, give a funny message
        if (name.equalsIgnoreCase("Khushi")) {
            // Step 3: Print the star-patterned heart
            printHeart();

            // Step 4: The real birthday message for Khushi
            System.out.println("🎉🎂 Happy Birthday, Khushi!! 🎂🎉");
            System.out.println("Today is YOUR day! 😍");
            System.out.println("On this special day, here's a wish for the most wonderful, funny, and amazing person I know: YOU! 😜");
            System.out.println("You light up every room you walk into, just like a glittering disco ball! 🕺💃");
            System.out.println("May your day be filled with as much fun as the number of bad jokes I crack! 😂");
            System.out.println("\nNow, go out there and make this year more awesome than the last! 🌟");
            System.out.println("\nP.S. You still owe me a treat... 🎁🍫");
            System.out.println("\nEnjoy your day, Khushi!! 🎈🎉");
        } else {
            // Step 5: Fun response for anyone else
            System.out.println("\nOops! Sorry, this birthday wish is only for Khushi! 🎂🎉");
            System.out.println("But hey, you're awesome too! 😉");
        }

        scanner.close();
    }
}
