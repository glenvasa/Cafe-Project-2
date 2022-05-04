package com.perscholas.cafe;

public class Cappuccino extends Product {

	boolean peppermint;
	boolean whippedCream;

	Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream) {
		super(name, price, description);
		this.peppermint = peppermint;
		this.whippedCream = whippedCream;
	}

	Cappuccino() {
		super("Regular Cappuccino", 4.50, "Basic but good");
		this.peppermint = false;
		this.whippedCream = false;
	}

	public boolean isPeppermint() {
		return peppermint;
	}

	public void setPeppermint(boolean peppermint) {
		this.peppermint = peppermint;
	}

	public boolean isWhippedCream() {
		return whippedCream;
	}

	public void setWhippedCream(boolean whippedCream) {
		this.whippedCream = whippedCream;
	}

	@Override
	double calculateProductSubtotal(int quantity) {
		double extras = 0;
		if (peppermint)
			extras += 2.00;
		if (whippedCream)
			extras += 1.00;
		return price * quantity + extras;
	}

}
