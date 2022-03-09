/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    int result;
    public int guessNumber(int n) { 
      if(guess(n) == 0) return n;  
      checkGuess(n, 1, n);  
      return this.result;
    }
    
    public void checkGuess(int guessed, int low, int high) {
        int value = Math.abs((high/2)+(low/2)+((high%2)+(low%2))/2);
        int guess = guess(value);
        if(guess == 0) {
           this.result = value;
           return; 
        }
        else if(guess == -1) {
            high = value;
            checkGuess(value, low, high);
        } else if(guess == 1) {
            low = value;
            checkGuess(value, low, high);
        }
    }
}
