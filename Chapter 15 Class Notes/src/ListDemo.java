import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        /* the addLast method can populate a list. */

        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Tony");
        staff.addLast("Natasha");
        staff.addLast("Peter");
        staff.addLast("Gamora");

        // The list is currently: TNPG

        /*the listIterator method creates a new list iterator that is positioned
         * at the head of the list
         * 
         * The "|" will represent the iterator position in this file */

        ListIterator<String> iterator = staff.listIterator(); // |TNPG

        /* The next method advances the iterator over the next element in the list.
        * Iterators are between elements, not on them
        */
    
        iterator.next(); // T|NPG

        /* the .next method also returrns the element that the iterator is passing. */
        String avenger = iterator.next(); // TN|PG -- avenger will be Natasha
        System.out.println(avenger);
        System.out.println("Expected: Natasha");

        /* The add method inserts an element at the iterator position 
         * The iterator is then positiooned AFTER the element that was added
         */
        iterator.add("Bruce"); // TNB|PG
        iterator.add("Rocket"); // TNBR|PG

        /* The remove method (for iterators) removes the element returned by the last call to next or previous 
         * The remove method can ONLY be called after calling next or previous.
         * The remove method CANNOT be called after calling add. (thus invalid in this situation)
         */

        iterator.next(); // TNBRP|G
        iterator.remove(); // TNBR|G

        System.out.println(staff);
        System.out.println("Expected: [Tony, Natasha, Bruce, Rocket, Gamora]");

        /* The set method (for iterators) updates the element returned by the last call to next or previous
         * Similar to remove can ONLY becalled after next or previous (invalid since last command was remove)
         * NO CHANGE in iterator position
         */
        iterator.previous(); //TNB|RG
        iterator.set("Scott"); //TNB|SG

        System.out.println(staff);
        System.out.println("Expected: [Tony, Natasha, Brucee, Scott, Gamora]");

        /* The hasNext method is used to determine if there is a next node after the iterator 
         * The hasNext is often used in the condition of a while loop.
         */
    }

}
