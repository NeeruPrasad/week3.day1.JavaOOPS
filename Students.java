package week3.day1;

public class Students {
	
	public void getStudentInfo(int studID)
	{
		System.out.println("Student ID is "+studID);
	}
	
	public void getStudentInfo(int studID,String studName)
	{
		System.out.println("Student ID is "+studID);
		System.out.println("Student name is "+studName);
		
	}
	
	public void getStudentInfo(String emailID,int studPhno)
	{
		System.out.println("Student Email ID is "+emailID);
		System.out.println("Student Phone Number is "+studPhno);
	}
	public static void main(String[] args) {
		
		Students obj=new Students();
		obj.getStudentInfo(7178);
		obj.getStudentInfo(7178,"Neeraja");
		obj.getStudentInfo("neeraja.korra@gmail.com",93209880);

	}

}
