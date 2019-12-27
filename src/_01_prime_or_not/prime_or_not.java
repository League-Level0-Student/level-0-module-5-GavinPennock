package _01_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {
public static void main(String[] args) {
	String number=JOptionPane.showInputDialog(null, "pick a number. any number!");
	int num=Integer.parseInt(number);
	if(num % 2 ==1) {
		JOptionPane.showMessageDialog(null, "your number is odd");
	}else {
		JOptionPane.showMessageDialog(null, "your number is prime");
	}
}
}
