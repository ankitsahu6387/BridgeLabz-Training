import java.util.Scanner;
public class LineComparison {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Line Comparison Computation");
		System.out.println("Enter Line 1 coordinates: ");
		System.out.println("Enter x coordinate: ");
		double x1 = sc.nextDouble();
		System.out.println("Enter y coordinate: ");
		double y1 = sc.nextDouble();
		System.out.println("Enter x coordinate: ");
		double x2 = sc.nextDouble();
		System.out.println("Enter y coordinate: ");
		double y2 = sc.nextDouble();

		System.out.println("Enter Line 2 coordinates: ");
		System.out.println("Enter x coordinate: ");
		double x3 = sc.nextDouble();
		System.out.println("Enter y coordinate: ");
		double y3 = sc.nextDouble();	
		System.out.println("Enter x coordinate: ");
		double x4 = sc.nextDouble();
		System.out.println("Enter y coordinate: ");
		double y4 = sc.nextDouble();

		Double line1Length = getLength(x1,y1,x2,y2);
		Double line2Length = getLength(x3,y3,x4,y4);
		
		boolean isEqual = checkEqual(line1Length,line2Length);
		if(isEqual) {
			System.out.println("Both Lines are Equal");
		}
		compareLines(line1Length,line2Length);
	}
	
	//Use Case 1
	public static Double getLength(double x1,double y1,double x2,double y2) {
		double diff1 = x2 - x1;
		double diff2 = y2 - y1;
		return Math.sqrt(Math.pow(diff1, 2)+Math.pow(diff2, 2));
	}
	
	//Use Case 2
	public static boolean checkEqual(Double line1Length,Double line2Length) {
		return line1Length.equals(line2Length);
	}
	
	//Use Case 3
	public static void compareLines(Double line1Length,Double line2Length) {
		int result = line1Length.compareTo(line2Length);
		if(result > 0) {
			System.out.println("Line 1 is greater than Line 2");
		} else if(result < 0) {
			System.out.println("Line 1 is lesser than Line 2");
		}
	}
}