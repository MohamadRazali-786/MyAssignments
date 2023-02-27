package week5.day2;

public class FindCharacterOccurance {
        public static void main(String[] args) {
		String a ="Testleaf";
		char[] name=a.toCharArray();
		int count=0;
		for(int i=0;i<name.length;i++) {
			if(name[i]=='e')
				count++;
					}
		System.out.println("e occurance is "+count);
	}

}