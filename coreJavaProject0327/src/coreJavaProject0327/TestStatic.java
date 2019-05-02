package coreJavaProject0327;

public class TestStatic {
/*	int keyChain=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//have to instantiate the class to have a method that isn't staic (void keyChain)
		TestStatic ts = new TestStatic();
		ts.keyChain();
	
	}
	 void keyChain() {
		keyChain++;
	}*/

	 static int keyChain=0;

		public static void main(String[] args) {
			// TODO Auto-generated method stub



			keyChain();
		
		}
		 static void keyChain() {
			keyChain++;
		}
}
