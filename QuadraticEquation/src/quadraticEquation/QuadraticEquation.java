/**
 * 
 */
package quadraticEquation;

/**
 * @author ASUS
 *
 */
public class QuadraticEquation {
	private double a;
	private double b;
	private double c;
	
	QuadraticEquation() {
		
	}
	
	QuadraticEquation(double a, double b, double c) {
		
	}
		
	/**
	 * @return the value of a
	 */
	public double getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(double a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public double getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(double b) {
		this.b = b;
	}

	/**
	 * @return the c
	 */
	public double getC() {
		return c;
	}

	/**
	 * @param c the c to set
	 */
	public void setC(double c) {
		this.c = c;
	}

	public double getDiscriminant(double a, double b, double c) {
		double discriminant = Math.pow(b, 2) - 4 * a * c;
		// System.out.println("Discriminant is " + discriminant);
		return discriminant;
	}
	
	public double getRoot1(double a, double b, double c) {
		double root1 = ((-b) + Math.pow(getDiscriminant(a, b, c), 0.5)) / (2 * a);
		return root1;
	}
	
	public double getRoot2(double a, double b, double c) {
		double root2 = ((-b) - Math.pow(getDiscriminant(a, b, c), 0.5)) / (2 * a);
		return root2;
	}
	
}
