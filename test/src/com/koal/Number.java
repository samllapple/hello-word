package com.koal;


import java.util.Scanner;



/*要求：请计算变种的斐波那契数: 从第 4 个数开始，每个数是前面 3 个数之和，
形如: 1, 1, 2, 4, 7, 13, 24, 44, ...。
执行程序后，输入打印个数n，程序打印出n个数值（斐波那契数）。
（分别用递归和非递归两种方式实现）*/

public class Number {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("输入打印个数");
			int i=sc.nextInt();
			if(i<=0){
				System.out.println("请输入正整数");
			}else{
				//循环打印出斐波那锲数列
				for(int j=1;j<=i;j++){
					System.out.println(dg(j)+"====="+ndg(j));
				    }
			}
		    
			
		}
		//1.递归的方式
		public static int dg(int n){
       //该算法利用递归的方式计算第几项的值
			if(n==1 || n==2){
				return 1;
			}if(n==3){
				return 2;
			}
				return dg(n-1)+dg(n-2)+dg(n-3);
		}
		//2.非递归的方式
		public static int ndg(int n){
			int first=1;
			int second=1;
			int thrid=2;
			int  result=0 ;
			//result用来记录结果,first用来记录计算项的前面的前面的数，second用来记录当前计算项的前一项,thrid用来记录当前项
			if(n==1 || n==2){
				return 1;
			}if(n==3){
				return 2;
			}
			for (int i = 1; i < n - 2; i++) {
				result = first+second+thrid;
				first = second;
				second =thrid;
				thrid=result;
			}
			
			return result;
		}

		
}
