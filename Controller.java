import java.util.Scanner;

/**
 * Controller.java - Manages an instance of TextArt. Referenced from Dr. Chase's Minesweeper Example.
 * 
 * @author Justin Watts
 * @version 2/14/2015
 */
public class Controller
{   
    /**
     * The start method handles the loop of an instance of TextArt
     */
    public void start() throws java.lang.InterruptedException
    {       
        Scanner scan = new Scanner(System.in);
        
        //create an instance of the View class
        View view = new View();
        
        //get the number of rows and columns from the view
        int r = view.getRows();
        int c = view.getCols();
        
        //create an instance of the Grid class
        Grid grid = new Grid(r, c);
        
        boolean done = false;
        int row, col;
        String input = "";
        int count = 0;
        
        System.out.println("\nWelcome to TextArt! Available Characters Include -, +, V, ^, /, \\, and |");
        
        //TextArt instance loop runs until user exits program
        while (!(done))
        {
            System.out.println(grid);
            System.out.println("Input one of the following options:");
            System.out.println("Change - change one character \nChangeAll - change all characters"
                + "\nCount - counts instances of one character \nQuit - exit program\n");
            
            input = scan.next();
            
            //Set of menu options for the user
            if (input.equals("Change") || input.equals("change"))
            {
                row = view.getRow(r);
                col = view.getCol(c);
                grid.change(row, col);
            }
            else if (input.equals("ChangeAll") || input.equals("changeall") || input.equals("changeAll")
                || input.equals("Changeall"))
            {
                grid.changeAll();
            }
            else if (input.equals("Count") || input.equals("count"))
            {
                count = grid.countChar();
                
                if (count == 1)
                    System.out.println("There is " + count + " instance of this character");
                else
                    System.out.println("There are " + count + " instances of this character");
            }
            else if (input.equals("Quit") || input.equals("quit"))
            {
                done = true;
            }
            else
            {
                System.out.println("Input not recognized. Please enter a valid option.");
            }
        }
    }       
}