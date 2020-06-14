package FactoryDemo;

public class FactoryB  extends Factory {
	public Fruit CreateFruit() {
		return new Banana();
	}
}
