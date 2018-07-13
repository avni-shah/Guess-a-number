import java.util.Scanner;
public class Number_Guess {
	
	private static int Ena;
	
	public static void main(String [] args) {
		Number_Guess guess = new Number_Guess();
	}
	private Number_Guess() {
		Ena=Numero_Generator();
		System.out.println("Guess a number between 1 and 100!");
		for(int i=0; i<7; i++) {
			System.out.println("You have "+ (7-i) + " turns left!");
			int b=Input();
			if (Ena == b) {
				System.out.println("Congratulations! You have beat the computer!");
				break;
			}
			else if(b<Ena){
				System.out.println("Your guess is incorrect. The correct number is higher!");
			}
			else if(b>Ena) {
				System.out.println("Your guess is incorrect.  The correct number is lower!");
			}
			if (i==6) {
				System.out.println("Sorry! The real number is " +(Ena) + "!");
			}
		}
	}
	private static int Input() {
		Scanner harryPotter = new Scanner(System.in);
		return harryPotter.nextInt();
	}
	private static int Numero_Generator() {
		return (int) (Math.random()*100);
	}
}