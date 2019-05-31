package com.biz.for_each;

public class For_03 {

	public static void main(String[] args) {

		int intSum = 0;
		int intE = 1;
		intSum = intSum + intE; // 1		
		
		intE++;
		intSum = intSum + intE; // 1+2

		intE++;
		intSum = intSum + intE; // 1+2+3

		intE++;
		intSum = intSum + intE; // 1+2+4

		intSum = 0;
		for(int i = 2; i <= 10 ; i+=2){
		System.out.println( i );
		//intSum = intSum + i;
		intSum += i;
	}

		System.out.println(intSum);
		intSum=0;
		// for를 이용해서 i값이 2,4,6,8,10 만 나타나도록
		for(int i = 2; i <=10; i+=2) {
			intSum +=i;
		}
		
		System.out.println(intSum);

		intSum=0;
		// for를 이용해서 i값이 2,4,6,8,10 만 나타나도록
		for(int i = 1; i <=10; i+=2) {
			intSum +=i;
		
	}
		
		System.out.println("홀수의 합:" + intSum);
		
		for(int i = 1; i<100; i++);
		
		for(int i = 1; i<100; i++) {
			for(long j = 0; j < 1000000000000000l; j++) {
				System.out.println(i);
				
				
				
			}
			
			
			
		}
			
			
			
			
		}

	}
	
