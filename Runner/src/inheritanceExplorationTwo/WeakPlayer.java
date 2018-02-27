package inheritanceExplorationTwo;

public class WeakPlayer extends Player {
	public void damage() {
		super.health -= 2;
	}
}