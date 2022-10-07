package uc1;
import java.util.Scanner;

public class LengthofLine {
    public void Length () {
        int x1,y1,x2,y2;
        System.out.println("TO FIND LENGTH OF LINE ");
        System.out.println("enter the value of starting and ending points ");
        Scanner sc = new Scanner(System.in);
        System.out.print("X1 -->");
        x1 = sc.nextInt();
        System.out.print("Y1 -->");
        y1 = sc.nextInt();
        System.out.print("X2 -->");
        x2 = sc.nextInt();
        System.out.print("Y2 -->");
        y2 = sc.nextInt();

        double dis =Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("LENGTH OF LINE IS \t"+dis);

    }
}