import java.util.Scanner;

public class devcia {
    // Method to get the middle character of a string
    public static char getMiddleCharacter(String input) {
        int length = input.length();
        int middleIndex = length / 2;
        
        // If the length of the string is odd, return the middle character
        if (length % 2 == 1) {
            return input.charAt(middleIndex);
        } else {
            // If the length is even, return the character just before the middle
            return input.charAt(middleIndex - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Call the method and display the middle character
        char middleChar = getMiddleCharacter(input);
        System.out.println("The middle character is: " + middleChar);
        
        scanner.close();
    }
}
