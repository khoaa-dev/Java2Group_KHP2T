/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author Phuc
 */
public class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1, b1, c1, a2, b2, c2;
        float D, Dx, Dy, x, y;
        System.out.println("a1*x + b1*y = c1");
        System.out.println("a2*x + b2*y = c2");
        System.out.println("nhap a1 :");
        a1 = sc.nextInt();
        System.out.println("nhap b1 : ");
        b1 = sc.nextInt();
        System.out.println("nhap c1 : ");
        c1 = sc.nextInt();
        System.out.println("nhap a2 : ");
        a2 = sc.nextInt();
        System.out.println("nhap b2 : ");
        b2 = sc.nextInt();
        System.out.println("nhap c2 : ");
        c2 = sc.nextInt();
         D = a1 * b2 - a2 * b1;
        Dx = c1 * b2 - c2 * b1;
        Dy = a1 * c2 - a2 * c1;
        if (D == 0) {
        if (Dx + Dy == 0)
             System.out.println("He phuong trinh co vo so nghiem");
        else
            System.out.println("He phuong trinh vo nghiem");
        }
        else {
            x = Dx / D;
            y = Dy / D;
            System.out.println("He phuong trinh co nghiem x : " + x + " y : " + y);
        }
    }
}
