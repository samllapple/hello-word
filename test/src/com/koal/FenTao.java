package com.koal;
/*海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子平均分为五份，多了一个，这只猴子把多的一个扔入海中，拿走了一份。
 * 第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中  ，拿走了一份，
 * 第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？
*/
public class FenTao {
	public static void main(String[] args) {
		
	int count = 5;//猴子的个数
	//i为桃子的数量
	for (int i = 0; i<10000 ; i++) {
		int result = fen(count,i);
		if(result == 1){//当返回值为1时，打印
			System.out.println(i);
		}
	}
}

   public static int fen(int count,int num){
	 if(count == 0){//当第0个猴子分桃时跳出
		return 1;
	}
	if((num-1)%5!=0){//当桃子不满足分5份后剩1个时跳出
		return -1;
	}
	num = (num-1)/5*4;//满足时继续调用自身方法:桃子每次剩余数量为:(桃子总数num-1)/5*4
	return fen(count-1,num);
  }

}
