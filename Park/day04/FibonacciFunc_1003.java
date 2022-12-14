package com.ssafy.fibonacci;

import java.util.Scanner;

/*
 
3
0
1
3

2
6
22

 */
public class FibonacciFunc_1003 {
	
	static int zero = 0;
	static int one = 0;
	public static void main(String[] args) {
		// 동적 계획법(Dynamic Programming) - DP
		// 어떤 주어진 문제를 작은문제로 쪼개서 풀어나감에 있어 반복되는 호출을 줄이는 방법
		
		int T = 0;
		int N = 0;
		
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		
		for(int i = 0; i < T ; i++) {
			zero = 0;
			one = 0;
			N = sc.nextInt();
			
			fibonacci(N);
			
			System.out.println(zero + " " + one);
		}
	}
	
	public static int fibonacci(int n) {
	    if (n == 0) {
	        zero++;
	        return 0;
	    } else if (n == 1) {
	    	one++;
	        return 1;
	    } else {
	        return fibonacci(n-1) + fibonacci(n-2);
	    }
	}

}
