package bai22_uocso;
import java.util.Scanner;
public class UocSo {
	public static void main(String args[]) {
		Scanner src = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = src.nextInt();
		int tong = 0, dem = 0;;
		System.out.print("Cac uoc so la: ");
		for(int i = 1; i <= n; i++)
			if(n % i == 0) {
				System.out.print( i + " ");
				tong += i;
				dem++;
			}
		System.out.print("\nCo " + dem + " uoc so, Tong la: " + tong);
		
	}
}
