package javas.lab10;

//Imports needed libraries.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ticTacToe extends JFrame implements ActionListener {



	// Creates panels for button and board.
	JPanel gameBoard = new JPanel();
	JPanel controller = new JPanel();

	// Creates the array. 
	JButton[][] gameButtons = new JButton[3][3];
	JButton newGame = new JButton("New Game");

	// Declare variables for the actual code.
	private static int count = 0;
	private static boolean[][] c = new boolean[3][3];
	private static char[] aMoves = new char[10];
	private static boolean check = true;

	// Constructor creates box.
	public ticTacToe() {

		setTitle("Tic Tac Toe");
		setSize(360, 720);
		getContentPane().setLayout(new GridLayout(2, 1));
		setLocationRelativeTo(null);


		GridLayout grid1 = new GridLayout(3, 3);
		GridLayout grid2 = new GridLayout(1, 3);


		gameBoard.setLayout(grid1);
		controller.setLayout(grid2);

		// Attaches action listeners to each index of the 2d array. 
		for (int i = 0; i < gameButtons.length; i++) {
			for (int j = 0; j < gameButtons[i].length; j++) {
				gameButtons[i][j] = new JButton();
				gameButtons[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
				gameButtons[i][j].addActionListener(this);
			}
		}

		// Initializes all values in the array.
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = true;
			}
		}

		// Adds action listeners.
		newGame.addActionListener(this);

		// Add buttons to panels
		for (int i = 0; i < gameButtons.length; i++) {
			for (int j = 0; j < gameButtons.length; j++) {
				gameBoard.add(gameButtons[i][j]);
			}
		}

		controller.add(newGame);

		// Add panels
		getContentPane().add(gameBoard);
		getContentPane().add(controller);

		
		setVisible(true);

	}

	// Main method
	public static void main(String[] args) {

		// Creates the box.
		new ticTacToe();

	}

	// Action Listener code.
	public void actionPerformed(ActionEvent event) {

		// Game resetter.
		if (newGame == event.getSource()) {

			
			for (int i = 0; i < gameButtons.length; i++) {
				for (int j = 0; j < gameButtons.length; j++) {
					gameButtons[i][j].setText("");
				}
			}

			//Reinitializes array
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c[i].length; j++) {
					c[i][j] = true;
				}
			}

			// Resets moves
			for (int i = 1; i <= 9; i++)
				aMoves[i] = '\u0000';

			// Resets check
			check = true;

			count = 0;

		}

		// Flips array sign when clicked to add x's.
		if (count % 2 == 0) {
			for (int i = 0; i < gameButtons.length; i++) {
				for (int j = 0; j < gameButtons.length; j++) {
					if (gameButtons[i][j] == event.getSource() && c[i][j]) {
						gameButtons[i][j].setText("X");
						c[i][j] = false;
						aMoves[3 * i + j + 1] = 'X';
						count++;
					}
				}
			}
		}

		else if (count % 2 == 1) {

			// Adds O's to array in the same vein as that above.
			for (int i = 0; i < gameButtons.length; i++) {
				for (int j = 0; j < gameButtons.length; j++) {
					JButton button1 = (JButton) event.getSource();
					if (gameButtons[i][j] == button1 && c[i][j]) {
						gameButtons[i][j].setText("O");
						c[i][j] = false;
						aMoves[3 * i + j + 1] = 'O';
						count++;
					}
				}
			}
		}

		// Checks for wins
		if (check) {

			// Checks for X win conditions.
			if (

			// Horizontal
			(aMoves[1] == aMoves[2] && aMoves[1] == aMoves[3] && aMoves[1] == 'X')
					|| (aMoves[4] == aMoves[5] && aMoves[4] == aMoves[6] && aMoves[4] == 'X')
					|| (aMoves[7] == aMoves[8] && aMoves[7] == aMoves[9] && aMoves[7] == 'X') ||

					// Vertical
					(aMoves[1] == aMoves[4] && aMoves[1] == aMoves[7] && aMoves[1] == 'X')
					|| (aMoves[2] == aMoves[5] && aMoves[2] == aMoves[8] && aMoves[2] == 'X')
					|| (aMoves[3] == aMoves[6] && aMoves[3] == aMoves[9] && aMoves[3] == 'X') ||

					// Diagonal
					(aMoves[1] == aMoves[5] && aMoves[1] == aMoves[9] && aMoves[1] == 'X')
					|| (aMoves[3] == aMoves[5] && aMoves[3] == aMoves[7] && aMoves[3] == 'X')) {

				//output
				JOptionPane.showMessageDialog(rootPane,
						new JLabel("<html><div style='text-align: center;'>" + "Congratulations!<br>Player X wins!"
								+ "</div></html>", JLabel.CENTER));
				check = false;

				// Prevents game board from being changed after game.
				for (int i = 0; i < c.length; i++) {
					for (int j = 0; j < c[i].length; j++) {
						c[i][j] = false;
					}
				}
			}

			// Check for O win conditions.
			else if (

			// Horizontal
			(aMoves[1] == aMoves[2] && aMoves[1] == aMoves[3] && aMoves[1] == 'O')
					|| (aMoves[4] == aMoves[5] && aMoves[4] == aMoves[6] && aMoves[4] == 'O')
					|| (aMoves[7] == aMoves[8] && aMoves[7] == aMoves[9] && aMoves[7] == 'O') ||

					// Vertical
					(aMoves[1] == aMoves[4] && aMoves[1] == aMoves[7] && aMoves[1] == 'O')
					|| (aMoves[2] == aMoves[5] && aMoves[2] == aMoves[8] && aMoves[2] == 'O')
					|| (aMoves[3] == aMoves[6] && aMoves[3] == aMoves[9] && aMoves[3] == 'O') ||

					// Diagonal
					(aMoves[1] == aMoves[5] && aMoves[1] == aMoves[9] && aMoves[1] == 'O')
					|| (aMoves[3] == aMoves[5] && aMoves[3] == aMoves[7] && aMoves[3] == 'O')) {

				//output
				JOptionPane.showMessageDialog(rootPane,
						new JLabel("<html><div style='text-align: center;'>" + "Congratulations!<br>Player O wins!"
								+ "</div></html>", JLabel.CENTER));
				check = false;

				// Locks board post game
				for (int i = 0; i < c.length; i++) {
					for (int j = 0; j < c[i].length; j++) {
						c[i][j] = false;
					}
				}
			}

			// Tie scenarios.
			else if ((c[0][0] || c[0][1] || c[0][2] || c[1][0] || c[1][1] || c[1][2] || c[2][0] || c[2][1]
					|| c[2][2]) == false) {

				// Show Message dialog that the game is a tie
				JOptionPane.showMessageDialog(rootPane,
						new JLabel("<html><div style='text-align: center;'>" + "Tie!"
								+ "</div></html>", JLabel.CENTER));
				check = false;

				// Locks board
				for (int i = 0; i < c.length; i++) {
					for (int j = 0; j < c[i].length; j++) {
						c[i][j] = false;
					}
				}

			}
		}
	}

}