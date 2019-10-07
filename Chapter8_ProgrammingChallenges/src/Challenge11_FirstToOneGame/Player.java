package Challenge11_FirstToOneGame;

public class Player {
	private int points;

	public int getPoints() {
		return points;
	}

	public Player(int points) {
		super();
		this.points = points;
	}

	public Player(Player b) {
		this.points = b.points;
	}

	public void addPoints(int newPoints) {
		this.points += newPoints;
	}

	public void subPoints(int newPoints) {
		this.points -= newPoints;
	}

}
