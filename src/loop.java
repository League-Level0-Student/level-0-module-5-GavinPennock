
public class loop {
public static void main(String[] args) {
	for(int i=0;i<100;i++) {
		System.out.println(i);
	}
	for(int j=100;j<0;j--) {
		System.out.println(j);
	}
	for(int i=0;i<100;i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
	for(int i=0;i<100;i++) {
		if(i%2==1) {
			System.out.println(i);
		}
	}
}
}
