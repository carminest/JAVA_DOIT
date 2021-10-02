package study;

import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		Scanner stnIn = new Scanner(System.in);
		System.out.println("세 정수의 최대값을 구합니다.");
		int a = stnIn.nextInt();
		int b=stnIn.nextInt();
		int c =stnIn.nextInt();
		int max = a;
		if(b>max) {max = b;};
		if(c>max) {max = c;};
		
		System.out.println("최대값 :" + max);
	}

}