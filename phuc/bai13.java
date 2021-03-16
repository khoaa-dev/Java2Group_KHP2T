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
public class bai13 {
    Scanner sc = new Scanner(System.in);
    int ngay;
    int thang;
    int nam;
    public void nhapNgay () {
       this.ngay = sc.nextInt();
       this.thang = sc.nextInt();
       this.nam = sc.nextInt();
       if (this.ngay < 0 || this.thang < 0 || this.nam < 0 || this.thang > 12 ) {
           System.out.println("ngay,thang,nam ko hop le");
           return;
       }
       
       if ( (this.nam % 4 == 0 && this.nam % 100 != 0) || this.nam % 400 == 0) {
           if (this.thang == 2) {
               if (this.ngay > 29) {
                   System.out.println("ngay cua thang 2 ko hop le");
               }
           }
           if (this.thang == 1 || this.thang == 3 || this.thang == 5 || this.thang == 7 ||
                   this.thang == 8 || this.thang == 10 || this.thang == 12) {
               if ( this.ngay > 31) System.out.println("ngay ko hop le");
           }
           if (this.thang == 2 || this.thang == 4 || this.thang == 6 || this.thang == 9 ||
                   this.thang == 11) {
               if ( this.ngay > 30) System.out.println("ngay ko hop le");
           }
       }
       else {
           if (this.thang == 2) {
               System.out.println("ko phai nam nhuan");
               if (this.ngay > 28) {
                   System.out.println("ngay cua thang 2 ko hop le");
               }
           }
           if (this.thang == 1 || this.thang == 3 || this.thang == 5 || this.thang == 7 ||
                   this.thang == 8 || this.thang == 10 || this.thang == 12) {
               if ( this.ngay > 31) System.out.println("ngay ko hop le");
           }
           if (this.thang == 2 || this.thang == 4 || this.thang == 6 || this.thang == 9 ||
                   this.thang == 11) {
               if ( this.ngay > 30) System.out.println("ngay ko hop le");
           }
       }
       
       int dateOfweek;
       int a = (14 - this.thang) /12;
       int y = this.nam  - a;
       int m = this.thang + 12 * a -2;
       dateOfweek = (this.ngay + y + y/4 - y/100 + y/400 + (31 * m)/12) % 7;
        System.out.println("dateofweek : " + dateOfweek);
    }
    public static void main(String[] args) {
        bai13 bt = new bai13();
        bt.nhapNgay();
    }
}
