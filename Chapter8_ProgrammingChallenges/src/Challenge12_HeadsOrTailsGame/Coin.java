package Challenge12_HeadsOrTailsGame;

import java.util.Random;

public class Coin {
		private String sideUp;

		public  String getSideUp() {
			return sideUp;
		}

		public void flipCoin() {
			Random rd = new Random();
			int value = rd.nextInt(2);
			if(value == 0)
				sideUp = "Heads";
			else
				sideUp = "Tails";
		}
		
		public Coin() {
			flipCoin();
		}
}
