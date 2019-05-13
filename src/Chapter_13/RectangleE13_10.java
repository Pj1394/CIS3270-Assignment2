package Chapter_13;

public class RectangleE13_10
extends GeometricObject implements Comparable<Rectangle> {
private double width;
private double height;

public RectangleE13_10() {
}

public RectangleE13_10(
double width, double height) {
this.width = width;
this.height = height;
}

public RectangleE13_10(
double width, double height, String color, boolean filled) {
this.width = width;
this.height = height;
setColor(color);
setFilled(filled);
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

@Override /** Return area */
public double getArea() {
return width * height;
}

@Override /** Return perimeter */
public double getPerimeter() {
return 2 * (width * height);
}

@Override /** Implement compareTo method */
public int compareTo(Rectangle o) {
if (getArea() > o.getArea())
	return 1;
else if (getArea() < o.getArea())
	return -1;
else
	return 0;
}

@Override /** Return true if both objects are equal */
public boolean equals(Object o) {
return this.compareTo((Rectangle)o) == 0;
}

@Override /** Return String discription of this rectangle */
public String toString() {
return super.toString() + "\nWidth: " + width + "\nHeight: " + height
	+ "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
}
}