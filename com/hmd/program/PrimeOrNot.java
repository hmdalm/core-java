package com.hmd.program;

public class PrimeOrNot {
	static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i < n; i++)
			if (n % i == 0) {
				System.out.println(i);
				return false;
			}
		return true;
	}

	public void primelogic() {
		int ar[] = { 10, 12, 3, 13, 11, -1, 6, 1, 17, 5, 2 };
		

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] <= 1)
				System.out.println("Not a prime number"+ar[i]);
				
			for (int j = 2; j < ar[i]; j++)
				if (ar[i] % j == 0) {
					System.out.println("not prime number"+ar[i]);
					break;
				}
		}

	}

	public static void main(String args[]) {
		if (isPrime(13))
			System.out.println(" true");
		else
			System.out.println(" false");
		if (isPrime(25))
			System.out.println(" true");
		else
			System.out.println(" false");
		System.out.println("_______logic_______");
		PrimeOrNot obj = new PrimeOrNot();
		obj.primelogic();
	}
}
