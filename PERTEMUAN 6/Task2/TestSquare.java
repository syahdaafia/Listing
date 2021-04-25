package Task2;

public class TestSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1 = new Square();
			System.out.println ("Square :"
			+ " side = " +s1.getLength()
			+ " color = " +s1.getColor()
			+ " filled = " +s1.isFilled()
			+ " area = " +s1.getArea()
			+ " perimeter = " +s1.getPerimeter()
			+ " \n -> " +s1.toString());
			
		Square s2 = new Square(3);
			System.out.println ("Square :"
			+ " side = " +s2.getLength()
			+ " color = " +s2.getColor()
			+ " filled = " +s2.isFilled()
			+ " area = " +s2.getArea()
			+ " perimeter = " +s2.getPerimeter()
			+ " \n -> " +s2.toString());
			
		Square s3 = new Square(2, "white", false);
			System.out.println ("Square :"
			+ " side = " +s3.getLength()
			+ " color = " +s3.getColor()
			+ " filled = " +s3.isFilled()
			+ " area = " +s3.getArea()
			+ " perimeter = " +s3.getPerimeter()
			+ " \n -> " +s3.toString());
	}
}