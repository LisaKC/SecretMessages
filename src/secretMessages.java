import java.util.Scanner;

public class secretMessages {

	public static void main(String[] args) {
		//prompt the user for message input
		System.out.println("Enter a message to encode or decode:");
		//accept the user input user scanner object named in
		Scanner in = new Scanner(System.in);
		//create String variable called message to accept the user input
		String message = in.nextLine();
		//create a variable called out for the reversed string, make it empty
		String output ="";
		//use a for loop to run through each character in the message - end to start
		//initialize a variable i to the index of last character in string
		//loop through characters from last to first in reverse order
		for (int i=message.length()-1; i>=0; i--) {
			//get the character at each index position in the string
			//add the character to the string output using +
			output += message.charAt(i);
		}
		//display the message from the for loop
		System.out.println(output);

	}

}
