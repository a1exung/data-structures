import java.util.Scanner;
import java.util.*;
/**
 * A program to add, remove, modify or print
 * student names and grades.
*/
public class Gradebook
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Map<String, String> gradebook = new TreeMap<>();

        boolean done = false;
        while(!done)
        {
            System.out.println("A)dd R)emove M)odify P)rint Q)uit");
            String input = in.next().toUpperCase();

            in.nextLine();
            if (input.equals("Q"))
            {
                done = true;
            } else if (input.equals("A"))
            {
                System.out.println("Enter the students name: ");
                String name = in.nextLine();
                System.out.println("Enter the students grade: ");
                String grade = in.nextLine();
                
                gradebook.put(name, grade);

            } else if (input.equals("R"))
            {
                System.out.println("Enter the students name: ");
                String name = in.nextLine();
                gradebook.remove(name);

            } else if (input.equals("M"))
            {
                System.out.println("Enter the students name: ");
                String name = in.nextLine();
                System.out.println("Enter the students grade: ");
                String grade = in.nextLine();
                
                gradebook.put(name, grade);
            } else if (input.equalsIgnoreCase("P"))
            {
                for (String key : gradebook.keySet()){
                    System.out.println(key + ": " + gradebook.get(key));
                }
            } else
            {
                done = true;
            }
        }
    }
}
