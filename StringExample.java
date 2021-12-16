package week3.day1;

public class StringExample {

	public static void main(String[] args) {
		String s1="neeru";
		String s2="neeru";
		String str3=new String("Kutty");
		String str4=new String("Kutty");
		
		if(s1==s2)
		{
			System.out.println("Same neeru");
		}
		
		if(str3==str4)
		{
			System.out.println("Same text");
		}
		else
		{
			System.out.println("Diff text");
			
		}
		System.out.println("String literals with same text is placed in string constant pool and points to same memory so they are equal"
				+ " where as Strings created using new() are created as objects with different memory so they are not equal");

	}

}
