package chapter08;

class Circle2 {
	double rad;
	final double PI;
	
	public Circle2(double r) {
		rad=r;
		PI=3.14;
	}
	
	public double getPerimeter() {
		return (rad*2)*PI;
	}
}

class CirclePerimeter {
	public static void main(String args[]) {
		Circle2 c = new Circle2(1.5);
		System.out.println("반지름이 1.5인 원의 둘레: "+c.getPerimeter());
	}
}