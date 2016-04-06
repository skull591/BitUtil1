package nju.edu.alex.bitUtil;

public class BitUtil {
	private int number;
	
	public BitUtil(int number){
		this.number=number;
	}
	
	//判断正负
	public boolean isPositive(){
		return ((number>>31)^1)==1;
	}
	
	//判断奇偶
	public boolean isOdd(){
		return (number & 1)==1;
	} 
	
	
	//求绝对值
	public int absolute() {
		return (number^(number>>31))-(number>>31);
	}
	
	//取反
	public int negate(){
		return (~number)+1;
	}
	
	//交换两数
	public void swap(int a,int b){
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+" "+b);
	}
	
	public int getNumber(){
		return number;
	}
	
	public void setNumber(int number){
		this.number=number;
	}
	
	public void PrimeNumbers(int uperBound){
		int len=uperBound/32+1;
		int[] list=new int[len];
		for (int i = 2; i <= uperBound; i++) {
			if ((list[i/32]&(1<<(i%32)))==0) {
				System.out.println(i);
			}
			for (int j = 2*i; j <= uperBound; j=j+i) {
				list[j/32]=(list[j/32]|(1<<(j%32)));
			}
		}
	}
}
