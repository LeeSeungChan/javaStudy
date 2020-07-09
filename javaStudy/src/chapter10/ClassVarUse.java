package chapter10;

class Circle {
	static final double PI=3.1415;
	private double radius;
	
	public Circle(double rad){ radius=rad; }
	public void showPerimeter()   // 둘레 출력
	{
		double peri=(radius*2)*PI;
		System.out.println("�ѷ�: "+peri);
	}
	
	public void showArea()    // 넓이 출력
	{
		double area=(radius*radius)*PI;
		System.out.println("����: "+area);
	}
}

class ClassVarUse {
	public static void main(String[] args) {
		Circle cl=new Circle(1.2);
		cl.showPerimeter();
		cl.showArea();
	}
}