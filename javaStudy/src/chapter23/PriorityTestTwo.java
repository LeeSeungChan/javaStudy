package chapter23;

class MessageSendingThread2 extends Thread {
	String message;
	
	public MessageSendingThread2(String str, int prio) {
		message=str;
		setPriority(prio);
	}
	
	public void run() {
		for(int i=0; i<1000000; i++)
			System.out.println(message+"("+getPriority()+")");
	}	
}

class PriorityTestTwo {
	public static void main(String[] args) {
		MessageSendingThread2 tr1 = new MessageSendingThread2("First", Thread.MAX_PRIORITY);
		MessageSendingThread2 tr2 = new MessageSendingThread2("Second", Thread.NORM_PRIORITY);
		MessageSendingThread2 tr3 = new MessageSendingThread2("Third", Thread.MIN_PRIORITY);
		
		tr1.start();
		tr2.start();
		tr3.start();
	}
}