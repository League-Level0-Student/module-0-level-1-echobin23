import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer = JOptionPane.showInputDialog("What tastes better than it's smell");

		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (answer.equals("tongue")) {
			JOptionPane.showMessageDialog(null, "correct!");
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "wrong! the answer is your tonugue");
		}
		// 6. Add some more riddles
		String pop = JOptionPane.showInputDialog("What two things can you never eat for breakfest");
		if (pop.equals("lunch and dinner")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong it is lunch and dinner");
		}
		// 2. Make a pop up to show the score.

	}
}
