import java.util.Scanner;

/**
 * Grid.java - Represents a 2D array of cells as a grid for TextArt. Referenced from Dr. Chase's Minesweeper 
 * Example.
 *
 * @author Justin Watts
 * @version 2/14/2015
 */
public class Grid
{
    //attributes to represent the number of columns and the number of rows
    private int columns;
    private int rows;

    //attribute to represent the 2-D array of cells
    private Cell[][] grid; 
    
    /**
     * Constructor for the Grid class.  Establishes the 
     * 2-d array of cells
     */
    public Grid(int i, int j)
    {
        this.rows = i;
        this.columns = j;
        grid = new Cell[rows][columns];
        for (int x = 0; x < rows; x++) 
        {
            for (int y = 0; y < columns; y++) 
            {
                    grid[x][y] = new Cell();                
            }
        }
    }
    
    /**
     * Changes the character in a specified location on the grid
     * @param x and y are integers which specify the cell of the grid to change
     */
    public void change(int x, int y)
    {
        Scanner scan = new Scanner(System.in);
        boolean done = false;
        char newCharacter;
        
        do
        {
            System.out.println("\nEnter a valid character");
            newCharacter = scan.next().charAt(0);
            
            if (newCharacter == '-' || newCharacter == '+' || newCharacter == 'V' || newCharacter == '^' ||
                newCharacter == '/' || newCharacter == '\\' || newCharacter == '|')
                done = true;
        }
        while (!(done));
        
        grid[x][y].setCell(newCharacter);
    }
    
    /**
     * Changes every instance of one character on the grid to another specified character
     */
    public void changeAll()
    {
        Scanner scan = new Scanner(System.in);
        boolean done = false;
        char currentChar, newCharacter;
        do{
            System.out.println("\nEnter the character you wish to change");
            currentChar = scan.next().charAt(0);
            
            if (currentChar == '-' || currentChar == '+' || currentChar == 'V' || currentChar == '^' ||
                currentChar == '/' || currentChar == '\\' || currentChar == '|')
                done = true;
        }
        while (!(done));
        
        done = false;
        do{
            System.out.println("\nEnter a valid replacement character");
            newCharacter = scan.next().charAt(0);
            
            if (newCharacter == '-' || newCharacter == '+' || newCharacter == 'V' || newCharacter == '^' ||
                newCharacter == '/' || newCharacter == '\\' || newCharacter == '|')
                done = true;
        }
        while (!(done));
        
        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[row].length; col++)
            {    
                if (currentChar == grid[row][col].getCell())
                    grid[row][col].setCell(newCharacter);
            }
        }
    }
    
    /**
     * Counts the instances of a specific character within the grid
     * @return integer representing the number of times a character appears in the grid
     */
    public int countChar()
    {
        Scanner scan = new Scanner(System.in);
        boolean done = false;
        char character;
        int count = 0;
        
        do
        {
            System.out.println("\nEnter a valid character");
            character = scan.next().charAt(0);
            
            if (character == '-' || character == '+' || character == 'V' || character == '^' ||
                character == '/' || character == '\\' || character == '|')
                done = true;
        }
        while (!(done));
        
        for (int row = 0; row < grid.length; row++)
        {
            for (int col = 0; col < grid[row].length; col++)
            {
                if (character == grid[row][col].getCell())
                    count++;
            }
        }
        
        return count;
    }

    /**
     * Returns a string representation of this grid
     *
     * @return string representation of this grid
     */
    public String toString()
    {
        String result = "";
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
                result = result + grid[i][j].toString();
            result = result + "\n";
        }
        return result;  
    }   
}