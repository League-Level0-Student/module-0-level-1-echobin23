import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {


	public static void main(String[] args) throws Exception {
String color = JOptionPane.showInputDialog("What is your favoirte color");
JOptionPane.showMessageDialog(null, "Wow! " +color+ " is my favoirte color too");

Robot Bob = new Robot();
if (color.equalsIgnoreCase("red")) {
Bob.setPenColor(255, 0, 0);
}
if (color.equalsIgnoreCase("blue")) {
Bob.setPenColor(0, 0, 255);	
}
Bob.penDown();
Bob.setSpeed(10);
Bob.move(150);
Bob.turn(120);
Bob.move(150);
Bob.turn(120);
Bob.move(150);
}
}
