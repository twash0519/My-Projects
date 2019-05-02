package coreJavaProject0327;

public class RechargeITer {
	String name;
	String commitId;
	String email;
	String buddyName;
	int javaKBAScore;
	String awsID;
	String bLine;
	
/*	
	public static void printMe(RechargeITer obj) {
		
		System.out.println(obj.name);
		System.out.println(obj.commitId);
		System.out.println(obj.email);
		System.out.println(obj.buddyName);
		System.out.println(obj.javaKBAScore);
		System.out.println(obj.awsID);
		System.out.println(obj.bLine);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RechargeITer vernon = new RechargeITer();
		vernon.name="Vernon";
		vernon.commitId ="ADC4BQH";
		vernon.buddyName="Marco";
		vernon.email ="vernon.williams@bnymelloom";
		vernon.bLine="ADC4BQH";
		vernon.awsID = "vernonw";
		vernon.javaKBAScore = 100;
		
		
		printMe(vernon);	
		
	}*/
	
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
		RechargeITer vernon = new RechargeITer();
		vernon.name="Vernon";
		vernon.commitId ="ADC4BQH";
		vernon.buddyName="Marco";
		vernon.email ="vernon.williams@bnymelloom";
		vernon.bLine="ADC4BQH";
		vernon.awsID = "vernonw";
		vernon.javaKBAScore = 100;
		
		
		vernon.printMe();
		
		
		
		
		
		RechargeITer theresa = new RechargeITer();
		theresa.name="Theresa";
		theresa.commitId ="ADC4BQH";
		theresa.buddyName="Marco";
		theresa.email ="theresa.gaines@bnymelloom";
		theresa.bLine="ADCCB2QG";
		theresa.awsID = "ADCCB2QG";
		theresa.javaKBAScore = 100;
		
		
		theresa.printMe();
	
		
	}

}
