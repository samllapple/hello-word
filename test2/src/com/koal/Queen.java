package com.koal;

import java.util.ArrayList;

/*
 * 八皇后问题是一个古老而著名的问题，是回溯算法的典型例题。
 * 该问题是十九世纪著名的数学家高斯1850年提出：
 * 在8X8格的国际象棋上摆放八个皇后，使其不能互相攻击，即任意两个皇后都不能处于同一行、同一列或同一斜线上，
 * 问有多少种摆法
*/

public class Queen {

	      
		    public static int num = 0; //累计方案总数
		    public static final int MAXQUEEN = 8;//皇后棋个数，同时也是棋盘行列总数
		    public static int[] cols = new int[MAXQUEEN]; //定义cols数组，表示8列棋子摆放情况，下标表示列数，数组中的元素值表示行数。
		    
		    public static void  getNum(int n){
		     //遍历该列所有不合法的行，数组下标表示行数，并用rows数组记录，不合法即rows[i]=true
		     boolean[] rows = new boolean[MAXQUEEN];
		     for(int i=0;i<n;i++){
		        rows[cols[i]]=true;
		        int d = n-i;
		        //判断当前列的前列是否合法
		        if(cols[i]-d >= 0)rows[cols[i]-d]=true;
		      //判断当前列的后列是否合法
		        if(cols[i]+d <= MAXQUEEN-1)rows[cols[i]+d]=true; 
		      
		     }
		     for(int i=0;i<MAXQUEEN;i++){
		       //判断该行是否合法  
		       if(rows[i])continue;
		       //设置当前列合法棋子所在行数
		       cols[n] = i;
		       //当前列不为最后一列时,继续递归
		       if(n<MAXQUEEN-1){
		         getNum(n+1);
		       }else{

		        //累计方案个数
		         num++;
		         System.out.println("第"+num+"种方法 ");
		         //打印棋盘信息
		         printChessBoard();
		       } 
		      
		     }
		     
		    }
		  //打印棋盘信息
		    public static void printChessBoard(){
		       
		       for(int i=0;i<MAXQUEEN;i++){
		         for(int j=0;j<MAXQUEEN;j++){
		        	 //判断是否是合法行数,如果是打印出1，不是打印出0。
		           if(i==cols[j]){
		             System.out.print("1 ");
		           }else
		             System.out.print("0 ");
		           }
		         System.out.println();
		       }
		       
		    }
		   
		    public static void main(String args[]){
		    	//(new ArrayList<String>()).get(1);
		    	  
		          getNum(0);
		          System.out.println("棋盘问题有"+num+"种摆放方法");
		          
		       }

}
