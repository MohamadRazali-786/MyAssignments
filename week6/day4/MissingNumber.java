package week6.day4;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	public static void main(String[] args) {


	int[] data = {3,2,8,4,6,7,2,3,3,6,7,1,9};
	Set<Integer> values=new TreeSet<Integer>();
	for(int i=0;i<data.length;i++) {
		values.add(data[i]);
	}
	//System.out.println(values);
	Object[] a=values.toArray();
	for(int i=0;i<a.length;i++) {
		int n=(Integer) a[i];
		int j=(Integer) a[i+1];
		if(j==n+1);
		else {
			n++;
			System.out.println(n);
		}
	}
}
}
