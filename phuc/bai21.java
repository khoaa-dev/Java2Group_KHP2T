package bai20_electricitybill;
import java.util.Scanner;
public class TotalMoney {
	@SuppressWarnings("resource")
	public static void main(String []args) {
		Scanner src = new Scanner(System.in);
		System.out.print("Nhap so kW tieu thu: ");
		int watage = src.nextInt();
		int money = watage*500;
		if(watage > 100)
			//Thu them phu phi 800 - 500 = 300
			money += (watage - 100)*300;
		if(watage > 250)
			//Thu them phu phi 1000 - 800 = 200
			money += (watage - 250)*200;
		if(watage > 350)
			//Thu them phu phi 1500 - 1000 = 300
			money += (watage - 350)*500;
		System.out.println(money);
	}		
}
