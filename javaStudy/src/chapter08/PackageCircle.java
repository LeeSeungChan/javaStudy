package chapter08;

class PackageCircle {
	public static void main(String[] args) {
		chapter08.orange.area.Circle c1 = new chapter08.orange.area.Circle(1.5);
		System.out.println("반지름이 1.5인 원의 넓이: "+c1.getArea());

		chapter08.orange.perimeter.Circle c2 = new chapter08.orange.perimeter.Circle(2.5);
		System.out.println("반지름이 2.5인 원의 둘레: "+c2.getPerimeter());
	}
}