/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sin;
        System.out.println("Nhap SIN: ");
        sin = sc.nextInt();
        int checkDigit = sin % 10;
        sin /= 10;
        int pos, t, sum = 0;
        for(pos = 0; pos < 8 && sin > 0; sin /= 10, ++pos) {
            t = sin % 10;
            if(pos % 2 == 0) {
                sum += t;
            } else {
                sum += (2 * t) / 10 + (2 * t) % 10;
            }
        }
        if (pos < 8 || sin > 0 || sum % 10 != 0) {
            System.out.println("SIN khong hop le");
        } else {
            System.out.println("SIN hop le");
        }
    }
}
