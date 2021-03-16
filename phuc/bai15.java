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
public class bai15 {
    Scanner sc = new Scanner(System.in);
    
    public void nhapNgay () {
        int ngay;
        int thang;
        int nam;
       ngay = sc.nextInt();
       thang = sc.nextInt();
       nam = sc.nextInt();
       if (ngay < 0 || thang < 0 || nam < 0 || thang > 12 ) {
           System.out.println("ngay,thang,nam ko hop le");
       }
       int dateOfYear = (int) (30.42 * (thang -1 )) + ngay;
       if (thang == 2 || (((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) && thang > 2) ) {
           dateOfYear ++;
       }
       if (thang > 2 && thang < 8 ) {
           dateOfYear --;
       }
        System.out.println(dateOfYear);
    }
    public static void main(String[] args) {
        bai15 bt = new bai15();
        bt.nhapNgay();
    }
}
