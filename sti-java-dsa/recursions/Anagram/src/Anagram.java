/**
 * @(#)Anagram.java
 *
 * Anagram application
 *
 * @author Ariel Magbanua
 * @version 1.00 2014/12/11
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Anagram {

    public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Give a word to anagram: ");
		String word = br.readLine();

		printAnagrams("", word);
    }

    public static void printAnagrams(String prefix, String word){

    	if(word.length() <= 1) {

               System.out.print(prefix + word +" ");

         } else {

             for(int i = 0; i < word.length(); i++) {

                 String cur = word.substring(i, i + 1);
                 String before = word.substring(0, i); // letters before cur
                 String after = word.substring(i + 1); // letters after cur
                 printAnagrams(prefix + cur, before + after);
			 }
         }
    }
}
