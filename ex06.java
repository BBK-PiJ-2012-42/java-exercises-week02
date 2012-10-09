
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
       
       int matchCount = 0;
       int matchl = 0;
       for(int i = 0; i < longArray.length; i++) {
           if(longArray[i]==shortArray[0]) {

                boolean match = true;
                int j = 0;
                while(match && j <= shortArray.length) {
                    System.out.println("DEBUG inner i:" + i + " j:" + j);
                    if( (i+shortArray.length) < (longArray.length-j) ) {
                         if( shortArray[j] != longArray[i+j] ) {
                             System.out.println("DEBUG no match!");
                             match = false;
                         }else if(j == shortArray.length && match) {
                             System.out.println("DEBUG that's a match!");
                             matchCount++;
                         }
                    }
                    j++;
                }  
           }

       }
       
       System.out.println("That's " + matchCount +
               " times the shorter text occurs in the longer text.");
    }
    
}
