package com.koal;

import java.util.ArrayList;

/*
 * �˻ʺ�������һ�����϶����������⣬�ǻ����㷨�ĵ������⡣
 * ��������ʮ��������������ѧ�Ҹ�˹1850�������
 * ��8X8��Ĺ��������ϰڷŰ˸��ʺ�ʹ�䲻�ܻ��๥���������������ʺ󶼲��ܴ���ͬһ�С�ͬһ�л�ͬһб���ϣ�
 * ���ж����ְڷ�
*/

public class Queen {

	      
		    public static int num = 0; //�ۼƷ�������
		    public static final int MAXQUEEN = 8;//�ʺ��������ͬʱҲ��������������
		    public static int[] cols = new int[MAXQUEEN]; //����cols���飬��ʾ8�����Ӱڷ�������±��ʾ�����������е�Ԫ��ֵ��ʾ������
		    
		    public static void  getNum(int n){
		     //�����������в��Ϸ����У������±��ʾ����������rows�����¼�����Ϸ���rows[i]=true
		     boolean[] rows = new boolean[MAXQUEEN];
		     for(int i=0;i<n;i++){
		        rows[cols[i]]=true;
		        int d = n-i;
		        //�жϵ�ǰ�е�ǰ���Ƿ�Ϸ�
		        if(cols[i]-d >= 0)rows[cols[i]-d]=true;
		      //�жϵ�ǰ�еĺ����Ƿ�Ϸ�
		        if(cols[i]+d <= MAXQUEEN-1)rows[cols[i]+d]=true; 
		      
		     }
		     for(int i=0;i<MAXQUEEN;i++){
		       //�жϸ����Ƿ�Ϸ�  
		       if(rows[i])continue;
		       //���õ�ǰ�кϷ�������������
		       cols[n] = i;
		       //��ǰ�в�Ϊ���һ��ʱ,�����ݹ�
		       if(n<MAXQUEEN-1){
		         getNum(n+1);
		       }else{

		        //�ۼƷ�������
		         num++;
		         System.out.println("��"+num+"�ַ��� ");
		         //��ӡ������Ϣ
		         printChessBoard();
		       } 
		      
		     }
		     
		    }
		  //��ӡ������Ϣ
		    public static void printChessBoard(){
		       
		       for(int i=0;i<MAXQUEEN;i++){
		         for(int j=0;j<MAXQUEEN;j++){
		        	 //�ж��Ƿ��ǺϷ�����,����Ǵ�ӡ��1�����Ǵ�ӡ��0��
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
		          System.out.println("����������"+num+"�ְڷŷ���");
		          
		       }

}
