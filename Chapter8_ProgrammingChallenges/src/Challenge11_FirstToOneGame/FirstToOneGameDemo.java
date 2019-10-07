package Challenge11_FirstToOneGame;

public class FirstToOneGameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player playerA = new Player(50);
		Player playerB = new Player(50);
		Dice dice = new Dice();

		int points;
		int round = 0;
		do {
			round++;
			points = dice.rollDice();
			if (playerA.getPoints() - points < 1)
				playerA.addPoints(points);
			else
				playerA.subPoints(points);
			points = dice.rollDice();
			if (playerB.getPoints() - points < 1)
				playerB.addPoints(points);
			else
				playerB.subPoints(points);
			if (playerA.getPoints() == 1 || playerB.getPoints() == 1)
				break;

		} while (playerA.getPoints() != 1 || playerB.getPoints() != 1);
		System.out.println("Player A points: " + playerA.getPoints());
		System.out.println("Player B points: " + playerB.getPoints());
		System.out.println("Turn-rounds: " + round);
	}
}
