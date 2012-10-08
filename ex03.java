package exercises02;

import java.util.*;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price, amount, change;
        int fiftyPound, twentyPound, tenPound, fivePound;
        int onePound, fiftyPence, twentyPence, tenPence, fivePence, tuppence, penny;
        System.out.println("Cost: ");        
        price = input.nextDouble();
        System.out.println("Amount to pay: ");
        amount = input.nextDouble();
        change = amount - price;
        if(change<0) {
            System.out.println("Sorry that's not enough.");
        }else if(change>=1) {
            if(change>50) {
                fiftyPound = (int) (change / 50);
                change = change % 50;
            }else if(change>20) {
                twentyPound = (int) (change / 20);
                change = change % 20;
            }else if(change>10) {
                tenPound = (int) (change / 10);
                change = change % 10;
            }else if(change>5) {
                
            }
        }else {
            
        }
        
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