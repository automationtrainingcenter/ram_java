package basics;

/*
Array is used to store collection of values of similar data type in continuous memory locations
Array size or length is static i.e. we can not change array size at run time.

1. easy to maintain
2. searching and sorting is easy

we have two types of arrays
1. one dimension arrays
2. two dimension arrays

1. One Dimension Array:
    It is used to store one row and multiple columns of data. 
    It is like 1 X N matrix.

   Syntax to declare 1D array:
        data_type[] var_name = new data_type[length];
        Note: here length represents number of values we can store in array
   eg:
        int[] marks = new int[6];

   Syntax to access data of a 1D array
   we can access data of an array using index numbers, index number starts with 0 and maximum
   index number is length of array - 1
        var_name[index] = value;
   eg:
        marks[0] = 19;

   Syntax to initialize a 1D array
        data_type[] var_name = {value1, value2, value3 .... valueN};
   eg:
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

   To find the length of an array (i.e. number of items in an array) we use length property
   eg: vowels.length will give 5

2. Two Dimension Array:
    It is used to store multiple rows and multiple columns of the data. It is like m X n
    matrix. It is an array of 1D array.

    Syntax to declare a 2D array
        data_type[][] var_name = new data_type[row_length][column_length];
    eg:
       int[][] m1 = new int[2][2];

    Syntax to access 2D array data
        var_name[row_index][column_index] = value;
    eg:
        m1[0][0] = 1;

    Syntax to initialize 2D array:
        data_type[][] var_name = {{r1c1, r1c2, r1c3... r1cN},
                                 {r2c1, r2c2, r2c3 ... r2cN},
                                 {r3c1, r3c2, r3c3 ... r3cN},
                                 .
                                 .
                                 .
                                 {rMc1, rMc2, rMc3 ... rMcN}};

        eg:
            int[][] m3 = {{1,2,3}, {4,5,6}, {7,8,9}}

     m3.length will give 3 (i.e. 3 1D arrays)
     m3[0] == {1,2,3}
     m3[0].length == 3
     m3[0][0] = 1
     m3[0][1] = 2
     m3[0][2] = 3

     m3[1] == {4,5,6}
     m3[1].length = 3
     m3[1][0] = 4
     m3[1][1] = 5
     m3[1][2] = 6

     m3[2] == {7,8,9}
     m3[2].length = 3
     m3[2][0] = 7
     m3[2][1] = 8
     m3[2][2] = 9
 */
public class ArraysDemo {

	public static void main(String[] args) {
		// declare a 1D array
		int[] marks = new int[6];

		// retrieve the values from array using index number
//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
//		System.out.println(marks[3]);
//		System.out.println(marks[4]);
//		System.out.println(marks[5]);

		// retrieve the values from array using normal for loop
		for (int i = 0; i < marks.length; i++) {
			System.out.println("at index " + i + " marks = " + marks[i]);
		}

		// store the values using index numbers
		marks[0] = 21;
		marks[1] = 20;
		marks[2] = 19;
		marks[3] = 23;
		marks[4] = 24;
		marks[5] = 18;

//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
//		System.out.println(marks[3]);
//		System.out.println(marks[4]);
//		System.out.println(marks[5]);

		// retrieve the data from the marks array using for each loop
		System.out.println("***********************");
		for (int subject : marks) {
			System.out.println(subject);
		}

		// initialise a 1D array
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		// to retrieve number of items in an array we can use length property
		System.out.println("no of items in vowels array = " + vowels.length);

		// retrieve the values from vowels array
//		System.out.println(vowels[0]);
//		System.out.println(vowels[1]);
//		System.out.println(vowels[2]);
//		System.out.println(vowels[3]);
//		System.out.println(vowels[4]);
//		System.out.println(vowels[5]);  
		// if index number is greater than or equal to the length of
		// array then we get array index out of bounds exception

		// retrieve the data from the vowels array using normal for loop
		for (int i = 0; i < vowels.length; i++) {
//			System.out.println("at index "+i+" vowel = "+vowels[i]);
			System.out.println(String.format("at index %d vowel = %c", i, vowels[i]));
		}

		// retrieve the data from the vowels array using for each loop
		for (char vowel : vowels) {
			System.out.println(vowel);
		}

		// 2D array
		// declare a 2D array
		int[][] m1 = new int[2][2];

		// assign values to the array
		// first row
		m1[0][0] = 1; // first column
		m1[0][1] = 2; // second column
		// second row
		m1[1][0] = 3; // first column
		m1[1][1] = 4; // second column

		// retrieve the values from 2D array
		// first row
		System.out.print(m1[0][0] + "\t"); // first column
		System.out.print(m1[0][1] + "\n"); // second column
		// second row
		System.out.print(m1[1][0] + "\t"); // first column
		System.out.print(m1[1][1] + "\n"); // second column

		// initialise a 2D array
		int[][] m2 = { { 0, 1, 2, 3 }, { 4, 5 }, { 7, 8, 9 } };

		// retrieve the values from 2D array
		// first row
//		System.out.print(m2[0][0]+" "); // first column
//		System.out.print(m2[0][1]+" "); // second column
//		System.out.print(m2[0][2]+"\n"); // third column
//		
//		// second row
//		System.out.print(m2[1][0]+" "); // first column
//		System.out.print(m2[1][1]+" "); // second column
//		System.out.print(m2[1][2]+"\n"); // third column
//		
//		// third row 
//		System.out.print(m2[2][0]+" "); // first column
//		System.out.print(m2[2][1]+" "); // second column
//		System.out.print(m2[2][2]+"\n"); // third column

		// retrieve data from the m2 array using normal for loop
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				System.out.print(m2[i][j] + " ");
			}
			System.out.println();
		}
		
		// retrieve data from the 2D array using for each loop
		for(int[] oneDArray: m2) {
			for(int num : oneDArray) {
				System.out.print(num+"\t");
			}
			System.out.println();
		}

		// initialise a 2D array
		int[][] m3 = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };

		// retrieve the length of m3
		System.out.println("length of m3 = " + m3.length);
		System.out.println("first array length i.e. m3[0] length = " + m3[0].length);
		System.out.println("second array length i.e. m3[1] length = " + m3[1].length);
		System.out.println("third array length i.e. m3[2] length = " + m3[2].length);

		// retrieve the data from the m3 array
		// first row (array)
//		System.out.print(m3[0][0]+"  "); // first column (item)
//		System.out.print(m3[0][1]+"  "); // second column (item)
//		System.out.print(m3[0][2]+"\n"); // first column (item)
//		
//		// second row (array)
//		System.out.print(m3[1][0]+"  "); // first column (item)
//		System.out.print(m3[1][1]+"\n"); // first column (item)
//		
//		// third row (array)
//		System.out.print(m3[2][0]+"  ");  // first column (item)
//		System.out.print(m3[2][1]+"  ");  // first column (item)
//		System.out.print(m3[2][2]+"  ");  // first column (item)
//		System.out.print(m3[2][3]+"\n");  // first column (item)

		for (int i = 0; i < m3.length; i++) {
			for (int j = 0; j < m3[i].length; j++) {
				System.out.print(m3[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int[] numbers : m3) {
			for(int number : numbers) {
				System.out.print(number+"  ");
			}
			System.out.println();
		}
		
		

	}

}
