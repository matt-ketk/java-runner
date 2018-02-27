package inheritanceExplorationTwo;

public class Weapon {
	private int strength;

	public Weapon() {
		this.strength = (int) (Math.random() * 6 + 1);
	}

	public void hitPlayer(Player p) {
		for (int i = 0; i < this.strength; i++) {
			p.damage();
		}
	}
}