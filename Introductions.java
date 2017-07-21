import java.io.Console;
    
public class Introductions {

    public static void main(String[] args) {
	// Variables
	String firstName = "Muhammed"; // camelCasing
	Console console = System.console();
	console.printf("Hello, my name is %s\n", firstName);
	// Request input
	String lastName = console.readLine("What is your name?  ");
	console.printf("%s\n", lastName);
    }
}
