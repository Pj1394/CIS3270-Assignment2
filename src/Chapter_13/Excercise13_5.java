package Chapter_13;
//13.05

public class Exercise_13_5 {
	public static void main(String[] args) {
		// Create two Circle objects
		Circle circle1 = new Circle(15, "red", true);
		Circle circle2 = new Circle(10, "blue", false);

		// Display circle1
		System.out.println("\nCircle 1: ");
		print(circle1);

		// Display circle2
		System.out.println("\nCircle 2: ");
		print(circle2);

		// Display larger circle
		print("\nThe larger of the two circles was ");
		print(Circle.max(circle1, circle2));

		// Create two Rectangle objects
		Rectangle rectangle1 = new Rectangle(4, 5, "green", true);
		Rectangle rectangle2 = new Rectangle(4.2, 5, "orange", true);

		// Display circle1
		System.out.println("\nRectangle 1: ");
		print(circle1);

		// Display circle2
		System.out.println("\nRectangle 2: ");`
		print(circle2);

		// Display larger circle
		print("\nThe larger of the two rectangles was ");
		print(Rectangle.max(rectangle1, rectangle2));
	
	//Right about here I got completly stuck on this.
	
	
	}


}