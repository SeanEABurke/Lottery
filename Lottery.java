import java.util.*;

public class Lottery {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your 2-digit lottery guess: ");
		int guess = input.nextInt();
		
		int lottery = (int) (Math.random() * 100);
		
		if (lottery < 10) {
			lottery += (10 * (int)(Math.random() * 10));
		}
		
		int guess1 = guess / 10;
		int guess2 = guess % 10;
		
		int lottery1 = lottery / 10;
		int lottery2 = lottery % 10;
		
		
		if (guess == lottery) {
			System.out.println("You win! You get 10,000$");
		}
		else if (guess1 == lottery2 && guess2 == lottery1) {
			System.out.println("You got the right digits, but the wrong order. You win 3,000$");
		}
		else if (guess1 == lottery1 || guess1 == lottery2 || guess2 == lottery1 || guess2 == lottery2) {
			System.out.println("You got one digit correctly, you win 1,000$. The lottery number was: " + lottery);
		}	
		else {
			System.out.println("You lose, please try again :). The lottery number was: " + lottery);
		}
	}

}
