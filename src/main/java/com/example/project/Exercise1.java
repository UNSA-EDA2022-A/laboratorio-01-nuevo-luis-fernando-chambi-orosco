package com.example.project;

import java.util.Scanner;

public class Exercise1 {
	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}
	public String convertirBaseGabriel(int a) {
               int d,i=0,exp=0,num=0;
		boolean gabriel;
	         gabriel = true;
	          while (a!= 0) {
	                     d= a % 10;
	                   if (d!= 0 && d != 1&!(d==2&& i==0)) { 
	                    gabriel = false;
	                    break;
	                   }
	                    if(d==1) {
	                  	 i=1;
	                   } 
	                     num=num+d*((int)Math.pow(2,exp+1)-1);
	        			 exp++;
	        			 a=a/10;                             
	           }
	        if(gabriel==true) {
	       return String.valueOf(num);
	       }else
		return "El numero proporcionado no esta en base Gabriel.";
		
	}
}
