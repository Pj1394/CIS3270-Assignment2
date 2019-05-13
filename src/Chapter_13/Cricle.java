package Chapter_13;
//13.05

public class Circle 
	extends GeometricObj {
private double radius;

public Circle() {
}

public Circle(double radius) {
	this.radius = radius;
}

public Circle(double radius, 
	String color, boolean filled) {
	this.radius = radius;
	setColor(color);
	setFilled(filled);
}

public void setColor(String color) {
	
}

public void setFilled(boolean filled) {

	
}

/** Return radius */
public double getRadius() {
	return radius;
}

/** Set a new radius */
public void setRadius(double radius) {
	this.radius = radius;
}

	public double getArea(){
		return radius * radius *Math.PI;
	}
	
	public double getDiameter(){
		return 2 * radius;
	}
	
	public double getPerimeter(){
		return 2* radius *Math.PI;
	}
	
}

