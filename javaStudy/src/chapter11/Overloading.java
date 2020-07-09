package chapter11;

class Person2 {
	private int perID;
	private int milID;
	
	public Person2(int pID, int mID) {
		perID=pID;
		milID=mID;
	}
	
	public Person2(int pID) {
		perID=pID;
		milID=0;
	}
	
	public void showInfo() {
		System.out.println("민번: "+perID);
		if(milID!=0)
			System.out.println("군번: "+milID+'\n');
		else
			System.out.println("군과 관계 없음 \n");
	}
}

class Overloading {
	public static void main(String[] args) {
		Person2 man=new Person2(950123, 880102);
		Person2 woman=new Person2(941125);	
		man.showInfo();
		woman.showInfo();
	}
}