package bookjunone;

import java.util.Scanner;

public class baekjoon8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int add = 0;
		
		
		
		
		for (int i = 1; i < number + 1; i++) {
			add += i * 1;
			
		}
		System.out.println(add);

	}

}
