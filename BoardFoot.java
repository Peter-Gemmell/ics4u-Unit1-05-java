/*
*  Program makes rock paper scissor
*
* @author  Peter Gemmell
* @version 1.0
* @since 2022-9-16
*/

/*
* Calculates the length of a board foot given height and width
*/

import java.util.Scanner;
/**
* Class BoardFoot.
*/

final class BoardFoot {

    /**
    * Constant for size of a board foot.
    */
    public static final double BOARD_SIZE = 144.0;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private BoardFoot() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
    * Calculates the length of the board foot.
    *
    * @param height height of board foot
    * @param width width of board foot
    * @return length of board foot
    */

    public static double calcLength(final double height, final double width) {
        // Process
        final double length = BOARD_SIZE / (height * width);
        return length;
    }
    /**
    * The Starting main() function.
    *
    * @param args Not used.
    * @throws InputMismatchException If user input is invalid
    */

    public static void main(final String[] args) {
        // Input and scanner
        final Scanner myObj = new Scanner(System.in);
        try {
            System.out.println("Input your height: ");
            final double userHeight = myObj.nextDouble();
            try {
                System.out.println("Input your width: ");
                final double userWidth = myObj.nextDouble();
                final double length = calcLength(userHeight, userWidth);
                // Output
                System.out.println(
                    "The wood should be " + length
                        + " inch(es) long.");
            } catch (java.util.InputMismatchException error) {
                System.out.println("Invalid width");
            }
        } catch (java.util.InputMismatchException error) {
            System.out.println("Invalid height");
        } finally {
            System.out.println("Done.");
        }
    }
}
