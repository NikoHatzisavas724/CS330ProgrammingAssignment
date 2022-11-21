package hatzisavas.edu.iit.cs330.fall2022;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class SecurityInstallation {

	public static void main(String[] args) throws IOException {
		Keypad kp1 = new Keypad();
		InputStreamReader in = new InputStreamReader(System.in);
		while (true) {
			int intInput = readInput(in);
			kp1.input(intInput);
			String output = kp1.getOutput();
			if (output.equals("Unlocked") || output.equals("Locked")) {
				System.out.println(output);
			}
		}
	}

	static int readInput(InputStreamReader in) throws IOException {
		boolean valid = false;
		int intInput = 0000;
		while (!valid) {
			char input = (char) in.read();
			Character allowed[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
			ArrayList<Character> allowedList = new ArrayList<Character>();
			allowedList.addAll(Arrays.asList(allowed));
			if (allowedList.contains(input)) {
				intInput = Character.getNumericValue(input);
				valid = true;
			}
		}
		return intInput;
	}

}
