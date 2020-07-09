package chapter21;

class Orange3 {
	int sugarContent;	// 당분 함량
	public Orange3(int sugar) { sugarContent=sugar; }
	public void showSugarContent() { System.out.println("당도 "+sugarContent); }
}

class OrangeBox {
    Orange3 item;
    public void store(Orange3 item) { this.item=item; }
    public Orange3 pullOut() { return item; }
}

class OrangeBaseOrangeBox {	
	public static void main(String[] args) {
		OrangeBox fBox1=new OrangeBox();
		fBox1.store(new Orange3(10));
		Orange3 org1=fBox1.pullOut();
		org1.showSugarContent();
		
		OrangeBox fBox2=new OrangeBox();
		fBox2.store("오렌지");
		Orange3 org2=fBox2.pullOut();
		org2.showSugarContent();	
	}
}