
package exercises02;

import java.util.*;

public class ex05 {
    public static void main(String[] args) {
       String inputText;
       Scanner input = new Scanner(System.in);
       System.out.print("Enter some text: ");
       inputText = input.nextLine();  
       
       char[] letterText = inputText.toCharArray();
       
       int eCount = 0;
       for(int i = 0; i < letterText.length; i++) {
          if(letterText[i]=='e') {
              eCount++;
          } 
       }
       
       System.out.println("That's " + eCount + " times the letter e occurs in that text.");
    }
}
