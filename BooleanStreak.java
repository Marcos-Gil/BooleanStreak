/**
 * By: Marcos Gil
 *
 * This is a program that will take an array of booleans as input
 * then it will go through the array and find the biggest
 * streak of consecutive trues in a row, then return that
 * number
 * 
 * Using DrJava: Hit the compile button to compile, then in the 
 * Interactions window, type
 * 
 *  BooleanStreak.longestStreak(boolean[])
 * 
 * Using cmd.exe (windows) or terminal (mac)
 * Compilation: javac BooleanStreak.java
 * Usage      : java BooleanStreak.longestStreak(boolean[])
 *
 * Examples: (run in the interaction window of DrJava, or a shell)
 * 
 * > boolean[] test_case = new boolean[]{false, true, true, false};
 * > BooleanStreak.longestStreak(test_case)
 * 2
 * 
 * > boolean[] test_case = new boolean[]{false};
 * > BooleanStreak.longestStreak(test_case)
 * 0
 * 
 * * > boolean[] test_case = new boolean[]{false, true, true, true, false, true, true, true};
 * > BooleanStreak.longestStreak(test_case)
 * 3
 */

public class BooleanStreak {
  
  /* A class that contains the method longestStreak which will find the highest amount of consecutive true booleans and return that number*/
  
  public static int longestStreak(boolean[] values) {
    
    /**
    * This method will return an int that holds the amount of consecutive true booleans in a row.
    *  
    * Input: An array of boolean values
    * Return: An int that holds the highest amount of consecutive true booleans in a row
    * 
    * Contract:
    *  longestStreak: boolean[] -> int
    *  
    *  Purpose: Take an array of booleans, find the highest amount of true in a row, then return a count of how many true booleans in a row
    *  
    *  Pre-Conditions:
    *    An array of booleans is entered with at least 1 value
    *  
    *  Post-Conditions:
    *    Outputs > 0
    *            If a boolean array with no true is entered
    *            
    *            > 2
    *            If boolean[]{false, true, true, false}
    * 
    *            >3
    *            If boolean[]{false, true, true, true, false, true, true, true}; 
    *  
    *  Side Effecs:
    *    None
    */

    
    /* Creating 2 counters to keep track of the current streak and the max streak of true booleans */
    int streakCount = 0;
    int maxCount = 0;
    
    /* Looping through the array, if a true is found, the counter increases. If a false is found, the counter resets.
     * before looping again through the for loop it checks if the current Streak is bigger then the max, and if it is
     * then it replaces it. Returns the max count */
    for (int i = 0; i < values.length; i += 1){
      
      if (values[i] == true){
        
        streakCount = streakCount + 1;
      }else if (values[i] == false){
        
        streakCount = 0;
      }
      
      if (streakCount > maxCount){
       
        maxCount = streakCount;
      }
    }
    return maxCount;
  }
}