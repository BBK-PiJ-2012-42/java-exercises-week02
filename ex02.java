package exercises02;

import java.util.*;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstDouble = 0, secondDouble = 0, answer = 0;
        String firstStr = "", secondStr = "", problem;
        int selection = 0, whichNum = 1;
        System.out.print("Enter your operation: ");
        problem = input.nextLine();
        String[] parsedProblem = problem.split("[-+\\/*]");
        char[] charsProb = problem.toCharArray();
        for(int j=0; j>=charsProb.length; j++) {
            if(charsProb[j]!='\u0020') {
                switch (charsProb[j]) {
                    case '+': selection = 1; whichNum = 2;
                    case '-': selection = 2; whichNum = 2;
                    case '*': selection = 3; whichNum = 2;
                    case '/': selection = 4; whichNum = 2;
                }
                if(whichNum==1) {
                    firstStr = firstStr + charsProb[j];
                }else { secondStr = secondStr + charsProb[j]; }

            }
        }

        firstDouble = Double.parseDouble(firstStr);
        secondDouble = Double.parseDouble(secondStr);
        if(selection==1) { answer = firstDouble + secondDouble; }
        else if(selection==2) { answer = firstDouble - secondDouble; }
        else if(selection==3) { answer = firstDouble * secondDouble; }
        else if(selection==4) { answer = firstDouble / secondDouble; }
        else { System.out.print("Thats not a valid selection."); }
        System.out.print("The answer is: " + answer);
    }
}
