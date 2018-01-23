import java.util.Scanner;

public class secretMessages {
	public static void main(String[] args) {
		// prompt the user for message input
		System.out.println("Enter a message to encode or decode:");
		// accept the user input user scanner object named in
		Scanner in = new Scanner(System.in);
		// create String variable called message to accept the user input
		String message = in.nextLine();
		// create a variable called out for the reversed string, make it empty
		String output = "";
		// create character variable called key for decoding caeser coder
		char key = 13;
		// use a for loop to go through each string character - start to end
		for (int i = 0; i < message.length(); i++) {
			// get the next character from the message
			char input = message.charAt(i);
			// check to make sure it's a letter
			if (input >= 'A' && input <= 'Z') {
				// encode the letter by adding the key to it
				input += key;
				// check whether adding the key value pushes the letter past Z
				if (input > 'Z') {
					// subtract 26 from the encoded input value so it wraps around to the front of
					// the alphabet
					input -= 26;
				}
			}
			// include lowercase letters
			else if (input >= 'a' && input <= 'z') {
				input += key;
				if (input > 'z') {
					input -= 26;
				}
			}
			// add the resulting input value to the output string
			output += input;
		}
		// display the message from the for loop
		System.out.println(output);
		// close the scanner
		in.close();
	}
}