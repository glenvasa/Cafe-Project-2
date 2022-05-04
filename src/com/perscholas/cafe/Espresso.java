package com.perscholas.cafe;

public class Espresso extends Product {
	boolean extraShot;
	boolean macchiato;

	Espresso(String name, double price, String description, boolean extraShot, boolean macchiato) {
		super(name, price, description);
		this.extraShot = extraShot;
		this.macchiato = macchiato;
	}

	Espresso() {
		super("Regular Espresso", 3.80, "Basic but good");
		this.extraShot = false;
		this.macchiato = false;
	}

	public boolean isExtraShot() {
		return extraShot;
	}

	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}

	public boolean isMacchiato() {
		return macchiato;
	}

	public void setMacchiato(boolean macchiato) {
		this.macchiato = macchiato;
	}

	@Override
	double calculateProductSubtotal(int quantity) {
		double extras = 0;
		if (extraShot)
			extras += 2.00;
		if (macchiato)
			extras += 1.00;
		return quantity * price + extras;
	}

}
