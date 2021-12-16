package org.student;
import org.department.*;

public class Student extends Department {
	
	public String studentName(String name)
	{
		return name;
		
	}
	public String studentDept(String dept)
	{
		return dept;
	}
	public int studentID(int ID)
	{
		return ID;
	}

	public static void main(String[] args) {
		
		
		Student s=new Student();
		System.out.println("Student ID is "+s.studentID(7178));
		System.out.println("Student Name is"+s.studentName("Neeraja"));
		s.studentDept("Student Department is"+s.studentDept("MCA"));
		s.deptName();
		s.collegeName();
		s.collegeCode();
		
		

	}

}
