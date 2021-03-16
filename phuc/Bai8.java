/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapnhom;

import java.util.Scanner;

/**
 *
 * @author THUYHANG
 */
public class Bai8 {
    //Giai phuong trinh bac 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double x1, x2;
        System.out.println("Nhap a, b, c: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        double delta = b*b - 4*a*c;
        if(delta < 0)
            System.out.println("Phuong trinh vo nghiem");
        else{
            if(delta == 0)
                System.out.println("Phuong trinh co 1 nghiem kep: x1 = x2 = " + (-b/2*a));
            else{
                x1 = (-b + Math.sqrt(delta))/(2*a);
                x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + Math.round(x1*100)/100 + " va x2 = " + Math.round(x2*100)/100);
            }
        }
    }
}
