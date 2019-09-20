/**
 * @(#)teorilat1.java
 *
 *
 * @author 
 * @version 1.00 2019/9/19
 */

import java.util.Scanner;
public class teorilat1 {

  public static void main (String[] args) {
  	Scanner input = new Scanner(System.in);
  	int tipe;
  	
  	System.out.print("Masukkan tipe pesawat anda = ");
  	tipe = input.nextInt();
  	
  	if (tipe == 1) {
  		System.out.print("Tipe pesawat anda adalah garuda ");
  	}
  	else if (tipe == 2){
  		System.out.print("Tipe pesawat anda adalah Batik");
  	}
  	else if (tipe == 3){
  		System.out.print("Tipe pesawat anda adalah Lion");
  	}
  	else {
  		System.out.println("anda salah memasukkan tipe pesawat");
  	}
  	}
  }
