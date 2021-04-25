package Task2;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
			System.out.println ("Rectangle :"
			+ " width = " +r1.getWidth()
			+ " length =" +r1.getLength()
			+ " color = " +r1.getColor()
			+ " filled = " +r1.isFilled()
			+ " area = " +r1.getArea()
			+ " perimeter = " +r1.getPerimeter()
			+ " \n ---> " +r1.toString());
		
		Rectangle r2 = new Rectangle(2, 4);
			System.out.println ("Rectangle :"
			+ " width = " +r2.getWidth()
			+ " length =" +r2.getLength()
			+ " color = " +r2.getColor()
			+ " filled = " +r2.isFilled()
			+ " area = " +r2.getArea()
			+ " perimeter = " +r2.getPerimeter()
			+ " \n ---> " +r2.toString());
	
		Rectangle r3 = new Rectangle(1, 2, "black", false);
			System.out.println ("Rectangle :"
			+ " width = " +r3.getWidth()
			+ " length =" +r3.getLength()
			+ " color = " +r3.getColor()
			+ " filled = " +r3.isFilled()
			+ " area = " +r3.getArea()
			+ " perimeter = " +r3.getPerimeter()
			+ " \n ---> " +r3.toString());

	}
}
