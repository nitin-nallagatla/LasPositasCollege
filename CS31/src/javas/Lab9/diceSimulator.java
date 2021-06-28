package javas.Lab9;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;

public class diceSimulator extends JFrame {

	// Initializes the panel aspects.
	JPanel panel = new JPanel();
	private JPanel imagePanel1;
	private JPanel imagePanel2;
	private JLabel imageLabel1;
	private JLabel imageLabel2;
	private JPanel buttonPanel;
	private JButton button;

	public diceSimulator() {

		// Builds panel and sets layout.
		setTitle("Dice Simulator: ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		buildImagePanel();
		buildButtonPanel();

		add(imagePanel1, BorderLayout.WEST);
		add(imagePanel2, BorderLayout.EAST);
		add(buttonPanel, BorderLayout.SOUTH);

		pack();
		setVisible(true);
	}

	private void buildImagePanel() {
		// Initializes both image panels with overlapping buttons.
		imagePanel1 = new JPanel();
		imagePanel2 = new JPanel();

		imageLabel1 = new JLabel("Roll the dice to get a random number.");
		imageLabel2 = new JLabel();

		imagePanel1.add(imageLabel1);
		imagePanel2.add(imageLabel2);
	}

	private void buildButtonPanel() {

		// Initiializes the two dice.
		ImageIcon dice1;
		ImageIcon dice2;

		// Creates a button panel, and assigns the two dice their base image pngs.
		buttonPanel = new JPanel();

		dice1 = new ImageIcon("Die1.png");
		dice2 = new ImageIcon("Die2.png");

		// Names button and calls button listener.
		button = new JButton("Roll the Dice");
		button.setIcon(dice1);
		button.addActionListener(new buttonListener());

		buttonPanel.add(button);

	}

	public class buttonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// Randomly generates the die face numbers.
			int dieFace1 = (int) (Math.random() * 6);
			int dieFace2 = (int) (Math.random() * 6);

			// Initializes the two dice with default values.
			ImageIcon dieChosen = new ImageIcon("C:\\Users\\Nitin\\OneDrive\\Desktop\\DiceFaces\\Die1.png");
			ImageIcon dieChosen1 = new ImageIcon("C:\\Users\\Nitin\\OneDrive\\Desktop\\DiceFaces\\Die1.png");

			// Assigns die 1 its face image.
			if (dieFace1 == 1) {
				dieChosen = new ImageIcon("C:\\Users\\Nitin\\OneDrive\\Desktop\\DiceFaces\\Die1.png");
			} else if (dieFace1 == 2) {
				dieChosen = new ImageIcon("C:\\Users\\Nitin\\OneDrive\\Desktop\\DiceFaces\\Die2.png");
			} else if (dieFace1 == 3) {
				dieChosen = new ImageIcon("C:\\Users\\Nitin\\OneDrive\\Desktop\\DiceFaces\\Die3.png");
			} else if (dieFace1 == 4) {
				dieChosen = new ImageIcon("C:\\Users\\Nitin\\OneDrive\\Desktop\\DiceFaces\\Die4.png");
			} else if (dieFace1 == 5) {
				dieChosen = new ImageIcon("C:\\Users\\Nitin\\OneDrive\\Desktop\\DiceFaces\\Die5.png");
			} else if (dieFace1 == 6) {
				dieChosen = new ImageIcon("C:\\Users\\Nitin\\OneDrive\\Desktop\\DiceFaces\\Die6.png");
			}

			// Assigns dice2 its face image.
			if (dieFace2 == 1) {
				dieChosen1 = new ImageIcon("C:\\Users\\Nitin\\OneDrive\\Desktop\\DiceFaces\\Die1.png");
			} else if (dieFace2 == 2) {
				dieChosen1 = new ImageIcon("C:\\Users\\Nitin\\OneDrive\\Desktop\\DiceFaces\\Die2.png");
			} else if (dieFace2 == 3) {
				dieChosen1 = new ImageIcon("C:\\Users\\Nitin\\OneDrive\\Desktop\\DiceFaces\\Die3.png");
			} else if (dieFace2 == 4) {
				dieChosen1 = new ImageIcon("C:\\Users\\Nitin\\OneDrive\\Desktop\\DiceFaces\\Die4.png");
			} else if (dieFace2 == 5) {
				dieChosen1 = new ImageIcon("C:\\Users\\Nitin\\OneDrive\\Desktop\\DiceFaces\\Die5.png");
			} else if (dieFace2 == 6) {
				dieChosen1 = new ImageIcon("C:\\Users\\Nitin\\OneDrive\\Desktop\\DiceFaces\\Die6.png");
			}

			// Displays the dice/
			imageLabel1.setIcon(dieChosen);
			imageLabel2.setIcon(dieChosen1);

			// Gets rid of text.
			imageLabel1.setText(null);
			imageLabel2.setText(null);

			// Pack frame for new size.
			pack();
		}

	}

	public static void main(String[] args) {
		diceSimulator test = new diceSimulator();
	}

}
