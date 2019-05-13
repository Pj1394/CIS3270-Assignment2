/*test Program that prints:
 * Perimeter and Area of 3 Regular Polygon Objects. 
 * 
 */
package Chapter_9;

public class RegularPolygonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create three RegularPolygon objects
				RegularPolygon regularPolygon1 = new RegularPolygon();
				RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
				RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

				// Display perimeter and area of each object
				
				System.out.println(" Regular Polygon Objects ");
				
				System.out.printf( " Perimeter and area for Polygon 1 is " + 
					regularPolygon1.getPerimeter(), 
					regularPolygon1.getArea());
				System.out.println("");
				
				System.out.printf( " Perimeter and area for Polygon 2 is " + 
					regularPolygon2.getPerimeter(), 
					regularPolygon2.getArea());
				System.out.println("");
				
				System.out.printf( " Perimeter and area for Polygon 1 is " + 
					regularPolygon3.getPerimeter(), 
					regularPolygon3.getArea());
				System.out.println("");

	}

}
