import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) throws Exception {
		String answer = JOptionPane.showInputDialog("When is your birthday");
		if (answer.equals("october")) {
			JOptionPane.showMessageDialog(null, "Happy birthday");
		} else {
			JOptionPane.showMessageDialog(null, "Happy unbirthday");
		}
	}
}