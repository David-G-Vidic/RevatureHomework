package StarterExercises;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "";

        //user input
        try {
            System.out.println("Enter a word or phrase and I will tell you if its a palindrome: ");
            input = scan.nextLine();
        } catch (RuntimeException e) {
            System.out.println("Unable to recognize input");
        }
        //sanitize string
        //replaces non letter characters with blank, then converts to lowercase
        //regex specifies any character that is not a letter character, including numbers, punctuation, and spaces
        input = input.replaceAll("[^\\p{L}]", "").toLowerCase();

        //reverse string
        String reversed = new StringBuilder(input).reverse().toString();

        //check for empty string
        if (input.isEmpty()) System.out.println("There are no letters to check. ");
        //check for equality
        else if (input.equals(reversed)) System.out.println("Yes, you have a palindrome!");
        else System.out.println("No, that is not a palindrome");


    }

}
