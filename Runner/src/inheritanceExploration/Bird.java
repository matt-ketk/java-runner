package inheritanceExploration;

public class Bird extends Animal {
	protected boolean isHappy = false;

	public void layEgg() {
		System.out.println("The bird layed an egg.");
	}

	public void fly() {
		System.out.println("The bird flies.");
		isHappy = true;
	}

	public void swim() {
		System.out.println("Uh Oh! This bird can't swim.");
		isHappy = false;
	}

	public void doStuff() {
		System.out.println("Doing some stuff...");
		fly();
		layEgg();
	}
}