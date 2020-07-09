package chapter17;

interface Readable {
	public void read();
}

class OuterClass0 {
	private String myName;
	
	OuterClass0(String name) {
		myName=name;
	}
	
	public Readable createLocalClassInst() {		
		class LocalClass implements Readable {
			public void read() {
				System.out.println("Outer inst name: "+myName);
			}
		}
		
		return new LocalClass();
	}
}

class LocalClassTest {	
	public static void main(String[] args) {
		OuterClass0 out1=new OuterClass0("First");
		Readable localInst1=out1.createLocalClassInst();
		localInst1.read();
		
		OuterClass0 out2=new OuterClass0("Second");	
		Readable localInst2=out2.createLocalClassInst();
		localInst2.read();
	}
}