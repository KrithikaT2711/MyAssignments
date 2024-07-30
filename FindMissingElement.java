package homeassignment;

import java.util.Arrays;

public class FindMissingElement {
public static void main(String[] var) {
	// Input ==> {1,4,3,2,8,6,7}
	
	int[] num= {1,4,3,2,8,6,7};
	Arrays.sort(num);
	// num = {1,2,3,4,6,7,8}
	for(int i =0 ; i<=num.length ; i++) {
		if(num[i]!=i+1) {
			System.out.println("Missing number :"+(i+1));
			break;
		}
		
	}
	
	
	
}
}

