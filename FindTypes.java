package week3.day1;

public class FindTypes {

	public static void main(String[] args) {
		
		String test="$$ Welcome to 2nd Class of Automation $$";
		int letter=0,space=0,num=0,specialChar=0;
		char ch[]=new char[test.length()];
		ch=test.toCharArray();
		for(int i=0;i<test.length();i++)
		{
			if(Character.isLetter(ch[i]))
			{
				letter++;
			}
			else if(Character.isDigit(ch[i]))
			{
				num++;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				space++;
			}
			else if(!Character.isDigit(ch[i]) && !Character.isLetter(ch[i]) && !Character.isSpaceChar(ch[i]))
			{
				specialChar++;
			}
		}
		
		System.out.println("Number of Letters= "+letter);
		System.out.println("Number of Digits= "+num);
		System.out.println("Number of Spaces= "+space);
		System.out.println("Number of Special Characters= "+specialChar);
		
	}

}
