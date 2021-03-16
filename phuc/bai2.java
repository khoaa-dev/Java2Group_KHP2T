/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class bai2 {
    
    public static double getDistanceOfTwoPoints(double xA, double yA, double xB, double yB) {
        return Math.sqrt((xB - xA)*(xB - xA) + (yB - yA)*(yB - yA));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double xA, yA, xB, yB;
        System.out.println("Nhap toa do diem A(xA, yA): ");
        xA = sc.nextDouble();
        yA = sc.nextDouble();
        System.out.println("Nhap toa do diem B(xB, yB): ");
        xB = sc.nextDouble();
        yB = sc.nextDouble();
        System.out.println("|AB| = " + getDistanceOfTwoPoints(xA, yA, xB, yB));
    }
}
