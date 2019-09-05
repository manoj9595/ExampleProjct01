import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// output to screen
		System.out.println("my github example project");
        
		System.out.println("Whats your name?");
		Scanner keyboard = new Scanner(System.in);
		String personName = keyboard.nextLine();
		System.out.println("Hello " +  personName);
	}

}
