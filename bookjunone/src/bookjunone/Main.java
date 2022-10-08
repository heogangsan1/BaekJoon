package bookjunone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOne = sc.nextInt();
		int numberTwo = sc.nextInt();
		int numberThree = sc.nextInt();
		int result = 0;
		
		if(numberOne == numberTwo && numberOne == numberThree) {
			result += 10000 + (numberOne * 1000);
			System.out.println(result);
		}else if(numberOne == numberTwo){
			result += 1000 + (numberOne * 100);
			System.out.println(result);
		}else if(numberTwo == numberThree) {
			result += 1000 + (numberTwo * 100);
			System.out.println(result);
		}else if(numberOne == numberThree) {
			result += 1000 + (numberThree * 100);
			System.out.println(result);
			
		}else {
			if (numberOne != numberTwo && numberTwo != numberThree && numberOne != numberThree) {
				// 만약 a > b 라면
				if (numberOne > numberTwo) {
					// c > a > b 라면
					if (numberThree > numberOne) {
						result = numberThree;
					} 
					// a > (b, c)
					else {
						result = numberOne;
					}
				}
				// b > a 라면	
				else {
					// c > b > a 라면
					if (numberThree > numberTwo) {
						result = numberThree;
					}
					// b > (a, c)
					else {
						result = numberTwo;
					}
				}
				System.out.println(result * 100);
			}
		}
		
	}

}
