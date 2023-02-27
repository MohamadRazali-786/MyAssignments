package week5.day2;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String Val=Scan.nextLine();
		String name="Mohamad Razali";
		char[] reverse = name.toCharArray();
		for(int i=reverse.length-1; i>=0; i--) {
			System.out.println(reverse[i]);
		}
	}

}