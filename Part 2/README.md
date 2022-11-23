# README - Part 2 

# What is this for? 
The code in this folder simulates an intruder generating random digits until they break the lock on the Security Installation. It does this by generating random digits until the unlock code, "832001", is generated and counting the amount of digits that were genereated before the unlock code. This trial is run 150 times by the application. This application will then display the average, minimum, and maximum amount of digits generated before the unlock code. This is the program used to obtain the data that is used in `Part 2.docx`. 

# Setup Instructions 
You must have [Gradle](https://gradle.org/) and [Java](https://www.oracle.com/java/technologies/downloads/) installed before the setup. Instructions for how to set up Gradle can be found [here](https://gradle.org/install/). The following instructions are for a Windows 10/11 environment. This has only been tested in Windows 10, however, it should work the same way in Windows 11. Additionally, the following commands are for use in the Windows command prompt. Equivalent Linux commands should work in Linux based systems. 

## Configuration
  1. If the repository is not already cloned, do so: 
    `git clone https://github.com/NikoHatzisavas724/CS330ProgrammingAssignment.git`
  2. Change directory to the part 2 folder. The following instruction assumes your current directory is the base folder of the repo (CS330ProgrammingAssignment).
    `cd Part 2\Gradle`
     If your current directory is outside the repo folder (like it would be if you had just cloned the repo), use the following command instead: 
     `cd CS330ProgrammingAssignment\Part 2\Gradle`
  3. Build an executable jar file: 
    `gradlew jar`
  4. Run the executable:
     `Gradle\app\build\libs\app.jar`
     This will start the program which generates 150 trial runs of breaking the lock, and will output the average, minimum, and maximum number of digits generated before the unlock key to the console. It will then terminate. 
