package cal;

import java.util.Random;

public class First{
	private static int nextInt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args){
		int judge;
		int k = 0;                                          
		First first = new First();
		for(int i = 0; i < 50; i ++) {                             //随机生成加法或者减法算式
			judge = (int)(Math.random()*2);
			if(judge == 1) {
			    first.add();
			}
			else
			{
				first.subtraction();
			}
		k++;
		if(k == 5) {                                            //每行输出五个算式
			System.out.print("\n");
			k = 0;
		}
		}		
	}	
	
	void  add() {            //随机生成加法算式
		int firstnumber;
		int secondnumber;
		int result;
			do {
				firstnumber = (int)(Math.random()*100);
				secondnumber = (int)(Math.random()*100);
				result = firstnumber + secondnumber;
			}while(result >= 100);
			System.out.print(firstnumber + "+" + secondnumber + "=" + result + "\t");
	}
		
	void subtraction() {                  //随机生成减法算式
		int firstnumber;
		int secondnumber;
		int result;				
			do {
				firstnumber = (int)(Math.random()*100);
				secondnumber = (int)(Math.random()*100);
				result = firstnumber - secondnumber;
			}while(result < 0);
			System.out.print(firstnumber + "-"  + secondnumber + "=" + result + "\t");		
	}
}
			     
 



			
		
		
		





