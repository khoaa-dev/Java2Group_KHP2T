/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class bai5 {
    
    public static double getArea(double xA, double yA, double xB, double yB, double xC, double yC) {
        return (xA*yB - xB*yA + xB*yC - xC*yB +xC*yA - xA*yC)/2;
    }
    
    public static void locateOfPointInTriangle(double xA, double yA, double xB, double yB, double xC, double yC, double xM, double yM) {
        double sMAB = getArea(xM, yM, xA, yA, xB, yB);
        double sMBC = getArea(xM, yM, xB, yB, xC, yC);
        double sMAC = getArea(xM, yM, xA, yA, xC, yC);
        double sABC = getArea(xA, yA, xB, yB, xC, yC);
        if(sMAB + sMBC + sMAC > sABC) {
            System.out.println("M nam ngoai tam giac ABC");
        } else if (sMAB + sMBC + sMAC == sABC) {
            System.out.println("M nam tren tam giac ABC");
        } else {
            System.out.println("M nam trong tam giac ABC");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double xA, yA, xB, yB, xC, yC, xM, yM;
        System.out.println("A(xA, yA): ");
        xA = sc.nextDouble();
        yA = sc.nextDouble();
        System.out.println("B(xB, yB): ");
        xB = sc.nextDouble();
        yB = sc.nextDouble();
        System.out.println("C(xC, yC): ");
        xC = sc.nextDouble();
        yC = sc.nextDouble();
        System.out.println("M(xM, yM): ");
        xM = sc.nextDouble();
        yM = sc.nextDouble();
        
        locateOfPointInTriangle(xA, yA, xB, yB, xC, yC, xM, yM);
    }
}
