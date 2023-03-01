import java.util.Scanner; // Import the Scanner class from the java.util package
public class Diamond { 
 public static void main(String[] args) { 
 Scanner input = new Scanner(System.in); // Creates a new Scanner object named "input", which reads input from the user

System.out.print("Enter a number of rows: "); // Print a message to prompt the user to enter a number of rows
int rows = input.nextInt(); // Read an integer input from the user and assign it to the variable "rows"
 input.close(); // Close the Scanner object to prevent memory leaks

    // Determine whether the diamond should be even or odd
     boolean isEven = rows % 2 == 0; // Declare a boolean variable named "isEven", which is true if the number of
      // rows is even, false otherwise

    // Print the upper half of the diamond
    for (int i = 1; i <= rows; i += 2) { // For each odd integer i between 1 and rows (inclusive) with a step of 2
    int numStars = isEven ? 2 * ((i - 1) / 2) + 2 : 2 * ((i + 1) / 2) - 1; // Compute the number of
                                                                                       // asterisks to print on this
                                                                                       // line based on whether the
                                                                                       // diamond is even or odd
  int spaces = (rows - numStars) / 2; // Compute the number of spaces to print before the asterisks on
                                                       // this line
  System.out.print(" "); // Print a space
            }
  for (int j = 1; j <= numStars; j++) { // For each integer j between 1 and numStars (inclusive)
  System.out.print("*"); // Print an asterisk
            }
  System.out.println(); // Print a newline character to move to the next line
        }

  // Print the lower half of the diamond
  for (int i = rows - 2; i >= 1; i -= 2) { // For each odd integer i between rows - 2 and 1 (inclusive) with a
                                                 // step of 2
  int numStars = isEven ? 2 * ((i - 1) / 2) + 2 : 2 * ((i + 1) / 2) - 1; // Compute the number of
                                                                                       // asterisks to print on this
                                                                                       // line based on whether the
                                                                                       // diamond is even or odd
  int spaces = (rows - numStars) / 2; // Compute the number of spaces to print before the asterisks on
                                                       // this line
  for (int j = 1; j <= spaces; j++) { // For each integer j between 1 and spaces (inclusive)
                System.out.print(" "); // Print a space
            }
            for (int j = 1; j <= numStars; j++) { // For each integer j between 1 and numStars (inclusive)
                System.out.print("*"); // Print an asterisk
            }
            System.out.println(); // Print a newline character to move to the next line
        }
    }
}
   
}
