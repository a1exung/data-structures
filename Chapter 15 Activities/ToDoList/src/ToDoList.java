import java.util.*;
/**
 * Implement a to do list. Tasks have a priority between 
 * 1 and 9 (with 1 being most urgent), and a description.
 * When the user enters the command 'add priority description', 
 * the program adds a new task. When the user enters next, 
 * the program removes and prints the most urgent task. 
 * The quit command quits the program. 
 * Use a priority queue in your solution.
*/
public class ToDoList
{
    // Instance variable(s)
    Queue<Task> list;

    /**
     * Constructor
    */
    public ToDoList()
    {
        // Complete this
        list = new PriorityQueue<>();
    }

    /**
     * Display a menu and accepts commands.
     */
    public void run()
    {
        String option = "";
        System.out.println("To Do List - Please enter an option");
        System.out.println("     add priority description (add a new task)");
        System.out.println("     next (remove and print most urgent task)");
        System.out.println("     quit (exit this program)");
        System.out.println();
        
        Scanner in = new Scanner(System.in);
        
        do
        {
            System.out.print("> ");
            option = in.nextLine();
            if (option.startsWith("add"))
            {
                addTask(option);
            } else if (option.equals("next"))
            {
                nextTask();
            }
        } 
        while (! option.equals("quit"));
    }
    
    /**
     * Parse the add option line.
     *
     * @param optionStr the option line
    */
    public void addTask(String optionStr)
    {
        // Complete this method
        if(optionStr.substring(optionStr.indexOf(" ")+1,optionStr.indexOf(" ")+2).equals("1") || 
            optionStr.substring(optionStr.indexOf(" ")+1,optionStr.indexOf(" ")+2).equals("2") || 
            optionStr.substring(optionStr.indexOf(" ")+1,optionStr.indexOf(" ")+2).equals("3") || 
            optionStr.substring(optionStr.indexOf(" ")+1,optionStr.indexOf(" ")+2).equals("4") || 
            optionStr.substring(optionStr.indexOf(" ")+1,optionStr.indexOf(" ")+2).equals("5") || 
            optionStr.substring(optionStr.indexOf(" ")+1,optionStr.indexOf(" ")+2).equals("6") || 
            optionStr.substring(optionStr.indexOf(" ")+1,optionStr.indexOf(" ")+2).equals("7") || 
            optionStr.substring(optionStr.indexOf(" ")+1,optionStr.indexOf(" ")+2).equals("8") || 
            optionStr.substring(optionStr.indexOf(" ")+1,optionStr.indexOf(" ")+2).equals("9"))
        
        list.add(new Task(Integer.valueOf(optionStr.substring(optionStr.indexOf(" ")+1,optionStr.indexOf(" ")+2)), optionStr.substring(optionStr.indexOf(" ")+3)));

        else
            System.out.println("The priority must be an integer between 1 and 9.");
        
            
    }

    /**
     * Get the next highest priority task and
     * display the description to the user.
    */
    public void nextTask()
    {
        Task next = null;
        
        // Complete this method
        if(!list.isEmpty())
            next = list.remove();
        
        if (next == null)
        {
            System.out.println("There are no tasks in the list.");
        } else
        {
            System.out.println(next.getDescription());
        }
    }
}