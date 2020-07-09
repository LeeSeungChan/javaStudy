package chapter15;

class AA {
	public int num=2;
}

class BB extends AA {
	public int num=5;
}

class CC extends BB {
	public int num=7;
}

class ValReDecle {
	public static void main(String[] args) {
		CC ref1=new CC();		
		BB ref2=ref1;
		AA ref3=ref2;
		
		System.out.println("CCC's ref: "+ref1.num);		
		System.out.println("BBB's ref: "+ref2.num);		
		System.out.println("AAA's ref: "+ref3.num);
	}
}