package interfaceActivities;

public class ConcreteClass implements MyInterface, YourInterface {
	
	

		public void sayHello() {
			System.out.println("Hi, there!");
			
				
		}
		
		@Override
		public void shakeHand() {
			// TODO Auto-generated method stub
			System.out.println("Shake hand!");
		}
		
		@Override
		public void letsChat() {
			// TODO Auto-generated method stub
			System.out.println("Lets have coffee and chat!");
			
		}
		
		public static void main(String[] args) {
			ConcreteClass contreteClass = new ConcreteClass();
			
			
			//MyInterface myInterface = new ConcreteClass();
			contreteClass.sayHello();
			contreteClass.shakeHand();
			contreteClass.letsChat();
			
			}

		


		
	}


