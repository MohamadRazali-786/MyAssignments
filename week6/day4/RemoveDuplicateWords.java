package week6.day4;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		String[] split=text.split(" ");
		Set<String> words=new TreeSet<String>();
		for(int i=0;i<split.length;i++) {
			words.add(split[i]);
		}
		System.out.println(words);

	}

}
