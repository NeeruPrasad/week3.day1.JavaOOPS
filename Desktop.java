package org.system;

public class Desktop extends Computer {
	
	public void desktopSize()
	{
		System.out.println("Desktop Size is 26cm");
	}

	public static void main(String[] args) {
		
		Desktop obj=new Desktop();
		obj.computerModel();
		obj.desktopSize();
		
	}

}