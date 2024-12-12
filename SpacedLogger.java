package week05;

public class SpacedLogger implements Logger{

	public void log(String message) {
		String spacedOut = String.join(" ", message.split(""));
		System.out.println(spacedOut);
	}
	
	public void error(String message) {
		String spacedOut = String.join(" ", ("ERROR: " + message).split(""));
		System.out.println(spacedOut);
	}
	
		
	

}
