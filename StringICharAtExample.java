package week3.day1;

public class StringICharAtExample {

	public static void main(String[] args) {
		String text="Java Excercise";
		char[] ch=new char[text.length()];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=text.charAt(i);
		}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='E')
			{
				text.charAt(i);
				System.out.println("Index is "+i);
			}
			if(ch[i]=='s')
			{
				text.charAt(i);
				System.out.println("Index is "+i);
			}
		}
	}

}
