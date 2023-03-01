package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương: ");
        int num = input.nextInt();
        System.out.printf("Các số nguyên tố nhỏ hơn %d là:%n ", num);
        for (int i = 2; i < num; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        input.close();
    }
}
