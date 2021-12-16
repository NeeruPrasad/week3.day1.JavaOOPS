package week3.day1;

public class CompareStrings {

	public static void main(String[] args) {
		
		
		String s1="I am Learning Java";
		String s2="I am learning java";
		if(s1.equals(s2))
		{
			System.out.println("Both strings are equal");
		}
		else if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Ignores case of both strings");
		}
		else
		{
			System.out.println("Both strings are not equal");
		}

	}

}
