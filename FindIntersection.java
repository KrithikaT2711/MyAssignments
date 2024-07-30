package homeassignment;

import java.util.Arrays;

public class FindIntersection {
	public static void main(String[] args) {
		int[] num1 = {3,2,11,4,6,7};
		int[] num2 = {1,2,8,4,9,7};
		//int length1 = num1.length;
		//int length2 = num2.length;
		Arrays.sort(num1);
		Arrays.sort(num2);
		System.out.println("Duplicates Value");
			for(int i=0 ; i<num1.length ;i++) {
				for(int j=0; j<num2.length ; j++) {
					if(num1[i]==num2[j]) {
						System.out.println(+num1[i]);
					}
				}
			}
	}

}
