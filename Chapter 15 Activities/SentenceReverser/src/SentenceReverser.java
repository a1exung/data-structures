import java.util.Scanner;
import java.util.Stack;

/**
 * Class for reversing the order of a sentence.
*/
public class SentenceReverser
{
    /**
     * Reverses the given sentence.
     *
     * @param sentence Sentence to be reversed.
     * @return reversed sentence.
    */
    public static String reverse(String sentence)
    {

        String finished = "";

    	Scanner scanner = new Scanner(sentence);
    	
        // Complete this method. Use a Stack.\
        Stack<String> words = new Stack<>();

        while(scanner.hasNext()){
            String word = scanner.next().toLowerCase();
            if(word.substring(word.length() - 1).equals(".")){
                words.push(word.substring(0, word.length() - 1));

                finished += words.pop().substring(0, 1).toUpperCase();
                finished += word.substring(1, word.length() - 1);
                finished += " ";

                while (words.size() > 1){
                    finished += words.pop();
                    finished += " ";
                }

                finished += words.pop();
                finished += ". ";


            } else {
                words.push(word);
            }
        
            
        }


        return finished;



    }
}
