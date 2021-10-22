
import java.util.*;
class Triangle{
	public void isTriangle(){
		System.out.println("I am a triangle");
	}
}
class Isosceles extends Triangle{
	public void isIsoscelesTriangle(){
		System.out.println("I am an Isosceles triangle");
	}	
}
class Equilateral extends Isosceles{
	public void isEquilateralTriangle(){
		System.out.println("I am an Equilateral triangle");
	}	
}
public class TestTriangle{
	public static void main(String args[]){
		Equilateral triangle = new Equilateral();
		triangle.isEquilateralTriangle();
		triangle.isIsoscelesTriangle();
		triangle.isTriangle();
		
		Triangle Tr1 = new Equilateral();
		((Equilateral)Tr1).isEquilateralTriangle();
	}
}
