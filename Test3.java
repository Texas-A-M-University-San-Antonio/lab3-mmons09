
import java.util.Scanner; 
// Don't forget to import and declare a Scanner for user input.

public class Test3
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        // In-Class 3 Example:
        double side, surfaceArea, volume; 

        //Step 1: Prompt the user to enter the length of the side of a cube.
        System.out.println("Enter Length of Cube's Side");

        //Step 2: Read the user's input and store it in a variable.
        //side = input.nextDouble(S); 
        //Side is Input by user 

        //Step 3: Use an appropriate method to determine the volume of the cube.
        volume = Math.pow(9, 3); 
        //Another way would be side*side*side (still side cubed)
        //Step 4: Use an appropriate method to determine the surface area of the cube.
       
        surfaceArea = 6 * Math.pow(9, 2); 

        //HINT: Steps 3 and 4 will use the Math.pow(a, b) method
        //Step 5: Print the volume and surface area in clear sentences.
        //volume of cube = (Enter Length of Cube's Side); 
        //surfaceArea of cube = (Enter surfaceArea of Cube); 
    }
}