package uc3;

import uc2.EqualityofLines;

import java.util.Scanner;

public class LineGreaterEqualLess {
    public void lineGreatLessEqual() {
        int x1, y1, x2, y2;
        System.out.println("TO FIND GREATER / EQUAL / SMALLER BETWEEN TWO LINES ");
        System.out.println("enter the value of starting and ending points of line one  ");
        Scanner sc = new Scanner(System.in);
        System.out.print("X1 -->");
        x1 = sc.nextInt();
        System.out.print("Y1 -->");
        y1 = sc.nextInt();
        System.out.print("X2 -->");
        x2 = sc.nextInt();
        System.out.print("Y2 -->");
        y2 = sc.nextInt();
        Double d1 =Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("LENGTH OF LINE 1 IS "+d1);
        //Integer dis = (int)d1;
        int a1, b1, a2, b2;
        System.out.println("enter the value of starting and ending points of line two ");
        Scanner sc1 = new Scanner(System.in);
        System.out.print("A1 -->");
        a1 = sc1.nextInt();
        System.out.print("B1 -->");
        b1 = sc1.nextInt();
        System.out.print("A2 -->");
        a2 = sc.nextInt();
        System.out.print("B2 -->");
        b2 = sc.nextInt();
        Double d2 =Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));
        System.out.println("LENGTH OF LINE 2 IS \t"+d2);
        //Integer dis2 = (int)d2;
        int compare = d1.compareTo(d2);


        if(compare == 0){
            System.out.println("BOTH LINES ARE EQUAL ");
        } else if (compare > 0) {
            System.out.println("line number 1 is greater "+d1);
        }
        else if (compare< 0 ){
            System.out.println("line number 2 is greater "+d2);
        }
        else {
            System.out.println("Wrong value ");
        }

    }
}
