package com.kunal.assignments.Intermediate;

import java.awt.geom.Point2D;
import java.util.Scanner;

public class distanceBtw2Points {
    public static void main(String[] args) {
        /* distance = sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1)) */
        Scanner in = new Scanner(System.in);
        System.out.println("X co-ordinates -");
        System.out.print("x1: ");
        int x1 = in.nextInt();
        System.out.print("x2: ");
        int x2 = in.nextInt();
        System.out.println("Y Co-ordinates -");
        System.out.print("y1: ");
        int y1 = in.nextInt();
        System.out.print("y2: ");
        int y2 = in.nextInt();
        // one Way
//        double distance = Math.sqrt(((y2 - y1) * (y2 - y1)) + ((x2 - x1) * (x2 - x1)));
        // second way
//        int ac = Math.abs(y2 - y1);
//        int bc = Math.abs(x2 - x1);
//        double distance = Math.hypot(ac,bc);
        // third way
        double distance = Point2D.distance(x1,y1,x2,y2);
        System.out.println("Distance between X(" + x1 + " , " + x2 + ") and Y(" + y1 + " , " + y2 + ") is: " + distance );
    }
}
