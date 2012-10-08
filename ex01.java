package exercises02;

import java.util.*;

public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstDouble, secondDouble, answer = 010;
        int selection;
        System.out.print("First number please: ");
        firstDouble = input.nextDouble();
        System.out.print("Second number please: ");
        secondDouble = input.nextDouble();
        System.out.println("(1) Addition");
        System.out.println("(2) Subtraction");
        System.out.println("(3) Multiplication");
        System.out.println("(4) Division");
        System.out.print("Select from above: ");
        selection = input.nextInt();
        if(selection==1) { answer = firstDouble + secondDouble; }
        else if(selection==2) { answer = firstDouble - secondDouble; }
        else if(selection==3) { answer = firstDouble * secondDouble; }
        else if(selection==4) { answer = firstDouble / secondDouble; }
        else { System.out.print("Thats not a valid selection."); }
        System.out.print("The answer is: " + answer);
    }
}