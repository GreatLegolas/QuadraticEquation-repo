/**
 * 
 */
package quadraticEquation;

/**
 * @author ASUS
 *
 */
public class TestQuadraticEquation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO This program tests the quadratic equation class
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter the values of a, b and c for the quadratic equation:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		QuadraticEquation quadEq = new QuadraticEquation(a, b, c);
		
		if (quadEq.getDiscriminant(a, b, c) < 0) {
			System.out.println("The equation has no real root");
		} else if (quadEq.getDiscriminant(a, b, c) == 0) {
			System.out.print("The equation has only root: ");
			System.out.print(quadEq.getRoot1(a, b, c));
		} else {
			System.out.println("The root 1 is: " + quadEq.getRoot1(a, b, c));
			System.out.println("The root 2 is: " + quadEq.getRoot2(a, b, c));
		}
	input.close();
	}

}
