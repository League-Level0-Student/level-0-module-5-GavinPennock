import javax.swing.JOptionPane;

public class skllPractice {
public static void main(String[] args) {
	String dimes=JOptionPane.showInputDialog(null, "hopw many dimes do you have?");
	int cents=Integer.parseInt(dimes);
	JOptionPane.showMessageDialog(null, "you have "+cents*10+" cents");
	String tall=JOptionPane.showInputDialog(null, "how tall are you(feet)");
	int height=Integer.parseInt(tall);
	if(height <36) {
		JOptionPane.showMessageDialog(null, "");
	}
}
}
