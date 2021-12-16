package week3.day1;

public class ReplaceCharInString {

	public static void main(String[] args) {
		
		
		String sentence="I am working with Java8";
			
		sentence=sentence.replaceAll("8", "11");
		char[] ch=new char[sentence.length()];
		

		for(int i=0;i<sentence.length();i++)
		{
			ch[i]=sentence.charAt(i);
		}
	
		
		/*for(int i=5;i<sentence.length();i++)
		{
			System.out.print(ch[i]);
		}*/
		//(or)
		System.out.println("Substring is from index 5 to 11 "+sentence.substring(5, sentence.length()));
	
		System.out.println("\n"+sentence);
		
		
	}

}
