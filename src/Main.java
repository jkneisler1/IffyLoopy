import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        StringBuilder words = new StringBuilder();
        String word = "";

        System.out.println("The program will allow you to enter 5 random words.");
        System.out.println("It will then print out the phrase of 5 words");
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a word: ");
            word = keyboard.next();
            words.append(word);
            words.append(" ");
        }

        System.out.println();
        System.out.println("Your made up phrase is:");
        System.out.println(words.toString());
    }
}
