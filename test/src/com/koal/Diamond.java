package com.koal;

import java.util.Scanner;

//Ҫ��ִ�г������������е���ֵ������ͼ��7������ֵֻ֧����������֧��ż������Ȼ������ӡ�����Ρ�

public class Diamond {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫ��ӡ������");
		int k=sc.nextInt();
		if(k<=0){
			System.out.println("������������");
		}
     //����������Ϊ������ѭ����Ϊż����ѭ��
		else if(k%2!=0){
     //	��ӡ�ϰ벿�֣�iΪ�ϰ벿������
		for(int i=1;i<=k/2+1;i++){
		  //ѭ����ӡ��ÿ�����ǵĸ���
			for(int j=1;j<i*2;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	//��ӡ�°벿�֣�mΪ�°벿������
	  for(int m=1;m<=k/2;m++){
		  //ÿ�д�ӡ���Ŀո���
		for(int n=0;n<m*2;n++){
			System.out.print(" ");
		}
		//ÿ�д�ӡ��������
		for(int j=0;j<k-m*2;j++){
			System.out.print("*");
		}
		System.out.println();
	}
		}else{
			System.out.println("������������ӦΪ����");
		}
  }
	
}
