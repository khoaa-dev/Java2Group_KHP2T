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
public class Bai9 {
    // Nhap vao so x chi so do cua mot goc, tinh bang phut. Cho biet no thuoc go vuong thu bao nhieu cua vong tron luong giac
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle;
        
        System.out.print("Nhap so do x cua goc: ");
        angle = sc.nextDouble();
        
        angle /= 60; 
        System.out.println("x thuoc goc vuong thu " + (int)Math.ceil(angle/90)%4);
        System.out.println("cos(x) = " + Math.cos(angle*3.14/180));
    }
}
