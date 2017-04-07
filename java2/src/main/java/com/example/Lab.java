package com.example;

public class Lab {

	/*
	  1. Return the nth fibonacci number
	  f(0) = 0
	  f(1) = 1
	  f(10) = 55
	*/
	public static int fibonacci(int n) {

		int a = 0;
		int	b = 1;
		int c;
		if (n == 0)
			return a;
		for (int i = 2; i<=n; i++){

			c = a+b;
			a = b;
			b = c;

		}

		return b;
	}

	/*
	  2. Sort array of integers
	  f([2,4,5,1,3,1]) = [1,1,2,3,4,5]
	  Don't use built-in sort() method... that would be lame.
	*/
	public static int[] sort(int[] array) {


		int temp;

		for (int i=0; i<array.length; i++){

			for (int j=i+1; j<array.length;j++) {

				if (array[i] > array[j]){

					temp = array[i];
					array[i] = array[j]	;
					array[j] = temp;
				}

			}

		}
		return array;
	}

	/*
	  3. Return the factorial of n
	  f(0) = 1
	  f(1) = 1
	  f(3) = 6
	*/
	public static int factorial(int n) {

	    if (n == 0)
        {return 1;}

        return n * factorial(n-1);

	}

	/*
	  4. Rotate left
	  Given array, rotate left n times and return array
	  f([1,2,3,4,5], 1) = [2,3,4,5,1]
	  f([1,2,3,4,5], 6) = [2,3,4,5,1]
	  f([1,2,3,4,5], 3) = [4,5,1,2,3]
	*/
	public static int[] rotateLeft(int[] array, int n) {

	    int timeRotated = 0;
	    while (timeRotated < n){

	        int temp = array[0];
	        for (int i = 0; i<array.length-1;i++){
	            array[i]=array[i+1];
            }

            array[array.length-1] = temp;
            timeRotated++;
        }


	    return array;
	}

	/*
	  5. Balanced Brackets
	  A bracket is any one of the following: (, ), {, }, [, or ]
	  The following are balanced brackets:
	    ()
	    ()()
	    (())
	    ({[]})
	  The following are NOT balanced brackets:
	  (
	  )
	  (()
	  ([)]
	  Return true if balanced
	  Return false if not balanced
	*/
	public static boolean balancedBrackets(String bracketsString) {

	    return false;
	}



}
