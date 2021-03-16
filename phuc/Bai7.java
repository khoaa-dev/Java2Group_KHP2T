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
public class Bai7 {
    //Giai phuong trinh bac 1
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int a, b;
        System.out.print("Nhap a: ");
        a = sc.nextInt();
        System.out.print("Nhap b: ");
        b = sc.nextInt();
        
        if(a == 0){
            if(b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            }
            else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else{
            System.out.println("Ket qua: " + (-b/a));
        }
    }
}

