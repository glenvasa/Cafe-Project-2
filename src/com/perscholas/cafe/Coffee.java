package com.perscholas.cafe;

public class Coffee extends Product {

	private boolean sugar;
	private boolean milk;

	Coffee(String name, double price, String description, boolean sugar, boolean milk) {
		super(name, price, description);
		this.sugar = sugar;
		this.milk = milk;
	}

	Coffee() {
		super("Regular Coffee", 2.70, "Basic but good");
		this.sugar = false;
		this.milk = false;
	}

	public boolean isSugar() {
		return sugar;
	}

	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}

	public boolean isMilk() {
		return milk;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	@Override
	double calculateProductSubtotal(int quantity) {
		return quantity * price;
	}

}
