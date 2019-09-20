/**
 * @(#)latihan4max_min.java
 *
 *
 * @author 
 * @version 1.00 2019/9/19
 */

import java.util.Scanner;
public class latihan4max_min {

  public static void main (String[] args) {
  	Scanner input = new Scanner (System.in);
  	System.out.print("Jumlah data yang ingin anda masukkan =  ");
  		int n = input.nextInt();
  		int []a= new int [n] ;
  	System.out.println("Input");
  	for(int i = 0 ; i <n ; i++){
  	a[i] = input.nextInt();	}
  	
  	int iMax = a[0];
  	for(int i=1;i<n;i++){
  		if(iMax < a[i]){
  			iMax =a[i];}}
  	int iMin = a[0];
  	for (int i=1; i<n;i++){
  		if(iMin>a[i]){
  			iMin = a[i];}}
  			
  	System.out.println ("Nilai Maksimum= "+iMax);
  	System.out.println ("Nilai Minimum = "+iMin);
  	
  }}