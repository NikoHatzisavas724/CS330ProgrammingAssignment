# README

# What is this repository for?
This repository contains Java code for a security device that utilizes a finite state machine (FSM). This was created for the programming project of the fall 2022 CS330 course at IIT. This code implements an FSM that accepts a 5 digit access code (83200). Depending on whether 1 or 4 is entered afterwards, it locks or unlocks. 832001 unlocks the device, and 832004 locks the device. Any digit not in the access code will rest the FSM to its initial state. Ant input that is not an integer will be discarded. The application uses an unbuffered input stream and goes character by character though the input which may be as long as the user desires.  

# Setup Instructions 
You must have [Gradle](https://gradle.org/) installed before the setup. Instructions for how to set up Gradle can be found [here](https://gradle.org/install/). The following instructions are for a Windows 10/11 environment. This has only been tested in Windows, however equivalent codmmands should work in Linux based systems. For example, the Windows command: 
`git clone`
may be replaced with the following on a Linux based system: 
`$ git clone`

## Configuration 
  1. Open the widows command prompt and clone the repository:
    `git clone https://github.com/NikoHatzisavas724/CS330ProgrammingAssignment.git`
  2. Change directory to where the gradle files are: 
    `cd CS330ProgrammingAssignment/CS330PA/`
    Note, all gradle commands should be run from this directory.
  3. Make sure all unit tests pass:
    `gradlew test`
    Use your browser to view the html report, which is located at:
    `app\build\reports\tests\test\packages\hatzisavas.edu.iit.cs330.fall2022.html`
  4. Build an executable jar file:
    `gradlew jar`
  5. Run the executable:
    `java -jar app\build\libs\app.jar`
    Enter characters on the keyboard, as many as you want. As the program uses the unbuffered InputStreamReader to take input character by character, there is no risk of buffer overflow so there is no limit to the amount of charcters that may be entered at once. When you are finished entering, press enter/return. If the code 832001 is found anywhere in the string you entered, the console will display the message "Unlocked", and if the code 832004 is present it will display the message "Locked". If both are present it will display them one after the other in the order that they were entered. Any characters may be entered, as any non integer characters will be disregarded by the program. After pressing enter, additional strings may be entered. Since the application runs on an infinite loop which endlessly accepts user input, use Ctrl+C to terminate the program. 
  6. Generate jacoco unit-test coverage report:
    `gradlew jacocoTestReport`
    Use your browser to view the html report, which is located at: 
    `app\build\reports\jacoco\test\html\hatzisavas.edu.iit.cs330.fall2022\index.html`

# Known Issues
Strings that represent negative integers are read as positive integers. This is because the minus sign gets disregardeed as it is not an integer, but the number it was in front of is read without the minus sign. 

# License 
[GNU Public License](https://www.gnu.org/licenses/gpl-3.0.html)

# About The Author 
Name: Nicholas Hatzisavas 

Email: nhatzisavas@hawk.iit.edu
