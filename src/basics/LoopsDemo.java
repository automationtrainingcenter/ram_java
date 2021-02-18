package basics;
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
		int i = 11; // initialization
		int end = 10;
		while (i <= end) /* condition */ {
			System.out.println(i); // statements
			i++; // increment
		}
		
		
		// do while loop
		int start = 11; // initilialize
		end = 10;
		do {
			System.out.println(start);
			start++;
		} while(start <= end);
		
		

	}

}