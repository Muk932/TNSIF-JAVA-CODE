package Multithreading;

public class ChildDemo {

	public static void main(String[] args) {
		
		ChildThreds c=new ChildThreds(10, "Hello");
		ChildThreds c1=new ChildThreds(5, "TNSIF");
		
		c.start();
		c1.start();
		System.out.println("End of the Program");

	}

}