/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class bai4 {
    
    public static void checkThreeSideOfTriangle(int a, int b, int c) {
        if(a < 0 || b < 0 || c < 0 || a+b<c || b+c<a || a+c<b) {
            System.out.println("Khong hop le!");
        } else {
            if (a==b && a==c) {
                System.out.println("Tam giac deu!");
            } else if (c*c==a*a+b*b || b*b==a*a+c*c || a*a==b*b+c*c) {
                System.out.println("Tam giac vuong!");
            } else {
                System.out.println("Tam giac thuong!");
            }
        }
    }
    
    public static double getAreaOfTriangle(int a, int b, int c) {
        double p = (double)(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Nhap 3 canh tam giac: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        checkThreeSideOfTriangle(a,b,c);
        System.out.println("Dien tich S = " + getAreaOfTriangle(a,b,c));
        
    }
}
