package javas.Lab7;

import java.util.Random;

public class Die {

	// Initializes variables and number of sides.
	private int MAX = 6;

	private int Sides;

	private int value;

	// Calls appropriate methods.
	public Die() {

		getSides();

		setSides(6);

		getValue();

		setValue(6);

		roll();

	}

	// Getters and setters for number of sides.
	public int getSides() {

		return Sides;

	}

	public void setSides(int sides) {

		Sides = sides;

	}

	// Getters and setters for the value.
	public int getValue() {

		return value;

	}

	public void setValue(int value) {

		this.value = value;

	}

	// Rolls the dice and returns random number.
	public int roll() {

		int r;

		r = (int) (MAX * Math.random() + 1);

		return r;

	}

}
