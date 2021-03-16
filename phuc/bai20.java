
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
public class bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so dien tieu thu : ");
        float n = sc.nextFloat();
        double money ;
        if(n <= 100){
            money = n*500;
        }
        else if (n <= 250 ){
            money = 100 *500 + (n-100) * 800;
            }
            else if(n <= 350){
                money = 100 *500 + (250-100) * 800 + (n-250) * 1000; 
                }
                else{
                         money = 100 *500 + (250-100) * 800 + (350-250) * 1000 + (n - 350) * 1500;
                        }
        System.out.println("so tien dien la :  " + money);
        }
    }

