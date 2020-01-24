
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
	for(int i=0;i<555;i++) {
		if(i%2==1) {
			System.out.println(i+" is odd");
		}else {
			System.out.println(i+" is even");
		}
	}
	for(int i=0;i<777;i++) {
		if(i%7==0) {
			System.out.println(i);
		}
	}
	for(int i=0;i<12;i++) {
		
			System.out.println("in "+ (2007+ i) +" i was "+i+" years old");
			
	}
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
				System.out.println(i+" "+j);
	}		
}
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(i*3+j+1);
			
			
	}
		System.out.println(" ");
}	
	for(int i=0;i<10;i++) {
		for(int j=0;j<10;j++) {
			System.out.print(i*10+j+1+" ");
			
			
	}
		System.out.println(" ");
}
	for(int i=0;i<7;i++) {
		for(int j=0;j<i;j++) {
			System.out.print("*");
			
			
	}
		System.out.println();
}
}
}