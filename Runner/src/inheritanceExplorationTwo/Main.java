package inheritanceExplorationTwo;

public class Main {
	public static void main(String[] args) {
		Player p1 = new Player();
		WeakPlayer noob = new WeakPlayer();
		Weapon sword = new Weapon();
		ObnoxiousSword obnoxiousSword = new ObnoxiousSword();

		while (!p1.checkDeath() || !noob.checkDeath()) {
			obnoxiousSword.hitPlayer(p1);
			obnoxiousSword.hitPlayer(noob);
			if (p1.checkDeath())
				System.out.println("Player is now dead.");
			if (noob.checkDeath())
				System.out.println("WeakPlayer is now dead.");
		}
	}
}