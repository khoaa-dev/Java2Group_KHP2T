/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class bai3 {
    
    public static double getDistanceOfTwoPoints(double xA, double yA, double xB, double yB) {
        return Math.sqrt((xB - xA)*(xB - xA) + (yB - yA)*(yB - yA));
    }
    
    public static void locateAPointWithCircle(double xC, double yC, double R, double xM, double yM) {
        double s = getDistanceOfTwoPoints(xC, yC, xM, yM);
        if(s == R) {
            System.out.println("M nam tren C");
        } else if (s > R) {
            System.out.println("M nam ngoai C");
        } else {
            System.out.println("M nam trong C");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double xC, yC, xM, yM, R;
        System.out.println("Nhap toa do tam C(xC, yC): ");
        xC = sc.nextDouble();
        yC = sc.nextDouble();
        System.out.println("Nhap ban kinh R: ");
        R = sc.nextDouble();
        System.out.println("Nhap toa do M(xM, yM): ");
        xM = sc.nextDouble();
        yM = sc.nextDouble();
        locateAPointWithCircle(xC, yC, R, xM, yM);
    }
}
