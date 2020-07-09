package chapter09;

class SinivelCap2   // 콧물 처치용 캡슐
{
	public void take(){System.out.println("콧물이 싹~ 납니다.");}
}

class SneezeCap2   // 재채기 처치용 캡슐
{
	public void take() {System.out.println("재채기가 멎습니다.");}
}

class SnuffleCap2   // 코막힘 처치용 캡슐
{
	public void take() {System.out.println("코가 뻥 뚫립니다.");}
}

class CONTAC600 {
	SinivelCap2 sin;
	SneezeCap2 sne;
	SnuffleCap2 snu;
	
	public CONTAC600() {
		sin=new SinivelCap2();
		sne=new SneezeCap2();
		snu=new SnuffleCap2();
	}
	
	public void take() {
		sin.take();
		sne.take();
		snu.take();
	}
}

class ColdPatient2 {
	public void takeCONTAC600(CONTAC600 cap){cap.take();}
}

class Encapsulation2{
	public static void main(String args[]) {
		ColdPatient2 sufferer = new ColdPatient2();
		sufferer.takeCONTAC600(new CONTAC600());
	}
}