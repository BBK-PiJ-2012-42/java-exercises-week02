package exercises02;

import java.util.*;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price, amount, change;
        boolean givenChange = false;
        int pennies = 0;
        int fiftyPound = 0, twentyPound = 0, tenPound = 0, fivePound = 0;
        int onePound = 0, fiftyPence = 0, twentyPence = 0 , tenPence = 0, fivePence = 0, tuppence = 0, penny = 0;
        System.out.println("Cost: ");        
        price = input.nextDouble();
        System.out.println("Amount to pay: ");
        amount = input.nextDouble();
        change = amount - price;
        if(change<0) {
            System.out.println("Sorry that's not enough.");
        }else {
            System.out.println("Change is: " + change);
        }
        while(!givenChange) {
            System.out.println(change);
            if(change==0) {
                givenChange = true;
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
                    fivePound = (int) (change / 5);
                    change = change % 5;
                }else if(change>1) {
                    onePound = (int) (change / 1);
                    change = change % 1;
                }
            }else {
                pennies = (int) (change * 100);
                givenChange = true;
            }
        }
        givenChange = false;
        while(!givenChange) {
            if(pennies==0) {
                givenChange = true;
            }else if(pennies>=1) {
                if(pennies>50) {
                    fiftyPence = (int) (pennies / 50);
                    pennies = pennies % 50;
                }else if(pennies>20) {
                    twentyPence = (int) (pennies / 20);
                    pennies = pennies % 20;
                }else if(pennies>10) {
                    tenPence = (int) (pennies / 10);
                    pennies = pennies % 10;
                }else if(pennies>5) {
                    fivePence = (int) (pennies / 5);
                    pennies = pennies % 5;
                }else if(pennies>2) {
                    tuppence = 1;
                    pennies = 0;
                }else if(pennies==1) {
                    penny = 1;
                    pennies = 0;
                }
                
            }else {

            }
        }

        System.out.println(" and here is your change!");
        System.out.println(fiftyPound + " £50s");
        System.out.println(twentyPound + " £20s");
        System.out.println(tenPound + " £10s");
        System.out.println(fivePound + " £5s");
        System.out.println(onePound + " £1s");
        System.out.println(fiftyPence + " 50p");
        System.out.println(twentyPence + " 20p");
        System.out.println(tenPence + " 10p");
        System.out.println(fivePence + " 5p");
        System.out.println(tuppence + " tuppence");
        System.out.println(penny + " penny");
    }
}