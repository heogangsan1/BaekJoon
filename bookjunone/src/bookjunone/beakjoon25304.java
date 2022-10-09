package bookjunone;

import java.util.Scanner;

public class beakjoon25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int total = sc.nextInt();
	int count = sc.nextInt();
	int multiplication = 0;
	int add = 0;
	int[] price = new int[count];
	int[] quantity = new int[count];
	
	for (int i = 0; i < count; i++) {
		price[i] = sc.nextInt();
		quantity[i] = sc.nextInt();
		multiplication = price[i] * quantity[i];
		add += multiplication;
	}
	if(add == total) {
		System.out.println("Yes");
	}else {
	System.out.println("No");
	}

	}

}
