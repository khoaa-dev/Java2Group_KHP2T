/*
 * To change license header, choose License Headers in Project Properties.
 * To change template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author Phuc
 */
public class bai14 {
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
           return;
       }
       
       if ( (nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) {
           if (thang == 2 ) {
               if (ngay == 29) {
                   ngay = 1;
                   thang ++;
                   System.out.println("ngay hom sau : " + ngay +":" + thang + ":" + nam);
               } else {
                   ngay ++;
                   System.out.println("ngay hom sau : " + ngay +":" + thang + ":" + nam);
                   
               }
           }
           if (thang == 1 || thang == 3 || thang == 5 || thang == 7 ||
                   thang == 8 || thang == 10 || thang == 12) {
               if ( thang == 12 ) {
                   if (ngay == 31) {
                       ngay = 1;
                       thang = 1;
                       nam ++;
                       System.out.println("ngay hom sau : " + ngay +":" + thang + ":" + nam);                 
                   }
               } else {
                   if ( ngay == 31) {
                        ngay = 1;
                        thang ++;
                         System.out.println("ngay hom sau : " + ngay +":" + thang + ":" + nam);
                    } else {
                       ngay ++;
                       System.out.println("ngay hom sau : " + ngay +":" + thang + ":" + nam);
                   }
               }
               
           }
           
       }
       else {
           if (thang == 2 ) {
               if (ngay == 28) {
                   ngay = 1;
                   thang ++;
                   System.out.println("ngay hom sau : " + ngay +":" + thang + ":" + nam);
               } else {
                   ngay ++;
                   System.out.println("ngay hom sau : " + ngay +":" + thang + ":" + nam);
                   
               }
           }
           if (thang == 1 || thang == 3 || thang == 5 || thang == 7 ||
                   thang == 8 || thang == 10 || thang == 12) {
               if ( thang == 12 ) {
                   if (ngay == 31) {
                       ngay = 1;
                       thang = 1;
                       nam ++;
                       System.out.println("ngay hom sau : " + ngay +":" + thang + ":" + nam);                 
                   } else {
                       ngay += 1;
                       thang += 1;
                       System.out.println("ngay hom sau : " + ngay +":" + thang + ":" + nam);                 
                   }
               } else {
                   if ( ngay == 31) {
                        ngay = 1;
                        thang ++;
                         System.out.println("ngay hom sau : " + ngay +":" + thang + ":" + nam);
                    } else {
                       ngay ++;
                       System.out.println("ngay hom sau : " + ngay +":" + thang + ":" + nam);
                   }
               }
               
           }
           if (thang == 2 || thang == 4 || thang == 6 || thang == 9 ||
                   thang == 11) {
               if ( ngay == 30){
                   ngay =1;
                   thang++;
                   System.out.println("ngay hom sau : " + ngay +":" + thang + ":" + nam);                  
               } else {
                   ngay ++;
                   System.out.println("ngay hom sau : " + ngay +":" + thang + ":" + nam);                   
               }
           }
       }
    }
    public static void main(String[] args) {
        bai14 bt = new bai14();
        bt.nhapNgay();
    }
}
