package SumOfDivisorOfNo;

import java.util.Scanner;

public class MyCalculator implements AdvArithmetic {

	@Override
	public int divisorSum(int n) {
		int divisorSum  =0;
		for(int i=n;i>=1;i--) {
			if(n%i==0)
				divisorSum  = divisorSum  + i;
		}
		return divisorSum ;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any No: ");
		int n = sc.nextInt();
		MyCalculator mc = new MyCalculator();
		System.out.print("divisor_sum of "+n+" =");
		System.out.println(mc.divisorSum(n));
	}

}
