/**
 * @(#)latihan5.java
 *
 *
 * @author 
 * @version 1.00 2019/9/19
 */

import java.util.Scanner;
public class latihan5 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Masukkan angka = ");
		
		int angka = input.nextInt();
		
		if (angka<0){
			System.out.println("" +angka + " Bilangan Negatif");
		}
		else if(angka>=0){
			System.out.println("" +angka + " Bilangan Positif");
	}
    }
    
}