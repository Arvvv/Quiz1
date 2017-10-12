 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author debia7331
 */
public class Quiz {

    public String reverseString(String word) {
        // returns the complete word once it has gone through every letter 
        if (word.length() < 1) {
            // returning 
            return word;

        }
        // variable that takes all the words except for the last letter 
        String firstPart = word.substring(0, word.length() - 1);
        // variable that takes away the last letter 
        String lastLetter = word.substring(word.length() - 1);
        // combining the last letter to the rest of the word 
        return lastLetter + reverseString(firstPart);


    }

    public static void main(String[] args) {
        // testing the method Quiz by reversing the word hello 
        Quiz test = new Quiz();
        // printing out the reversed inputted word 
        System.out.println(test.reverseString("arvind"));
    }
}
