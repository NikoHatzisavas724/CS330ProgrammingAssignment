# README
IIT Fall 2022, CS330 Programming Assignment 

# What is this repository for?
This repository contains Java code for a security device that utilizes a finite state machine (FSM). This was created for the programming project of the fall 2022 CS330 course at IIT. This code implements an FSM that accepts a 5 digit access code (83200). Depending on whether 1 or 4 is entered afterwards, it locks or unlocks. 832001 unlocks the device, and 832004 locks the device. Any digit not in the access code will rest the FSM to its initial state. Ant input that is not an integer will be discarded. The application uses an unbuffered input stream and goes character by character though the input which may be as long as the user desires.  

# Setup Instructions 
The following instructions are for a Windows 10/11 environment. This has only been tested in Windows, however equivalent codmmands should work in Linux based systems. For example, the Windows command: 
`git clone`
may be replaced with the following on a Linux based system: 
`$ git clone`

## Configuration 
  1. Clone the repository:
    `git clone https://github.com/NikoHatzisavas724/CS330ProgrammingAssignment.git`
  2. Change directory to where the gradle files are: 
    `cd CS330ProgrammingAssignment/CS330PA/`
    Note, all gradle commands should be run from this directory.
  3. Make sure all unit tests pass:
    `gradlew test`
    Use your browser to view the html report, which is located at:
    `\app\build\reports\tests\test\packages\hatzisavas.edu.iit.cs330.fall2022.html`
  4. Build an executable jar file:
    `gradlew jar`
  5. Run the executable:
    `java -jar \app\build\libs\app.jar`
  6. Generate jacoco unit-test coverage report:
    `gradlew jacocoTestReport`
    Use your browser to view the html report, which is located at: 
    `\app\build\reports\jacoco\test\html\hatzisavas.edu.iit.cs330.fall2022\index.html`
