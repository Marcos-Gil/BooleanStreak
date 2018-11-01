Author: Marcos Gil

Purpose of Program: 
-------------------

This is a program that will take an array of booleans as input then it will go through the array and find the biggest streak of consecutive trues in a row, then return that number

List of Sources:
----------------

BooleanStreak.java

Usage instructions:
-----------------------

Using DrJava: Hit the compile button to compile, then in the Interactions window, type

 * BooleanStreak.longestStreak(boolean[])
 
 Using cmd.exe (windows) or terminal (mac)
 
 * Compilation: javac BooleanStreak.java
 * Usage      : java BooleanStreak.longestStreak(boolean[])

Examples: (run in the interaction window of DrJava, or a shell)

 * > boolean[] test_case = new boolean[]{false, true, true, false};
 * > BooleanStreak.longestStreak(test_case)
 * 2

 * > boolean[] test_case = new boolean[]{false};
 * > BooleanStreak.longestStreak(test_case)
 * 0

 * * > boolean[] test_case = new boolean[]{false, true, true, true, false, true, true, true};
 * > BooleanStreak.longestStreak(test_case)
 * 3
