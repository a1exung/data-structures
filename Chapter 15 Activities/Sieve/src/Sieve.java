import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;


/**
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();

        

        // Your work goes here
        
        HashSet<Integer> nums = new HashSet<>();
        for (int i = 2; i <= n; i++){
            nums.add(i);
        }
        


        for (int i = 2; i < n / 2; i++){
            Iterator<Integer> it = nums.iterator();

            while (it.hasNext()){
                int num = it.next();
                if (num % i == 0 && num != i){
                    it.remove();
                }
            }
        }
        
        System.out.println(nums);








    }
}
