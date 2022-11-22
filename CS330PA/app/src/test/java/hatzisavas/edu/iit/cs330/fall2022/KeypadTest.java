package hatzisavas.edu.iit.cs330.fall2022;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

class KeypadTest {
	@Test
	void test_new_instance_initial_state_is_start() {
		Keypad sd = new Keypad();
		assertEquals(0, sd.getState());
	}

	@Test
	void test_8_changes_state_to_1() {
		Keypad sd = new Keypad();
		sd.input(8);
		assertEquals(1, sd.getState());
	}

	@Test
	void test_83_changes_state_to_2() {
		Keypad sd = new Keypad();
		sd.input(8);
		sd.input(3);
		assertEquals(2, sd.getState());
	}

	@Test
	void test_832_changes_state_to_3() {
		Keypad sd = new Keypad();
		sd.input(8);
		sd.input(3);
		sd.input(2);
		assertEquals(3, sd.getState());
	}

	@Test
	void test_8320_changes_state_to_4() {
		Keypad sd = new Keypad();
		sd.input(8);
		sd.input(3);
		sd.input(2);
		sd.input(0);
		assertEquals(4, sd.getState());
	}

	@Test
	void test_83200_changes_state_to_5() {
		Keypad sd = new Keypad();
		sd.input(8);
		sd.input(3);
		sd.input(2);
		sd.input(0);
		sd.input(0);
		assertEquals(5, sd.getState());
	}

	@Test
	void test_832001_changes_state_to_6() {
		Keypad sd = new Keypad();
		sd.input(8);
		sd.input(3);
		sd.input(2);
		sd.input(0);
		sd.input(0);
		sd.input(1);
		assertEquals(6, sd.getState());
	}

	@Test
	void test_832004_changes_state_to_7() {
		Keypad sd = new Keypad();
		sd.input(8);
		sd.input(3);
		sd.input(2);
		sd.input(0);
		sd.input(0);
		sd.input(4);
		assertEquals(7, sd.getState());
	}

	@Test
	void test_new_instance_output_is_empty_string() {
		Keypad sd = new Keypad();
		assertEquals("", sd.getOutput());
	}

	@Test
	void test_that_output_in_state_got_1_is_empty_string() {
		Keypad sd = new Keypad();
		sd.input(8);
		assertEquals("", sd.getOutput());
	}

	@Test
	void test_that_output_in_state_got_2_is_empty_string() {
		Keypad sd = new Keypad();
		sd.input(8);
		sd.input(3);
		assertEquals("", sd.getOutput());
	}

	@Test
	void test_that_output_in_state_got_3_is_empty_string() {
		Keypad sd = new Keypad();
		sd.input(8);
		sd.input(3);
		sd.input(2);
		assertEquals("", sd.getOutput());
	}

	@Test
	void test_that_output_in_state_got_4_is_empty_string() {
		Keypad sd = new Keypad();
		sd.input(8);
		sd.input(3);
		sd.input(2);
		sd.input(0);
		assertEquals("", sd.getOutput());
	}

	@Test
	void test_that_output_in_state_got_5_is_empty_string() {
		Keypad sd = new Keypad();
		sd.input(8);
		sd.input(3);
		sd.input(2);
		sd.input(0);
		sd.input(0);
		assertEquals("", sd.getOutput());
	}

	@Test
	void test_that_output_in_state_got_6_is_Unlocked() {
		Keypad sd = new Keypad();
		sd.input(8);
		sd.input(3);
		sd.input(2);
		sd.input(0);
		sd.input(0);
		sd.input(1);
		assertEquals("Unlocked", sd.getOutput());
	}

	@Test
	void test_that_output_in_state_got_7_is_Locked() {
		Keypad sd = new Keypad();
		sd.input(8);
		sd.input(3);
		sd.input(2);
		sd.input(0);
		sd.input(0);
		sd.input(4);
		assertEquals("Locked", sd.getOutput());
	}

	@Test
	void test_digit_not_in_access_key_changes_state_to_start_for_initial_state() {
		Keypad sd = new Keypad();
		sd.input(5);
		assertEquals(0, sd.getState());
	}

	@Test
	void test_digit_not_in_access_key_changes_state_to_start_for_first_state() {
		Keypad sd = new Keypad();
		sd.input(8);
		sd.input(5);
		assertEquals(0, sd.getState());
	}

	@Test
	void test_digit_not_in_access_key_changes_state_to_start_for_second_state() {
		Keypad sd = new Keypad();
		sd.input(8);
		sd.input(3);
		sd.input(5);
		assertEquals(0, sd.getState());
	}

	@Test
	void test_digit_not_in_access_key_changes_state_to_start_for_third_state() {
		Keypad sd = new Keypad();
		sd.input(8);
		sd.input(3);
		sd.input(2);
		sd.input(5);
		assertEquals(0, sd.getState());
	}

	@Test
	void test_digit_not_in_access_key_changes_state_to_start_for_fourth_state() {
		Keypad sd = new Keypad();
		sd.input(8);
		sd.input(3);
		sd.input(2);
		sd.input(0);
		sd.input(5);
		assertEquals(0, sd.getState());
	}

	@Test
	void test_digit_not_in_access_key_changes_state_to_start_for_fifth_state() {
		Keypad sd = new Keypad();
		sd.input(8);
		sd.input(3);
		sd.input(2);
		sd.input(0);
		sd.input(0);
		sd.input(5);
		assertEquals(0, sd.getState());
	}

}