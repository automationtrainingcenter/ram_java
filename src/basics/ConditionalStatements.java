package basics;

import java.util.Scanner;

/*
Conditional statement is a statement (line of code) which contains either
conditional operator or combination of conditional and logical operators 
using if keyword

These are used to execute a block of statements based on some condition or expression

condition means any one conditional operator
expression means combining conditions using logical operators

we have 5 types of conditional operators in Java.
1. simple if
2. if else
3. else if ladder
4. nested if
5. switch case

* ******** if ************
* if(expression){
* 		statements
* }
* if the expression true then the statements inside if block will be executed.
*
*
* ************ if-else ************
* if(expression){
* 		statements;
* }else{
* 		statements;
* }
* if the expression is true the statements inside if block will be executed else statements
* inside else block will be executed
*
*
* ************ else if ladder ************
* if(expression 1){
* 		statements;
* }else if(expression 2){
* 		statements;
* }else if(expression 3){
* 		statements;
* }
* .
* .
* .
* }else if(expression n){
* 		statements;
* }else{
* 		statements;
* }
* if expression 1 is true it will execute statements inside if block else if will expression 2 and
* if expression 2 is true it will execute statements inside expression 2 else if block else if will
* verify next expression. if all the expressions are false then it will execute statements inside
* else block
*
*
* ************ nested if ************
* if(expression 1){
* 		if(expression 2{
* 			statements;
* 		}else{
* 			statements;
* 		}
* }else{
* 		statements;
* }
*
*
* ************ switch case: it will work based on value ************
* switch(Value){
* 		case value1:
* 			statements;
* 			break;
* 		case value2:
* 			statements;
* 			break;
* 		.
* 		.
* 		.
* 		case valueN:
* 			statements;
* 			break;
* 		default:
* 			statements;
* }
*
*
*/

public class ConditionalStatements {

	public static void main(String[] args) {
		// simple if example
		// verify a given number is positive
		int num = 19;

		if (num > 0) {
			System.out.println("inside simple if");
			System.out.println("num is positive");
		}

		System.out.println("after simple if");

		// if else example
		// verify a given number is even or odd
		int num1 = 20;
		if (num1 % 2 == 0) {
			System.out.println("inside if block");
			System.out.println("num1 is even");
		} else {
			System.out.println("inside else block");
			System.out.println("num1 is odd");
		}
		Scanner sc = new Scanner(System.in);

		// facebook scenario
		System.out.println("enter facebook username");
		String fuser = sc.next();
		System.out.println("enter facebook password");
		String fpass = sc.next();
		if (fuser.equalsIgnoreCase("surya") && fpass.equals("password")) {
			System.out.println("home page");
		} else {
			System.out.println("invalid credentials");
		}

		// nested if example
		// gmail scenario
		System.out.println("enter username");
		String guser = sc.next();
		if (guser.equalsIgnoreCase("surya")) {
			System.out.println("enter password");
			String gpass = sc.next();
			if (gpass.equals("password")) {
				System.out.println("inbox");
			} else {
				System.out.println("invalid password");
			}

		} else {
			System.out.println("user does not exist");
		}

		// else if ladder example
		// grade system
		int per = 35;

		if (per >= 70) {
			System.out.println("Congratulations... passed in distinction");
		} else if (per >= 60) {
			System.out.println("passed in first class");
		} else if (per >= 50) {
			System.out.println("passed in second class");
		} else if (per >= 40) {
			System.out.println("passed in third class");
		} else {
			System.out.println("Failed");
		}

	}

}
