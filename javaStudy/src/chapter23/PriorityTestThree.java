package chapter23;

class MessageSendingThread3 extends Thread {
	String message;
	
	public MessageSendingThread3(String str, int prio) {
		message=str;
		setPriority(prio);
	}
	
	public void run() {
		for(int i=0; i<1000000; i++) {
			System.out.println(message+"("+getPriority()+")");
			
			try {
				sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}

class PriorityTestThree {
	public static void main(String[] args) {
		MessageSendingThread3 tr1 = new MessageSendingThread3("First", Thread.MAX_PRIORITY);
		MessageSendingThread3 tr2 = new MessageSendingThread3("Second", Thread.NORM_PRIORITY);
		MessageSendingThread3 tr3 = new MessageSendingThread3("Third", Thread.MIN_PRIORITY);
		
		tr1.start();
		tr2.start();
		tr3.start();
	}
}
