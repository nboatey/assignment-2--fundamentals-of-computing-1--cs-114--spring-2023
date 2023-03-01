import java.util.Scanner; 


    public class Diamond { 
    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in); // Create a new Scanner object named "input"
 
        System.out.print("Enter diamond size: "); 
        int rows = input.nextInt(); // Read an integer input from the user and assign it to the variable "rows"
        input.close(); // Close the Scanner object 

        // Determine whether the diamond should be even or odd
        boolean isEven = rows % 2 == 0; // Declare a boolean variable which is true if the number of rows is even,false otherwise
        

        // Print the upper half of the diamond
        for (int i = 1; i <= rows; i += 2) { // For each odd integer i between 1 and rows (inclusive) 
            int numStars = isEven ? 2 * ((i - 1) / 2) + 2 : 2 * ((i + 1) / 2) - 1; // Compute the number of asterisks to print
        
            int spaces = (rows - numStars) / 2; // Compute the number of spaces to print before the asterisks on this line
         
        for (int j = 1; j <= spaces; j++) { 
                System.out.print(" "); 
            }
        for (int j = 1; j <= numStars; j++) { // For each integer j between 1 and numStars (inclusive)
                System.out.print("*"); 
            }
            System.out.println(); 
        }

        // Print the lower half of the diamond
        for (int i = rows - 2; i >= 1; i -= 2) { 
            int numStars = isEven ? 2 * ((i - 1) / 2) + 2 : 2 * ((i + 1) / 2) - 1; // Compute the number of
           
            int spaces = (rows - numStars) / 2; // Compute the number of spaces to print 
            
        for (int j = 1; j <= spaces; j++) { 
               System.out.print(" ");
            }
        for (int j = 1; j <= numStars; j++) { 
               System.out.print("*"); 
            }
            System.out.println(); 
        }
    }

}
}

   

