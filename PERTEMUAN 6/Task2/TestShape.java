package Task2;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Shape();
		System.out.println("Shape :"
		+ " color = " + s1.getColor()
		+ " filled = " + s1.isFilled()
		+ " ---> " +s1.toString());
		
		Shape s2 = new Shape("blue", false);
		System.out.println("Shape :"
		+ " color = " + s2.getColor()
		+ " filled = " + s2.isFilled()
		+ " ---> " +s2.toString());
	}
}
