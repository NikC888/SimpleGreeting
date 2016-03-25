//import library to use scanner object
import java.util.Scanner;

//class to get greet user and get name
public class SimpleGreeting {
	//create a class variable of a scanner object to allow user input to console
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		//declare local variables
		String name, loop = "not exit";
		//out a welcome message to user
		System.out.println("Hello, and welcome to the simple greeting app\nPlease enter your name.");
		//set the captured name to a local string variable, name
		name = scanner.nextLine();
		//output the information to the user
		System.out.println("Well *" + name + "* thanks for sharing! \nPlease type \"exit\" to terminate the program");
		loop = scanner.nextLine();
		
		//forever loop until user types "exit"
		while (!loop.equals("exit")){
			System.out.println("You did not type \"exit\", please try again");
			loop = scanner.nextLine();
		}
		System.out.println("You typed \"exit\"!");
		
		//message to say farewell to user
		System.out.println("Thank you for using the simple greeting Application!");
		//exit the system
		System.exit(0);
	}
}