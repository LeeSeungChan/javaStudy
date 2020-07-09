package chapter21;

class AAA4 {
	public String toString() {
		return "Class AAA";
	}
}

class BBB4 {
	public String toString() {
		return "Class BBB";
	}
}

class InstanceTypeShower2 {
	public <T, U> void showInstType(T inst1, U inst2) {
		System.out.println(inst1);
		System.out.println(inst2);
	}
}

class IntroGenericMethod2 {	
	public static void main(String[] args) {
		AAA4 aaa=new AAA4();
		BBB4 bbb=new BBB4();
		
		InstanceTypeShower2 shower=new InstanceTypeShower2();
		shower.<AAA4, BBB4>showInstType(aaa, bbb);
		shower.showInstType(aaa, bbb);
	}
}