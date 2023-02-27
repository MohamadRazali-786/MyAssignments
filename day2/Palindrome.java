package week5.day2;

public class Palindrome {
	public static void main(String[] args) {
	String text="madam";
	String rev="";
	char[] charArray=text.toCharArray();
	for(int i=charArray.length-1; i>=0; i--) {
		rev=rev+charArray[i];
	}

	if(text.equals(rev)) {
		System.out.println("Given string is Palindrome");
	}
	else {
		System.out.println("Given string is not a Palindrome");
	}

  }
	
}
