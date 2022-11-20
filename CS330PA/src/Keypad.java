public class Keypad {
	private int current_state;
	private String current_output;
	private int[][] stt;
	private String[] out;

	private void initialize_stt() {
		this.stt = new int[6][10];
		this.out = new String[8];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 10; j++) {
				this.stt[i][j] = 0;
			}
		}
		stt[0][8] = 1;
		stt[1][3] = 2;
		stt[2][2] = 3;
		stt[3][0] = 4;
		stt[4][0] = 5;
		stt[5][1] = 6;
		stt[5][4] = 7;

		out[0] = "";
		out[1] = "";
		out[2] = "";
		out[3] = "";
		out[4] = "";
		out[5] = "";
		out[6] = "Unlocked";
		out[7] = "Locked";
	}

	public Keypad() {
		initialize_stt();
		this.current_state = 0;
		this.current_output = this.out[current_state];
	}

	public int getState() {
		return current_state;
	}

	public String getOutput() {
		return current_output;
	}

	public void input(int in) {
		int ns;
		ns = stt[current_state][in];
		current_state = ns;
		current_output = out[current_state];
		return;
	}

}
