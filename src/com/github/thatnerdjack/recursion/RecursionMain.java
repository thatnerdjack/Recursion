package com.github.thatnerdjack.recursion;

public class RecursionMain {
	
	static int factorialRecursive(int n) {
		if (n < 0) {
			System.err.println("Invalid argument");
		 	return -1;
		} else
			System.out.println("Recursively computing factorial of " + n);
		if (n == 0 || n == 1)
			return 1;
		else
			return n * factorialRecursive(n - 1);	
	}
	
	static int factorialLoop(int n) {
        int returnInt = n;
        if (n < 0) {
            System.err.println("Invalid argument");
            return -1;
        } else {
            System.out.println("Iteratively computing factorial of " + n);
            for(int i = n; i > 1; i--) {
                System.out.println(returnInt + " times " + (i - 1));
                returnInt = returnInt * (i - 1);
            }
            return returnInt;
        }
	}

	static int fibonacciLoop(int n) {
		if (n < 0) {
			System.err.println("Invalid argument");
		 	return -1;
		} else
			System.out.println("Iteratively computing Fibonacci " + n);
		
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
	
		// loop to compute fibonacci for n > 1; prev2 and prev1 contain the previous two
		// fibonacci numbers, the sum of which (answer) is the next fibonacci number
		int prev2 = 0;
		int prev1 = 1;
		int answer = 1;
		for (int i = 3; i <= n; i++) {
			prev2 = prev1;
			prev1 = answer;
			answer = prev2 + prev1;
		}
		return answer;
	}

	static int fibonacciRecursive(int n) {
		if (n < 0) {
			System.err.println("Invalid argument");
		 	return -1;
		} else {
            System.out.println("Recursively computing Fibonacci of " + n);

            if(n == 0) {
                return 0;
            } else if(n == 1) {
                return 1;
            }

            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);

        }
	}
	
	
	public static void main(String args[]) {
		System.out.println("10 factorial recursively is " + factorialRecursive(10));
		System.out.println("*********************************************");
		System.out.println("10 factorial iteratively is " + factorialLoop(10));
		System.out.println("*********************************************");
		System.out.println("Fibonnaci 10 iteratively is " + fibonacciLoop(10));	
		System.out.println("*********************************************");
		System.out.println("Fibonnaci 10 recursively is " + fibonacciRecursive(10));
	}
}
