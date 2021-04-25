package Task2;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
			System.out.println ("Circle :"
			+ " radius = " +c1.getRadius()
			+ " color = " +c1.getColor()
			+ " filled = " +c1.isFilled()
			+ " area = " +c1.getArea()
			+ " perimeter = " +c1.getPerimeter()
			+ " \n ---> " +c1.toString());
			
		Circle c2 = new Circle(7.2);
			System.out.println ("Circle :"
			+ " radius = " +c2.getRadius()
			+ " color = " +c2.getColor()
			+ " filled = " +c2.isFilled()
			+ " area = " +c2.getArea()
			+ " perimeter = " +c2.getPerimeter()
			+ " \n ---> " +c2.toString());
			
		Circle c3 = new Circle(2.1, "pink", false);
			System.out.println ("Circle :"
			+ " radius = " +c3.getRadius()
			+ " color = " +c3.getColor()
			+ " filled = " +c3.isFilled()
			+ " area = " +c3.getArea()
			+ " perimeter = " +c3.getPerimeter()
			+ " \n ---> " +c3.toString());
	}
}

