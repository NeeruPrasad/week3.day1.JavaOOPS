package week3.day1;

import org.bouncycastle.util.Arrays;

public class ReverseEvenPlaceWords {

	public static void main(String[] args) {
		String test="I am a software Tester";
		String[] words=test.split(" ");
		String res="";
		for(int i=0;i<words.length;i++)
		{
			if(i%2!=0)
			{
				char ch[]=new char[words[i].length()];
				
				int k=0;
				for(int j=words[i].length()-1;j>=0;j--)
				{
					ch[k]=words[i].charAt(j);
					k++;
					
				}
				String s=String.valueOf(ch);
				res=res.concat(s+" ");
				
			}
			else if(i%2==0)
			{
				res=res.concat(words[i]+" ");
			}
		}
		
		System.out.println("Reverse String= "+res);
		

	}

}
