package chapter17;

interface PersonalNumberStorage3 {
	void addPersonalInfo(String perNum, String name);
	String searchName(String perNum);
}

class PersonalNumInfo3 {
	String name;
	String number;
	
	public PersonalNumInfo3(String name, String number) {
		this.name=name;
		this.number=number;
	}
	
	public String getName(){return name;}
	public String getNumber(){return number;}
}

class PersonalNumberStorageImpl3 implements PersonalNumberStorage3 {
	PersonalNumInfo3[] perArr;
	int numOfPerInfo;
	
	public PersonalNumberStorageImpl3(int sz) {
		perArr=new PersonalNumInfo3[sz];
		numOfPerInfo=0;
	}
	
	public void addPersonalInfo(String perNum, String name) {
		perArr[numOfPerInfo]=new PersonalNumInfo3(perNum, name);
		numOfPerInfo++;
	}
	
	public String searchName(String perNum) {
		for(int i=0; i<numOfPerInfo; i++) {
			if(perNum.compareTo(perArr[i].getNumber())==0)
				return perArr[i].getName();
		}		
		return null;
	}
}


class InterfaceImplements
{
	public static void main(String[] args)
	{
		PersonalNumberStorage3 storage=new PersonalNumberStorageImpl3(100);
		storage.addPersonalInfo("��⵿", "950000-1122333");
		storage.addPersonalInfo("����", "970000-1122334");	
		
		System.out.println(storage.searchName("950000-1122333"));
		System.out.println(storage.searchName("970000-1122334"));
	}
}