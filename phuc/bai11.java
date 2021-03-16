/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Phuc
 */
public class bai11 {
    public int computer;
    public int human;
    
    public char humanNhap () {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char h = '0';
        try {
            h = (char) in.read();
            
        } catch (IOException ex) {
            Logger.getLogger(bai11.class.getName()).log(Level.SEVERE, null, ex);
        }
        return h; 
    }
    
    public int computerNhap( ) {
        int bdkInt;
        do {            
            double bdk = (Math.random() * 107) + 97;
            bdkInt = (int) bdk;
        } while (bdkInt != 98 && bdkInt != 100 && bdkInt != 107 );
        return bdkInt;
    }
    
    public int checkWinner (char ng, char may ) {
        if (ng == 'b') {
            switch (may) {
                case 'b' : return 0;
                case 'd' : return 1;
                case 'k' : return 2;
            }
        }
        if (ng == 'd') {
            switch (may) {
                case 'b' : return 2;
                case 'd' : return 0;
                case 'k' : return 1;
            }
        }
        if (ng == 'k') {
            switch (may) {
                case 'b' : return 1;
                case 'd' : return 2;
                case 'k' : return 0;
            }
        }
        return 0;
    }
    
    public void run () {
        do {            
            System.out.println("Nhap ky tu (b-d-k), ky tu khac de thoat: ");   
            char ngChon = this.humanNhap();
            
            if (ngChon != 'b' && ngChon != 'd' && ngChon != 'k') {
                System.out.println("da thoat ");
                break;
            }
            char mayChon = (char) this.computerNhap();
            System.out.println("Nguoi : " + ngChon);
            System.out.println("May : " + mayChon);
            if (this.checkWinner(ngChon,mayChon) == 1) {
                this.human ++;
                System.out.println("nguoi thang");
            }
            if (this.checkWinner(ngChon,mayChon) == 2) {
                this.computer ++;
                System.out.println("may thang");
            }
            if (this.checkWinner(ngChon,mayChon) == 0) {
                System.out.println("Hue");
            }
        } while (true);
    }
    
    public static void main(String[] args) {
        bai11 bt = new bai11();
        bt.run();
        System.out.println("nguoi : " + bt.human);
        System.out.println("nguoi : " + bt.computer);

    }
}
