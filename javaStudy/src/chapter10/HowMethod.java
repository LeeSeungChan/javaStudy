package chapter10;

class SimpleMath2    // 단순 계산 클래스
{
	public static final double PI=3.1415;	
	public double add(double n1, double n2){ return n1+n2; }
	public double min(double n1, double n2){ return n1-n2; }
	public double mul(double n1, double n2){ return n1*n2; }
}

class AreaMath2    // 넓이 계산 클래스
{	
	public double calCircleArea(double rad) {
		SimpleMath2 sm=new SimpleMath2();
		double result=sm.mul(rad, rad);
		result=sm.mul(result, SimpleMath.PI);
		return result;
	}
	
	public double calRectangleArea(double width, double height) {
		SimpleMath2 sm=new SimpleMath2();
		return sm.mul(width, height);
	}
}

class PerimeterMath2    // 둘레 계산 클래스
{	
	public double calCirclePeri(double rad) {
		SimpleMath2 sm=new SimpleMath2();
		double result=sm.mul(rad, 2);
		result=sm.mul(result, SimpleMath.PI);
		return result;
	}
	
	public double calRectanglePeri(double width, double height) {
		SimpleMath2 sm=new SimpleMath2();
		return sm.add(sm.mul(width, 2), sm.mul(height, 2));
	}
}

class HowMethod {
	public static void main(String[] args) {
		AreaMath2 am=new AreaMath2();
		PerimeterMath2 pm=new PerimeterMath2();
		
		System.out.println("원의 넓이: "+am.calCircleArea(2.4));
		System.out.println("직사각형 둘레: "+pm.calRectanglePeri(2.0, 4.0));
	}
}