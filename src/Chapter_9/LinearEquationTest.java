package Chapter_9;

/* Linear equation test for a 2 x 2 system of Linear equations.
 * 
 * ax + by = e, cx + dy = f; 
 * x = (ed - bf) / (ad - bc) y = (af - ec) / (ad - bc)
 * 
 * The class contains 6 private data fields a-f
 * 1 constructor with arguments a-f
 * 6 getter methods for a-f
 * a boolean method isSolvable that returns true if ad-bc is not 0
 * two more accesor methods getX() and getY()
 * 
 * 
 *Test Program prompts user to enter
 *A, b, c, d, e, f
 *and displays the result 
 *
 * If ad-bc is 0 
 * 
 * The equation has not soulution. 
 * 
 */
import java.util.Scanner;


public class LinearEquationTest {
	
		/** Main method */
		public static void main(String[] args) {
			// Create a Scanner object
			Scanner input = new Scanner(System.in);

			
			// Prompt the user to enter a, b, c, d, e, and f
			System.out.print("Enter a, b, c, d, e, f: ");
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();
			double d = input.nextDouble();
			double e = input.nextDouble();
			double f = input.nextDouble();

			// Create a LinearEquation object
			LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
			
			// Display results
			if (linearEquation.isSolvable()) {
				System.out.println("x is " + linearEquation.getX() +
					" and y is " + linearEquation.getY());
			}
			else
				System.out.println("The equation has no solution.");
		}
	}



