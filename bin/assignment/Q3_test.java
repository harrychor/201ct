package assignment;

public class Q3_test {
	public static void main(String[] args) {
		Q3a_Circle circle;
		Q3b_Square square;
		
		circle = new Q3a_Circle(22,9,3.5);
		square = new Q3b_Square(22,9,3.5);
		
		System.out.print(circle.getName()+":"+circle.toString());
		
		System.out.println("; Area = "+ circle.getArea());
		
		System.out.print(circle.getName()+":"+square.toString());
		
		System.out.println("; Area = "+ square.getArea());
		
	}
}
