package chapter21;

interface SimpleInterface2 {
	public void showYourName();
}

class UpperClass2 {
	public void showYourAncestor() {
		System.out.println("UpperClass");
	}
}

class AAA2 extends UpperClass2 implements SimpleInterface2 {
	public void showYourName() {
		System.out.println("Class AAA");
	}
}

class BBB2 extends UpperClass2 implements SimpleInterface2 {
	public void showYourName() {
		System.out.println("Class BBB");
	}
}

class BoundedTypeParam2 {	
	public static <T extends SimpleInterface2> void showInstanceAncestor(T param) {
		param.showYourName();
	}
	
	public static <T extends UpperClass2> void showInstanceName(T param) {
		param.showYourAncestor();
	}
	
	public static void main(String[] args) {
		AAA2 aaa=new AAA2();
		BBB2 bbb=new BBB2();
		
		showInstanceAncestor(aaa);
		showInstanceName(aaa);
		showInstanceAncestor(bbb);
		showInstanceName(bbb);
	}
}