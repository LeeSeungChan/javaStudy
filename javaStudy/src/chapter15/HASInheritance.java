package chapter15;

class Gun2 {
	int bullet;    	// 장전된 총알의 수
	
	public Gun2(int bnum){bullet=bnum;}
	public void shut() {
		System.out.println("BBANG!");
		bullet--;
	}
}

class Police2 extends Gun2 {
	int handcuffs;	     // 소유한 수갑의 수
	
	public Police2(int bnum, int bcuff) {
		super(bnum);
		handcuffs=bcuff;
	}
	
	public void putHandcuff() {
		System.out.println("SNAP!");
		bullet--;
	}
}

class HASInheritance {
	public static void main(String[] args) {
		Police2 pman=new Police2(5, 3);
		pman.shut();
		pman.putHandcuff();
	}
}