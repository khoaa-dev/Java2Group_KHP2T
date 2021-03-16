
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class bai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap gio phut giay thoi diem 1 : ");
        int gio1 = sc.nextInt();
        int phut1 = sc.nextInt();
        int giay1 = sc.nextInt();
        System.out.println("nhap gio phut giay thoi diem 2 : ");
        int gio2 = sc.nextInt();
        int phut2 = sc.nextInt();
        int giay2 = sc.nextInt();
        int time1 = gio1*3600 + phut1*60 + giay1;
        int time2 = gio2*3600 + phut2*60 + giay2;
        int hieu = time2 - time1;
        int gio = hieu/3600;
        int phut  = (hieu%3600)/60;
        int giay = hieu - (gio*3600 + phut*60);
        System.out.println("hieu gio phut giay la : " + gio+ "gio " + phut+"phut " + giay +"giay");
    }
}
