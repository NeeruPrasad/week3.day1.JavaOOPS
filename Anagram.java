package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="stops";
		String s2="potss";
		if(s1.length()==s2.length())
		{
			char ch1[]=new char[s1.length()];
			ch1=s1.toCharArray();
			char ch2[]=new char[s2.length()];
			ch2=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			System.out.println(ch1);
			System.out.println(ch2);
			if(Arrays.equals(ch1, ch2))
			{
				System.out.println("Both are Anagram strings");
			}
			
			
		}

	}

}
