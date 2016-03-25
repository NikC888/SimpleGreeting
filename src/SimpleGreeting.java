//import library to use scanner object
import java.util.Scanner;

//class to get to know the user
public class SimpleGreeting {
	//create a class variable of a scanner object to allow user input to console
	static Scanner scanner = new Scanner(System.in);
	//static class variable to hold string array for user info
	static String username;
	//static String details;
	
	//method to say farewell to user
	public static void exitApplication() {
		//message to say farewell to user
		System.out.println("Thank you for using the simple greeting Application!");
		//exit the system
		System.exit(0);
	}
	/*
	//this is a method or function (components that make up the method form a method signature)
	public static String[] requestUserInfo(String name) {
		//create an array of strings type objects to hold values for user, size is based on supplied arguments
		//username = new String[];
		//greet the user
		System.out.println("I am excited to learn more about you " + name + "!");
		//perform a loop for the amount of iterations equal to the length of supplied items
		//for (int i=0; i<details.length; i++) {
			//for each iteration ask the user for details
			System.out.print("Can I get your name please? ");
			//capture user input in relative variable within array
			username = scanner.nextLine();
		//}
		//return the string array of supplied details
		return ;
	}
	*/
	
	public static void main(String[] args) {
		//declare local variables
		String name;
		//out a welcome message to user
		System.out.println("Hello, and welcome to the simple greeting app\nPlease enter your name.");
		//set the captured name to a local string variable, name
		name = scanner.nextLine();
		//username = scanner.nextLine();
		//call method to get user input and set it to a variable which holds an array of strings
		//details = requestUserInfo(name,"age","city of residence","favorite color","current mood");
		//output the information to the user
		outputUserDetails(name);
		//call method which gives a farewell to user and exits the system
		exitApplication();
	}
	
	public static void outputUserDetails(String name) {
		//begin outputting user gathered details such as their name
		username = name;
		System.out.println("Well *" + name + "* thanks for sharing!");
		//iterate through user details backwards, each iteration echos a detail
		//for (int i=username.length-1; i>0; i--){
			//echo detail gathered of user info and requested details to console
			//System.out.println("Your name is " + username + ".");;
		//}
	}
}
