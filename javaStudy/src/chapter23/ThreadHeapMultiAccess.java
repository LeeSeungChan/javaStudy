package chapter23;

class Sum2 {
	int num;
	public Sum2() { num=0; }
	public void addNum(int n) { num+=n; }
	public int getNum() { return num; }
}

class AdderThread2 extends Thread {	
	Sum2 sumInst;
	int start, end;
	
	public AdderThread2(Sum2 sum, int s, int e) {
		sumInst=sum;
		start=s;
		end=e;
	}
	
	public void run() {
		for(int i=start; i<=end; i++)
			sumInst.addNum(i);
	}
}

class ThreadHeapMultiAccess {
	public static void main(String[] args) {
		Sum2 s=new Sum2();
		AdderThread2 at1=new AdderThread2(s, 1, 50);
		AdderThread2 at2=new AdderThread2(s, 51, 100);
		at1.start();
		at2.start();
		
		try {
			at1.join();
			at2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1~100������ ��: "+s.getNum());
	}
}