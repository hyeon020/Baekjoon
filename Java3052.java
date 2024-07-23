package baekjoon;

import java.util.Scanner;

public class Java3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[10];
		int count = 0;
		
		for(int i=0; i<10; i++) {
			num[i] = sc.nextInt() % 42;
		}
		
		for(int i=0; i<10; i++) {
			boolean check = true;
			for(int j=0; j<i; j++) {
				if(num[i] == num[j])
					check = false;
			}
			if(check) count++;
		}
		System.out.print(count);
	}

}
