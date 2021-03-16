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
public class Bai6 {
    // Nhap 3 so nguyen va in ra man hinh theo thu tu tang dan, chi su dung mot bien phu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        System.out.print("Nhap 3 so nguyen: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
       
        if(a < b){
            t = a;
            a = b;
            b = t;
        }
        
        if(a < c){
            t = a;
            a = c;
            c = t;
        }
        
        if(b < c){
            t = b;
            b = c;
            c = t;
        }
        
        System.out.println("Sap xep tang dan: " + c + "," + b + "," + a);
    }
}
