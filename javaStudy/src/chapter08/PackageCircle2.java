package chapter08;

import chapter08.orange.area.Circle;
import chapter08.orange.perimeter.Circle;

class PackageCircle2 {
	public static void main(String args[]) {
		Circle c1=new Circle(1.5);
		System.out.println("반지름이 1.5인 원의 넓이: "+c1.getArea());

		Circle c2 = new Circle(2.5);
		System.out.println("반지름이 2.5인 원의 둘레: "+c2.getPerimeter());
	}
}