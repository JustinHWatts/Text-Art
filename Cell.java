/**
 * Cell.java - Represents a single cell in an instance of TextArt. Referenced from Dr. Chase's Minesweeper 
 * Example.
 *
 * @author Justin Watts
 * @version 2/14/2015
 */
public class Cell
{
	//private attribute to represent current character
	private char visibleChar;
		
	/**
	 * Constructor for the Cell class
	 */
	public Cell()
	{
		this.visibleChar = '-';
	}

	/**
	 * Sets the specified Cell to a different character
	 * @param character which this Cell will be set to
	 */
	public void setCell(char _visibleChar)
	{
	    this.visibleChar = _visibleChar;
	}
	
	/**
	 * Gets the character within this Cell
	 * @return character within this Cell
	 */
	public char getCell()
	{
	    return this.visibleChar;
	}
	
	/**
	 * Returns a string representation of this Cell
	 * @return a string representation of the Cell
	 */
	public String toString()
	{
        return("" + visibleChar);
	}
}