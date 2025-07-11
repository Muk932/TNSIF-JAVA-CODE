package FinallyBlock;

public class negativeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public negativeException(String string)
	{
		super (string);
	}
	public negativeException()
	{
		super ("Percentage should not be negative");
	}
	
}