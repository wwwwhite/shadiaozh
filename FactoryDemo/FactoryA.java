package FactoryDemo;

public class FactoryA extends Factory {
	public Fruit CreateFruit() {
		return new Apple();
	}

}
