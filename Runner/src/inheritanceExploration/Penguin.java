package inheritanceExploration;

public class Penguin extends Bird {
	public void fly() {
		System.out.println("Uh Oh! Penguins can't fly.");
		isHappy = false;
	}

	public void swim() {
		System.out.println("The penguin swims.");
		isHappy = true;
	}

	public void doStuff() {
		super.doStuff();
		swim();
	}
}