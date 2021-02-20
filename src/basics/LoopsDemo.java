package basics;

import java.util.Scanner;

/*
Loop is a collection of statements which will execute repeatedly 
for certain number of times based on some condition.
In loops one repetition is known as iteration or increments also.
There are 4 loops in Java

1. while loop: used to execute a block of code based on some condition
2. do while loop: used to execute a block of code based on some condition
3. for loop: used to execute a block of code for certain number of time
4. for each loop: used to iterate over a collection of data like arrays, lists .. etc

while, do while and for loops contains mainly 3 parts
1. initialization
2. condition or expression
3. increment or decrement


1. while loop

initialize a variable
while(condition or expression){
    statements to repeat;
    increment or decrement initialized variable;
}

minimum number of iterations for while loop is 0

2. do while loop

initialize a variable
do{
    statements to repeat;
    increment or decrement initialized variable;
} while(condition or expression);

minimum number of iterations for do while loop is 1

3. for loop

for(initialization; condition or expression; increment or decrement){
    statements to repeat;
}


4. for each loop: retrieve the data from an array (collection)
for(array_data_type var_name : array_var_name){
    statements to repeat;
}


break: is used to terminate the loop based on some condition. Once break statement
is executed, then the other statements after the break statement within the loop
will not execute and also it won't repeat next iterations.

continue: is used to skip the current iteration. Once continue statement is executed,
then the other statements after the continue statement within the loop will not execute
but it will execute next iterations.


 */

public class LoopsDemo {

	public static void main(String[] args) {
		// while loop
		// print numbers from 1 to 10
		int i = 1; // initialization
		int end = 10;
		while (i <= end) /* condition */ {
			System.out.println(i); // statements
			i++; // increment
		}

		// do while loop
		int start = 1; // initilialize
		end = 10;
		do {
			System.out.println(start);
			start++;
		} while (start <= end);

		// for loop
		for (int j = 1, e = 10; j <= e; j++) {
			System.out.println(j);
		}

		// for each loop
		// to retrieve the data from the array
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int number : numbers) {
			System.out.println(number);
		}

		// read numbers from the console until we enter a 5 divisible
		// create an object Scanner class to read the numbers from the console
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("enter some number");
			num = sc.nextInt();
			System.out.println(String.format("number is %d", num));
		} while (num % 5 != 0);

		System.out.println("***************************");
		// break statement
		for (int x = 0; x < 10; x++) {
			if (x == 5) {
				break;
			}
			System.out.println(x);
		}

		System.out.println("***************************");
		// continue statement
		for (int x = 0; x < 10; x++) {
			if (x == 5) {
				continue;
			}
			System.out.println(x);
		}

		System.out.println("***************************");
		int l = -1;
		while (l < 11) {
			l++;
			if (l % 2 != 0) {
				continue;
			}
			System.out.println(l);
		}

		// verify a given number is prime or not
		System.out.println("enter a number to verify prime or not");
		int pr = sc.nextInt();
		boolean isPrime = true;
		for (l = 2; l <= pr / 2; l++) {
			if (pr % l == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(String.format("pr: %d is prime number", pr));
		} else {
			System.out.println(String.format("pr: %d is not prime number, it is divisible by %d", pr, l));
		}

		// print prime numbers until given number from 2
		for (int z = 2; z <= pr; z++) {
			boolean flag = true;
			for (l = 2; l <= z / 2; l++) {
				if (z % l == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(z+"\t");
			}
		}
		System.out.println();
		
		// read numbers from the console until we enter a prime number
		int number;
		do {
			System.out.println("enter some number");
			number = sc.nextInt();
			boolean flag = true;
			for (l = 2; l <= number / 2; l++) {
				if (number % l == 0) {
					System.out.println(String.format("number is %d", number));
					flag = false;
					break; // for loop
				}
			}
			if (flag) {
				break; // do while loop
			}
			
		} while (true);


	}

}
