package com.koal;


import java.util.Scanner;



/*Ҫ���������ֵ�쳲�������: �ӵ� 4 ������ʼ��ÿ������ǰ�� 3 ����֮�ͣ�
����: 1, 1, 2, 4, 7, 13, 24, 44, ...��
ִ�г���������ӡ����n�������ӡ��n����ֵ��쳲�����������
���ֱ��õݹ�ͷǵݹ����ַ�ʽʵ�֣�*/

public class Number {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("�����ӡ����");
			int i=sc.nextInt();
			if(i<=0){
				System.out.println("������������");
			}else{
				//ѭ����ӡ��쳲���������
				for(int j=1;j<=i;j++){
					System.out.println(dg(j)+"====="+ndg(j));
				    }
			}
		    
			
		}
		//1.�ݹ�ķ�ʽ
		public static int dg(int n){
       //���㷨���õݹ�ķ�ʽ����ڼ����ֵ
			if(n==1 || n==2){
				return 1;
			}if(n==3){
				return 2;
			}
				return dg(n-1)+dg(n-2)+dg(n-3);
		}
		//2.�ǵݹ�ķ�ʽ
		public static int ndg(int n){
			int first=1;
			int second=1;
			int thrid=2;
			int  result=0 ;
			//result������¼���,first������¼�������ǰ���ǰ�������second������¼��ǰ�������ǰһ��,thrid������¼��ǰ��
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
