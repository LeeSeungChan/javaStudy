package chapter23;

class ShowThread extends Thread {
	String threadName;
	
	public ShowThread(String name) {
		threadName=name;
	}
	
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("�ȳ��ϼ���. "+threadName+"�Դϴ�.");
			try {
				sleep(100);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadUnderstand {
	public static void main(String[] args) { 
		ShowThread st1=new ShowThread("���� ������");
		ShowThread st2=new ShowThread("���� ������");
		st1.start();
		st2.start();
	}
}