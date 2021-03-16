package bai24_number;
import java.util.Scanner;
public class number {
	public static void main(String args[]) {
		Scanner src = new Scanner(System.in);
		System.out.print("Nhap n: ");
		long n = src.nextLong();
		long soDaoNguoc = 0;
		int dem = 0;
		long n2 = n;
		while(n2 != 0) {
			dem++;
			soDaoNguoc = soDaoNguoc*10 + (n2 % 10);
			n2 /= 10;
		}
		System.out.println("co " + dem + " chu so");
		System.out.println("Chu so cuoi cung la:: " + n%10);
		System.out.println("Chu so dau tien la: " + soDaoNguoc%10);
		System.out.println("so dao nguoc: " + soDaoNguoc);
	}
}
