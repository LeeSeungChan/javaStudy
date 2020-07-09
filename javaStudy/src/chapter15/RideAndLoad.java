package chapter15;

class AAAA {
	public void rideMethod(){System.out.println("AAA's Method");}
	public void loadMethod(){System.out.println("void Method");}
}

class BBBB extends AAAA {
	public void rideMethod(){System.out.println("BBB's Method");}
	public void loadMethod(int num){System.out.println("int Method");}
}

class CCCC extends BBBB {
	public void rideMethod(){System.out.println("CCC's Method");}
	public void loadMethod(double num){System.out.println("double Method");}
}

class RideAndLoad {
	public static void main(String[] args) {
		AAAA ref1=new CCCC();		
		BBBB ref2=new CCCC();
		CCCC ref3=new CCCC();
		
		ref1.rideMethod();
		ref2.rideMethod();
		ref3.rideMethod();
		
		ref3.loadMethod();
		ref3.loadMethod(1);
		ref3.loadMethod(1.2);
	}
}