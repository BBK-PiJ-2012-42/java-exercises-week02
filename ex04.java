package exercises02;

import java.util.*;

public class ex04 {
    public static void main(String[] args) {


       String inputText;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter some text ");
       inputText = input.nextLine();  
       
       
       //char[] letterText = inputText.toCharArray();
       String[] splitText = inputText.split("/s");
       for(int i = 0; i < splitText.length; i++) {
           System.out.println(splitText[i]);
               
       }
       
       
       
       System.out.println(splitText[0]);
    }
    
     
   
   
}
