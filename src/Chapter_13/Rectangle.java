

//13.05
package Chapter_13;

public class Rectangle 
	extends GeometricObj {
		private double width;
		private double height;

		public Rectangle() {
		}

		public Rectangle(
			double width, double height) {
			this.width = width;
			this.height = height;
		}

		public Rectangle(
			double width, double height, String color, boolean filled) {
			this.width = width;
			this.height = height;
			setColor(color);
			setFilled(filled);
		}

		public void setFilled(boolean filled) {
			
		}

		public void setColor(String color) {
			// TODO Auto-generated method stub
			
		}

		/** Return width */
		public double getWidth() {
			return width;
		}

		/** Set a new width */
		public void setWidth(double width) {
			this. width = width;
		}

		/** Return height */
		public double getheight() {
			return height;
		}

		/** Set a new height */
		public void setheight(double height) {
			this.height = height;
		}

		
		public double getArea() {
			return width * height;
		}

		
		public double getPerimeter() {
			return 2 * (width * height);
		}
}
