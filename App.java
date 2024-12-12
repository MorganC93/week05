package week05;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger asteriskLogger = new AsteriskLogger();
		
		Logger spacedLogger = new SpacedLogger();
		
		
		System.out.println("AsteriskLogger - Test 1: ");
		asteriskLogger.log("Cody Morgan");
		
		System.out.println("\nAsteriskLogger - Test 2: ");
		asteriskLogger.error("Cody Morgan");
		
		System.out.println("\nspacedLogger - Test 3:");
		spacedLogger.log("Cody Morgan");
		
		System.out.println("\nspacedLogger - Test 4:");
		spacedLogger.error("Cody Morgan");
		

	}

}
