import javax.swing.JOptionPane;

public class skillPractice5 {
public static void main(String[] args) {
	 // In a pop-up, ask the user for the city they live in 
String city=JOptionPane.showInputDialog("what city do you live in ");


		// If they answered "San Diego", tell them they live in America's Finest City 
if(city .equals("san diego")) {
	JOptionPane.showMessageDialog(null, "you live in americasas finest city");
}else {
	JOptionPane.showMessageDialog(null, "move to san diego");
}


		// Otherwise, tell them to move to San Diego 



		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
int cars=2;
String car=JOptionPane.showInputDialog("h0w MaNy CaRs Do YoU hAvE");
int carsAmount=Integer.parseInt(car);
if(carsAmount==0) {
	JOptionPane.showMessageDialog(null, "you use public transportation");
}
		// If there is 1 car, use a pop-up to display the make/model of the car 
if(carsAmount==1) {
	JOptionPane.showMessageDialog(null, "nice bughati chiron");
}


		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 
if(carsAmount>1) {
	JOptionPane.showMessageDialog(null, carsAmount*4);
}


		

		// In a pop-up, ask the user for the name of their school 
String school=JOptionPane.showInputDialog("what is your schools name");


		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 
JOptionPane.showMessageDialog(null, school+"is a fantastic ");
}
}
