/**
 * OOPSBannerApp UC4 - Render OOPS as Banner using String Array and Loop
 *
 * This version improves UC3 by storing banner lines in a String array
 * and printing them using a for-each loop to eliminate repetitive
 * print statements.
 *
 * @author Developer
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: Create String array to store 7 banner lines
        String[] lines = new String[7];

        // Step 2: Populate each line using String.join()
        lines[0] = String.join(" ", "  *****  ", "  *****  ", " ******  ", "  *****  ");
        lines[1] = String.join(" ", " *     * ", " *     * ", " *     * ", " *     * ");
        lines[2] = String.join(" ", " *     * ", " *     * ", " *     * ", " *      ");
        lines[3] = String.join(" ", " *     * ", " *     * ", " ******  ", "  *****  ");
        lines[4] = String.join(" ", " *     * ", " *     * ", " *       ", "       * ");
        lines[5] = String.join(" ", " *     * ", " *     * ", " *       ", " *     * ");
        lines[6] = String.join(" ", "  *****  ", "  *****  ", " *       ", "  *****  ");

        // Step 3: Use enhanced for loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}