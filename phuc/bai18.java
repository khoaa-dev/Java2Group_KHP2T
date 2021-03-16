
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
public class bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so gio : ");
        int n = sc.nextInt();
        float tuan ;
        float ngay; 
        float gio;
        tuan = n/168;
        System.out.println("so tuan la : " + tuan);
        ngay = (n%168)/24;
        System.out.println("so ngay la : " + ngay);
        gio = n - (tuan*168 + ngay*24);
        System.out.println("so gio la : " + gio);
    }
}
