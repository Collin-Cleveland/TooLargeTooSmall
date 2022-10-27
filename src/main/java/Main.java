import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

//Generate random number -- (int) (Math.random() * range) + minNumber
        int randNum = (int) (Math.round(Math.random() * 10) + 1);
        int guess = 0;
        int numOfGuess = 0;
        Scanner scan = new Scanner(System.in);
//Prompt user with guessing a whole number
//After every guess the program should display some variation of "too large", "too small", "correct guess", respectively.
//do while loop? with if statements to arrange System.out.println
//Upon termination, the program should display the number of guesses before successfully guessing correctly.
//A number that is input consecutively, should register as a single guess.
        do {
            System.out.println("Guess a whole number between 0 and 10:");
            guess = scan.nextInt();
            if (guess < randNum){
                System.out.println("The number you guessed is too low, try again.");
            } else if  (guess > randNum){
                System.out.println("The number you guessed is too high, try again");
            }
            if (guess != randNum) {
                numOfGuess++;
            }
        } while(guess != randNum);
            if (guess == numOfGuess) {
                System.out.println("Correct!");
            } else {
                System.out.println("Correct! It took you " + numOfGuess + " attempts to get it correct.");
            }
    }
}
