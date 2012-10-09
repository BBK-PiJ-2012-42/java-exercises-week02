
package exercises02;

import java.util.*;

public class ex06 {
    public static void main(String[] args) {
       String shortText, longText;
       Scanner input = new Scanner(System.in);
       System.out.print("Enter short text: ");
       shortText = input.nextLine();  
       System.out.print("Enter long text: ");
       longText = input.nextLine();  
       
       char[] shortArray = shortText.toCharArray();
       char[] longArray = longText.toCharArray();
       
       int eCount = 0;
       for(int i = 0; i < longText.length; i++) {
          if(letterText[i]=='e') {
              eCount++;
          } 
       }
       
       System.out.println("That's " + eCount + " times the letter e occurs in that text.");
    }
    
}
