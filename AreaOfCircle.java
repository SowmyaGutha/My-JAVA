package MyPackage;

public class AreaOfCircle extends Arithmetic_Operations {

	public static double areaOfCircle(double radius) {
		return Math.PI * radius * radius;

	}
	
	public static double perimeter(double radius)
	{
		return 2*Math.PI*radius;
		
	}


	public static void main(String[] args) {
		double radius;
		System.out.println("Please enter radius of circle");
		radius = getInputFromUser();
		System.out.println("Area of Circle is : " + areaOfCircle(radius));
		System.out.println("Perimeter of Cicle is :" + perimeter(radius));

	}
}
