package nju.edu.alex.bitUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int number=Integer.parseInt(reader.readLine());
		BitUtil bitUtil=new BitUtil(number);
		System.out.println(bitUtil.absolute()+" "+bitUtil.negate()+" "+bitUtil.isOdd()+" "+bitUtil.isPositive());
		int a=0,b=3;
		System.out.println(a+" "+b);
		bitUtil.swap(a, b);
		bitUtil.PrimeNumbers(1000);
	}
}
