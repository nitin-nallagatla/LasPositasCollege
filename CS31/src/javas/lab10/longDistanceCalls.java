package javas.lab10;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class longDistanceCalls extends JFrame {
	
	// Inializes panels, labels, buttons, radio buttons, and groups.
	private JPanel callLength, callTime, calc;
	private JLabel lengthOfCall;
	private JTextField lengthOfCallText;
	private JButton calculate;
	private JRadioButton daytime, evening, night;
	private ButtonGroup selectTime;

	// Inialized for calculations sake.
	private int time;

	public longDistanceCalls() {

		// Creates the output box.
		setTitle("Long Distance Calls");
		setLayout(new GridLayout(3, 1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		buildPanels();

		// Adds necessary objects.
		add(callLength);
		add(callTime);
		add(calc);

		pack();
		setVisible(true);
	}

	private void buildPanels() {

		// Creates textfield.
		lengthOfCall = new JLabel("Length of call (in minutes)");
		lengthOfCallText = new JTextField(10);

		// Creates calculate button.
		calculate = new JButton("Calculate");
		calculate.addActionListener(new CalcButtonListener());

		// Creates radio buttons.
		daytime = new JRadioButton("Daytime (6:00 A.M. through 5:59 P.M.)");
		evening = new JRadioButton("Evening (6:00 P.M. through 11:59 P.M.)");
		night = new JRadioButton("Off-Peak (12:00 A.M. through 5:59 A.M.)");

		// Adds radio buttons to button group.
		selectTime = new ButtonGroup();
		selectTime.add(daytime);
		selectTime.add(evening);
		selectTime.add(night);

		// Adds action listeners.
		daytime.addActionListener(new TimeSelectionListener());
		evening.addActionListener(new TimeSelectionListener());
		night.addActionListener(new TimeSelectionListener());

		// Adds all other panels. 
		callLength = new JPanel();
		callTime = new JPanel();
		calc = new JPanel();

		callLength.add(lengthOfCall);
		callLength.add(lengthOfCallText);
		callTime.add(daytime);
		callTime.add(evening);
		callTime.add(night);
		calc.add(calculate);
	}

	private class CalcButtonListener implements ActionListener {

		// Calls LONGDISTANCECALL method in order to create textbox with the correct output. 
		public void actionPerformed(ActionEvent e) {

			LONGDISTANCECALL longDistanceCall = new LONGDISTANCECALL();

			longDistanceCall.setMinutes(Integer.parseInt(lengthOfCallText.getText()));

			DecimalFormat dollar = new DecimalFormat("#.##");

			JOptionPane.showMessageDialog(null,
					"The cost of the call is $" + Double.valueOf(dollar.format(longDistanceCall.getCost(time))));
		}
	}

	private class TimeSelectionListener implements ActionListener {

		// Sets time variable for calculation.
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == daytime) {
				time = 1;
			}

			else if (e.getSource() == evening) {
				time = 2;
			}

			else if (e.getSource() == night) {
				time = 3;
			}
		}
	}

	public static void main(String[] args) {
		// Main method to run program.
		longDistanceCalls longDistanceCall = new longDistanceCalls();
	}

}