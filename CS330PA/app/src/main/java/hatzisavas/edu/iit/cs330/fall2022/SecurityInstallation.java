package hatzisavas.edu.iit.cs330.fall2022;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class SecurityInstallation {

	static Keypad kp1;
	static boolean kpCreated = false;

	public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		while (true) {
			char inp = (char) in.read();
			if (inp != '\r' && inp != '\n') {
				simulateKeypad(inp);
			}
		}
	}

	static int readInput(char in) throws IOException {
		int intInput = 0000;
		char input = (char) in;
		Character allowed[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		ArrayList<Character> allowedList = new ArrayList<Character>();
		allowedList.addAll(Arrays.asList(allowed));
		if (allowedList.contains(input)) {
			intInput = Character.getNumericValue(input);
		} else {
			intInput = 9999;
		}
		return intInput;
	}

	static void simulateKeypad(char in) throws IOException {
		if (!kpCreated) {
			createKeypad();
		}
		int intInput = readInput(in);
		if (intInput != 9999) {
			kp1.input(intInput);
			String output = kp1.getOutput();
			if (output.equals("Unlocked") || output.equals("Locked")) {
				System.out.println(output);
			}
		}
	}

	static void createKeypad() {
		kp1 = new Keypad();
		kpCreated = true;
	}
}
