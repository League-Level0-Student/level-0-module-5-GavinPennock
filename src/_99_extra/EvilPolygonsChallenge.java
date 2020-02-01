package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
Robot rob= new Robot();
		//2. Set the speed to 100
rob.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"red","green", "blue"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice==0) {
			rob.setPenColor(1000,0,0);
		}
		if(colorChoice==1) {
			rob.setPenColor(0,1000,0);
		}
		if(colorChoice==2) {
			rob.setPenColor(0,0,1000);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String polygons=JOptionPane.showInputDialog("how many polygons do you want?");
		int polo=Integer.parseInt(polygons);
		//5. Use the robot to draw the number of polygons the user requested.
		for(int i=polo;i>0;i--) {
			rob.penDown();
			rob.move(100);
			rob.turn(110);
			rob.move(50);
			rob.turn(70);
			rob.move(100);
			rob.turn(110);
			rob.move(50);
			rob.turn(70);
			rob.penUp();
			rob.move(150);
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

