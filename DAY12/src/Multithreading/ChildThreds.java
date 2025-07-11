package Multithreading;

public class ChildThreds extends Thread{

	int n;
	String msg;
	
	//para constructor 
	public ChildThreds(int n, String msg) {
	
		this.n = n;
		this.msg = msg;
	}
	
	public void run()
	{
		for(int i=1; i<n; i++)
		{
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.err.println(e.getMessage());
			}
			System.out.println(i + msg);
		}
	}
	
	
	
	

}
