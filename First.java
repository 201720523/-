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
		for(int i = 0; i < 50; i ++) {                             //������ɼӷ����߼�����ʽ
			judge = (int)(Math.random()*2);
			if(judge == 1) {
			    first.add();
			}
			else
			{
				first.subtraction();
			}
		k++;
		if(k == 5) {                                            //ÿ����������ʽ
			System.out.print("\n");
			k = 0;
		}
		}		
	}	
	
	void  add() {            //������ɼӷ���ʽ
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
		
	void subtraction() {                  //������ɼ�����ʽ
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
			     
 



			
		
		
		





