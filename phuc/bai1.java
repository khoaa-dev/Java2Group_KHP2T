/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class bai1 {
    
    public static double getVolumeOfSphere(double S) {
        double R = Math.sqrt(S/(4*3.14));
        
        return (4*3.14*R*R*R)/3;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double S, V;
        System.out.println("Nhap dien tich mat cau: ");
        S = sc.nextDouble();
        System.out.println("The tich V = " + getVolumeOfSphere(S));
    }
}
