package Challenge11_FirstToOneGame;

import java.util.Random;

public class Dice {
	private final int diceNumbers = 6;

	public int rollDice() {
		int result;
		Random roll = new Random();
		result = roll.nextInt(diceNumbers) + 1;
		return result;
	}

}
