/**
 * @(#)ifelselatihan2.java
 *
 *
 * @author 
 * @version 1.00 2019/9/19
 */

import java.util.Scanner;
public class ifelselatihan2
{
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		int nilai;
		
		System.out.print("Masukkan nilai = ");
		nilai = input.nextInt();
		
		if(nilai==1){
			System.out.println("angka yang dimasukkan adalah satu");
		}
		else
			System.out.println("angka yang dimasukkan bukan satu");
    }	 
}