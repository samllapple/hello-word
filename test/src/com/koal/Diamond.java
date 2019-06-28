package com.koal;

import java.util.Scanner;

//要求：执行程序后，输入最大行的数值（如上图是7，此数值只支持奇数，不支持偶数），然后程序打印出菱形。

public class Diamond {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要打印的行数");
		int k=sc.nextInt();
		if(k<=0){
			System.out.println("请输入正整数");
		}
     //如果输入的数为奇数则循环，为偶数则不循环
		else if(k%2!=0){
     //	打印上半部分，i为上半部分行数
		for(int i=1;i<=k/2+1;i++){
		  //循环打印出每行星星的个数
			for(int j=1;j<i*2;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	//打印下半部分，m为下半部分行数
	  for(int m=1;m<=k/2;m++){
		  //每行打印出的空格数
		for(int n=0;n<m*2;n++){
			System.out.print(" ");
		}
		//每行打印的星星数
		for(int j=0;j<k-m*2;j++){
			System.out.print("*");
		}
		System.out.println();
	}
		}else{
			System.out.println("输入行数有误，应为奇数");
		}
  }
	
}
