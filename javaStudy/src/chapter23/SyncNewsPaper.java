package chapter23;

class NewsPaper2 {
	String todayNews;
	boolean isTodayNews=false;
	
	public void setTodayNews(String news) {
		todayNews=news;
		isTodayNews=true;
		
		synchronized(this){
			notifyAll();
		}
	}
	
	public String getTodayNews() {
		if(isTodayNews==false) {
			try {
				synchronized(this) {
					wait();
				}
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		return todayNews;
	}
}

class NewsWriter2 extends Thread {
	NewsPaper2 paper;
	
	public NewsWriter2(NewsPaper2 paper) {
		this.paper=paper;
	}
	
	public void run() {
		paper.setTodayNews("�ڹ��� ���Ⱑ �߰̽��ϴ�.");
	}
}

class NewsReader2 extends Thread {
	NewsPaper2 paper;
	
	public NewsReader2(NewsPaper2 paper) {
		this.paper=paper;
	}
	
	public void run() {
		System.out.println("������ ����: "+paper.getTodayNews());
	}
}

class SyncNewsPaper {
	public static void main(String[] args) {
		NewsPaper2 paper=new NewsPaper2();
		NewsReader2 reader1=new NewsReader2(paper);
		NewsReader2 reader2=new NewsReader2(paper);
		NewsWriter2 writer=new NewsWriter2(paper);

		try {
			reader1.start();
			reader2.start();
			
			Thread.sleep(1000);			
			writer.start();
	
			reader1.join();
			reader2.join();
			writer.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}