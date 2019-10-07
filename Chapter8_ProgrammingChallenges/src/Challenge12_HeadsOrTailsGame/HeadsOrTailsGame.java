package Challenge12_HeadsOrTailsGame;

import java.util.Scanner;

public class HeadsOrTailsGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player1= new Player("Duy Manh");
		Player player2= new Player("Chau Tinh Tri");
		Scanner keyboard1= new Scanner (System.in);
		Scanner keyboard2= new Scanner (System.in);
		do {
				System.out.println("Vietnamese Player - Make your guess :");
				String guess1= keyboard1.nextLine();
				player1.flipCoin(guess1);
				System.out.println("MaCao Player - Make your guess :");
				String guess2= keyboard2.nextLine();
				player2.flipCoin(guess2);
				if(player1.getPoint()==5)
					System.out.println("Vietnamese Player Win");
					else if(player2.getPoint() ==5)
						System.out.println("MaCao Player Win");
				break;
		}
		while (player1.getPoint() !=5 || player2.getPoint() !=5);
		
		
		
	}

		
}	



