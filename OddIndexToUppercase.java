package week3.day1;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		String s="changeme";
		char ch[]=new char[s.length()];
		ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(i%2!=0)
			{
				ch[i]=Character.toUpperCase(ch[i]);
				
			}
		}
		System.out.println(ch);

	}

}
