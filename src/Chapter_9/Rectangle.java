package Chapter_9;

/*------------------------------------------------*
*                Rectangle                        *  
* ------------------------------------------------*  
* width: double                                   *
* height: double  
* ------------------------------------------------* 
* Rectangle()                                     *  
* Rectangle(newWidth: double, newHeight: double)  *
* getArea(): double                               *
* getPerimeter(): double      
*/


public class Rectangle {
	double width;
	double height;

	Rectangle() {
	width = 1;
	height = 1;
	}
	
	Rectangle(double newWidth, double newHeight) {
	width = newWidth;
	height = newHeight;
	
	}
	
	double getArea() {
		return width * height; 
	}
	
	double getPerimeter() {
		return 2 * (width + height);
	}
}	
	
