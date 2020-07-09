package chapter07;

class Number3 {
	int num=0;
	
	public void addNum(int n) {
		num+=n;
	}
	
	public int getNumber() {
		return num;
	}
}

class PassInstance {
	public static void main(String[] args) {
		Number3 nInst=new Number3();
		System.out.println("메소드 호출 전: "+nInst.getNumber());
		
		simpleMethod(nInst);
		System.out.println("메소드 호출 후: "+nInst.getNumber());	
	}
	
	public static void simpleMethod(Number3 numb) {
		numb.addNum(12);
	}	
}