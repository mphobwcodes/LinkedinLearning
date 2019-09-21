package javaInterview1;
import java.util.Stack;
import java.util.HashMap;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r =new Rectangle(color: "purple", length:5, width:2);
		Circle c =new Circle(color: "red", radius: 4);
		
		System.out.println("rectangle area: " +r.getArea());
		System.out.println("Circle area: " +c.getArea());
		
		System.out.println("rectangle area: " +r.draw());
		System.out.println("Circle area: " +r.draw());
	}

}
