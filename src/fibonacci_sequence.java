
public class fibonacci_sequence {
	
public static void main(String[] args) {
	int one=0;
	int two=1;
	System.out.println(one);
	System.out.println(two);
	for(int i=0; i<6;i++) {
	int three=one+two;
	System.out.println(three);
	one=two;
	two=three;
	}
	
}
}
