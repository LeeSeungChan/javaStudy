package chapter17;

class TV2 {
	public void onTV() {
		System.out.println("영상 출력 중");
	}
}

interface Computer2 {
	public void dataReceive();
}

class ComputerImpl2 {	
	public void dataReceive() {
		System.out.println("영상 데이터 수신 중");
	}
}

class IPTV2 extends TV2 implements Computer2 {
	ComputerImpl2 comp=new ComputerImpl2();
	
	public void dataReceive() {
		comp.dataReceive();
	}
	
	public void powerOn() {
		dataReceive();
		onTV();
	}
}

class MultiInheriAlternative {	

	public static void main(String[] args) {
		IPTV2 iptv=new IPTV2();
		iptv.powerOn();
		
		TV2 tv=iptv;
		Computer2 comp=iptv;
	}
}