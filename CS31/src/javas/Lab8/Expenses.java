package javas.Lab8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class Expenses extends JFrame {

	private static final long serialVersionUID = 1L;

	// Initializes panel, all labels, all text fields, and button.
	JPanel panel = new JPanel();

	private JLabel numberOfDaysLabel;
	private JLabel amountAirfareLabel;
	private JLabel amontRentalFeeLabel;
	private JLabel numberMilesLabel;
	private JLabel parkingFeeLabel;
	private JLabel taxiFeeLabel;
	private JLabel seminarFeeLabel;
	private JLabel lodgingFeeLabel;

	private JTextField daysField;
	private JTextField amountAirfareField;
	private JTextField rentalFeeField;
	private JTextField milesDrivenField;
	private JTextField parkingFeeField;
	private JTextField taxiFeeField;
	private JTextField seminarFeeField;
	private JTextField lodgingFeeField;
	private JButton calculateButton;

	public Expenses() {
		
		// Builds display.
		setTitle("Travel Expenses: ");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);

	}

	private void buildPanel() {
		// Prints out text for each label and creates matching text field.
		numberOfDaysLabel = new JLabel("Number of days on the trip: ");
		daysField = new JTextField(10);
		
		amountAirfareLabel = new JLabel("Airfare: ");
		amountAirfareField = new JTextField(10);
		
		amontRentalFeeLabel = new JLabel("Car Rental fees: ");
		rentalFeeField = new JTextField(10);
		
		numberMilesLabel = new JLabel("Miles driven: ");
		milesDrivenField = new JTextField(10);
		
		parkingFeeLabel = new JLabel("Parking Fees: ");
		parkingFeeField = new JTextField(10);
		
		taxiFeeLabel = new JLabel("Taxi Charges: ");
		taxiFeeField = new JTextField(10);
		
		seminarFeeLabel = new JLabel("Seminar/Conference registration fees: ");
		seminarFeeField = new JTextField(10);
		
		lodgingFeeLabel = new JLabel("Lodging charges, per night: ");
		lodgingFeeField = new JTextField(10);
		
		// Adds calculate button that calls the listener.
		calculateButton = new JButton("Calculate");
		calculateButton.addActionListener(new buttonListener());

		// Creates grid and adds all labels and buttons.
		panel = new JPanel(new GridLayout(9, 2, 5, 10));
		panel.add(numberOfDaysLabel);
		panel.add(daysField);
		panel.add(amountAirfareLabel);
		panel.add(amountAirfareField);
		panel.add(amontRentalFeeLabel);
		panel.add(rentalFeeField);
		panel.add(numberMilesLabel);
		panel.add(milesDrivenField);
		panel.add(parkingFeeLabel);
		panel.add(parkingFeeField);
		panel.add(taxiFeeLabel);
		panel.add(taxiFeeField);
		panel.add(seminarFeeLabel);
		panel.add(seminarFeeField);
		panel.add(lodgingFeeLabel);
		panel.add(lodgingFeeField);
		panel.add(calculateButton);

	}

	public class buttonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			// Intializes string and double variables to get input from text fields.
			String stringDay, stringAirfare, stringCarRental, stringMilesDriven, stringParkingFee, stringTaxiCharges,
					stringSeminarFee, stringLodgingFee;

			double totalAllowed, totalOwe, totalSaved, totalExpenses, numberDays, AirFare, CarRental, MilesDriven,
					ParkingFee, TaxiCharges, seminarFee, lodgingFee;

			// Intializes company variables.
			final double dayMeal = 37.00;
			final double parkingFee = 10.00;
			final double taxiFee = 20.00;
			final double lodgingCharge = 95.00;
			final double rentCar = 0.27;
			double totalRent;

			// Fills variables using String variables to get content from text fields, and converts to double. 
			stringDay = daysField.getText();
			numberDays = Double.parseDouble(stringDay);

			stringAirfare = amountAirfareField.getText();
			AirFare = Double.parseDouble(stringAirfare);

			stringCarRental = rentalFeeField.getText();
			CarRental = Double.parseDouble(stringCarRental);

			stringMilesDriven = milesDrivenField.getText();
			MilesDriven = Double.parseDouble(stringMilesDriven);

			stringParkingFee = parkingFeeField.getText();
			ParkingFee = Double.parseDouble(stringParkingFee);

			stringTaxiCharges = taxiFeeField.getText();
			TaxiCharges = Double.parseDouble(stringTaxiCharges);

			stringSeminarFee = seminarFeeField.getText();
			seminarFee = Double.parseDouble(stringSeminarFee);

			stringLodgingFee = lodgingFeeField.getText();
			lodgingFee = Double.parseDouble(stringLodgingFee);

			// Calculates total rent.
			totalRent = MilesDriven * rentCar;

			// Initalizes the expenses as well as company given money.
			totalExpenses = AirFare + totalRent + numberDays * (ParkingFee + TaxiCharges + lodgingFee)
					+ seminarFee;
			totalAllowed = numberDays * (dayMeal + parkingFee + taxiFee + lodgingCharge) + totalRent;

			// Sets total owed or total saved as necessary.
			if (totalExpenses > totalAllowed)
				totalOwe = totalExpenses - totalAllowed;
			else
				totalOwe = 0;

			if (totalAllowed > totalExpenses)
				totalSaved = totalAllowed - totalExpenses;
			else
				totalSaved = 0;

			// Prints output.
			System.out.println("The total expenses for the trip are $" + totalExpenses
					+ ".\nThe total allowed to spend is $" + totalAllowed + "\nThe total you owe is $" + totalOwe
					+ ".\nTotal saved is $" + totalSaved);

		}

	}

	public static void main(String[] args) {
		new Expenses();
	}
}