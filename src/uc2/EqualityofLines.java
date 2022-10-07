package uc2;

import uc1.LengthofLine;

import java.util.Scanner;
public class EqualityofLines {
    public void Equal() {
        int x1, y1, x2, y2;
        System.out.println("TO FIND EQUALITY OF LINE ");
        System.out.println("enter the value of starting and ending points of line one  ");
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextInt();
        System.out.print("Y1 -->");
        y1 = sc.nextInt();
        System.out.print("X2 -->");
        x2 = sc.nextInt();
        System.out.print("Y2 -->");
        y2 = sc.nextInt();
        Double d1 =Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("LENGTH OF LINE 1 IS \t"+d1);
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


       if(d1.equals(d2)){
           System.out.println("BOTH LINES ARE EQUAL ");
       }
       else{
           System.out.println("BOTH LINES ARE NOT EQUAL ");
       }

    }

    }
