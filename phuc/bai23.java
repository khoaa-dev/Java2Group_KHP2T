package bai23_perfectnum;
import java.util.Scanner;
public class PerfectNum {
	public static int tinhTongCacUoc(int a) {
		int tong = 0;
		for(int i = 1; i < a; i++)
			if(a % i == 0)
				tong += i;
		return tong;
	}
	public static void main(String args[]) {
		Scanner src = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = src.nextInt();
		System.out.print("Cac so hoan hao nho hon " + n + " la: ");
		for(int i = 1; i < n; i++) {
			if(i == tinhTongCacUoc(i))
				System.out.print(i + " ");
		}
	}
}
