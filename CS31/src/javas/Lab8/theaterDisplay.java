package javas.Lab8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javas.Lab8.Expenses.buttonListener;
import java.awt.*;

public class theaterDisplay extends JFrame {

	private static final long serialVersionUID = 1L;

	// Initializes panel, all labels, and all text fields. 
	JPanel p = new JPanel();

	private JLabel adultPrice;
	private JLabel adultNumber;
	private JLabel childPrice;
	private JLabel childNumber;

	private JTextField adultPriceField;
	private JTextField adultNumberField;
	private JTextField childPriceField;
	private JTextField childNumberField;

	// Initializes button and NET value as requested.
	JButton calculateButton;
	final double NET = .2;

	public theaterDisplay() {
		// Builds display.
		setTitle("Theater Revenue: ");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(p);
		setVisible(true);
	}

	public void buildPanel() {
		// Prints out text for each label.
		adultPrice = new JLabel("Price per Adult Ticket: ");
		adultNumber = new JLabel("Number of Adult Tickets sold: ");
		childPrice = new JLabel("Price per Child Ticket: ");
		childNumber = new JLabel("Number of Child Tickets sold: ");

		// Creates text fields.
		adultPriceField = new JTextField(8);
		adultNumberField = new JTextField(8);
		childPriceField = new JTextField(8);
		childNumberField = new JTextField(8);

		// Adds calculate button that calls the listener.
		calculateButton = new JButton("Calculate");
		calculateButton.addActionListener(new buttonListener());

		// Creates grid and adds all labels and buttons.
		p = new JPanel(new GridLayout(9, 2, 5, 10));
		p.add(adultPrice);
		p.add(adultPriceField);
		p.add(childPrice);
		p.add(childPriceField);
		p.add(adultNumber);
		p.add(adultNumberField);
		p.add(childNumber);
		p.add(childNumberField);
		p.add(calculateButton);
	}

	public class buttonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			// Initializes values from text fields.
			String adultPriceString = adultPriceField.getText();
			double adultPriceInput = Double.parseDouble(adultPriceString);

			String adultNumberString = adultNumberField.getText();
			int adultNumberInput = Integer.parseInt(adultNumberString);

			String childPriceString = childPriceField.getText();
			double childPriceInput = Double.parseDouble(childPriceString);

			String childNumberString = childNumberField.getText();
			int childNumberInput = Integer.parseInt(childNumberString);

			// Returns output.
			System.out.println("GROSS REVENUE FOR ADULT TICKETS: $" + (adultPriceInput * adultNumberInput));
			System.out.println("NET REVENUE FOR ADULT TICKETS: $" + (NET * (adultPriceInput * adultNumberInput)));
			System.out.println("GROSS REVENUE FOR CHILD TICKETS: $" + (childPriceInput * childNumberInput));
			System.out.println("NET REVENUE FOR CHILD TICKETS: $" + (NET * (childPriceInput * childNumberInput)));
			System.out.println("TOTAL GROSS REVENUE $" + ((adultPriceInput * adultNumberInput) + (childPriceInput * childNumberInput)));
			System.out.println("TOTAL NET REVENUE: $" +  (NET * ((adultPriceInput * adultNumberInput) + (childPriceInput * childNumberInput))));
		}

	}

	// Main method calls theaterDisplay.
	public static void main(String[] args) {
		theaterDisplay test = new theaterDisplay();
	}

}
