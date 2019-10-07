package Challenge12_HeadsOrTailsGame;

public class Player {
	private String name;
	private int points;
	private Coin coin;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return points;
	}

	public Coin getCoin() {
		return coin;
	}

	public Player(String name) {
		super();
		this.name = name;
		this.points = 0;
		this.coin = new Coin();
	}

	public boolean flipCoin(String guess) {
		boolean result = false;
		if (guess.equalsIgnoreCase(coin.getSideUp())) {
			points++;
			System.out.println(coin.getSideUp());
			System.out.printf("%s is %d point \n ", name, points);
		} 
		else {
			points--;
			System.out.println(coin.getSideUp());
			System.out.printf("%s is %d point \n ", name, points);
		}
		if (points == 5)
			result = true;
		return result;
	}
}
