import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class SecurityInstallation {

	public static void main(String[] args) throws IOException {
		Keypad kp1 = new Keypad();
		Character allowed[] = {'0','1','2','3','4','5','6','7','8','9'};
		ArrayList<Character> allowedList = new ArrayList<Character>();
		allowedList.addAll(Arrays.asList(allowed));
		InputStreamReader in = new InputStreamReader(System.in);
		while (true){
			char input = (char)in.read();
//			System.out.println(input);
			if (allowedList.contains(input)) {
				int intInput = Character.getNumericValue(input);
//				System.out.println(intInput);
				kp1.input(intInput);
				String output = kp1.getOutput();
				if (output.equals("Unlocked") || output.equals("Locked")) {
					System.out.println(output);
				}
			}
		}
	}

}
