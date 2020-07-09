package chapter21;

class AAA3 {
	public String toString() {
		return "Class AAA";
	}
}

class BBB3 {
	public String toString() {
		return "Class BBB";
	}
}

class InstanceTypeShower {
	int showCnt=0;
	
	public <T> void showInstType(T inst) {
		System.out.println(inst);
		showCnt++;
	}
	
	void showPrintCnt() {
		System.out.println("Show count: "+showCnt);
	}
}

class IntroGenericMethod {	
	public static void main(String[] args) {
		AAA3 aaa=new AAA3();
		BBB3 bbb=new BBB3();
		
		InstanceTypeShower shower=new InstanceTypeShower();
		shower.<AAA3>showInstType(aaa);
		shower.<BBB3>showInstType(bbb);
		shower.showPrintCnt();
	}
}