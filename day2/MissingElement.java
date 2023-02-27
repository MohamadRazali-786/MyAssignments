package week5.day2;

import java.util.Arrays;

public class MissingElement {
	  public static void main(String[] args) {
		  int[] a={2,5,6,8,9,1,3,4};
		  Arrays.sort(a);
		  for (int i = 0; i< a.length; i++) {
			  if(a[i]!=i+1) {
				 System.out.println(i+1);
				 break;
			  }
		}
		  
	}

}