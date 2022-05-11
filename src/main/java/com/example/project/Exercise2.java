package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

            int a [] = new int [7];
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                a[i] = n;
            }
			
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}

	public Integer getMenorNumeroSaltos(int a []) {
        int f=0;
	int k=0;
	for(int i=0;i<a.length;i++){
		
		if(f+50<a[i]) {
		 k++;
		 f=a[i-1];
		 i--;
	}else 
	return-1;
	}
	return k+1;
	}
}
