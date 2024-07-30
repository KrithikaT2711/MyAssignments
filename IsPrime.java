package homeassignment;

public class IsPrime {
	public static void main(String[] args) {
		
		int maxRange=10;
		System.out.println("Prime Numbers ");
		for(int i=0 ; i<=maxRange ; i++) {
				if (i%2==0) {
					System.out.print(i+ " , ");
				}
			/*	else {
					System.out.println("It's not a prime number : "+i);
				}*/
			}
		}
	}


