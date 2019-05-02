package coreJavaProject0327;

public class RechargeConstructors {
	String name;
	String commitId;
	String email;
	String buddyName;
	int javaKBAScore;
	String awsID;
	String bLine;
	
	RechargeConstructors(String name, String commitID,String email, int javaKBAScore){ //student
		this.name=name;
		this.commitId =commitID;
		this.email = email;
		this.javaKBAScore = javaKBAScore;
	}
	
	RechargeConstructors(String name,String email, String awsID){ //instructor
		this.name=name;
		this.email = email;
		this.javaKBAScore = javaKBAScore;
		this.awsID = awsID;
		this.bLine = bLine;;
	}
	RechargeConstructors(){
		
		
	}
	int add(int x, int y) { //method
		return x+y;
		
	}
	
	int add(int x, int y, int z) { //method
		
		return x+y+z;
		
	}

	
	//non-static, need to instantiate
	public  void printMe() {
		System.out.println(name);
		System.out.println(commitId);
		System.out.println(buddyName);
		System.out.println(email);
		System.out.println(javaKBAScore);
		System.out.println(awsID);
		System.out.println(bLine);
	}
		



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		RechargeConstructors theresa = new RechargeConstructors("Theresa","ADC4BQH","theresa.gaines@bnymelloom",100 );


		theresa.buddyName="Marco";
		theresa.bLine="ADCCB2QG";
		theresa.awsID = "ADCCB2QG";
		
		
		RechargeConstructors vernon = new RechargeConstructors("Vernon","ADC4BQH","vernon.williams@bnymelloom",100 );


		vernon.buddyName="Marco";
		vernon.bLine="ADC4QHG";
		vernon.awsID = "ADC4QHG";

		RechargeConstructors instructor = new RechargeConstructors("Instructor","ins1@perscholas.org","ins.per");

		instructor.add(2,5);
		instructor.add(2,5, 5);
		vernon.add(2, 5);
		
		
		
		theresa.printMe();
		
		RechargeConstructors[] pList = new RechargeConstructors[25];
		pList[0] = theresa;
		pList[1] = vernon;
		
		
		for(int i = 0; i< 2; i++) {
		//	System.out.println("My name is " + pList[i].name);
			pList[i].printMe();
		}
		
		System.out.println();
		
	
		
	}

}
