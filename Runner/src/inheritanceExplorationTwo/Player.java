package inheritanceExplorationTwo;

public class Player {
	protected int health = 10;

	public boolean checkDeath() {
		if (health < 1)
			return true;
		return false;
	}

	public void damage() {
		this.health--;
	}
}