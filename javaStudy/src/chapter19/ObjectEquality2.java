package chapter19;

class IntNumber2 {
	int num;
	
	public IntNumber2(int num) {
		this.num=num;
	}
	
	public boolean equals(Object obj) {
		if(this.num==((IntNumber2)obj).num)
			return true;
		else
			return false;
	}
}

class ObjectEquality2 {
	public static void main(String[] args) {
		IntNumber2 num1=new IntNumber2(10);
		IntNumber2 num2=new IntNumber2(12);
		IntNumber2 num3=new IntNumber2(10);
		
		if(num1.equals(num2))
			System.out.println("num1과 num2는 동일한 정수");
		else
			System.out.println("num1과 num2는 다른 정수");
		
		if(num1.equals(num3))
			System.out.println("num1과 num3는 동일한 정수");
		else
			System.out.println("num1과 num3는 다른 정수");
	}
}