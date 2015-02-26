package MainPackage;

public class MyInteger {

	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public boolean isEven() {
		if (this.value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOdd() {
		return (this.value % 2 == 1);
	}

	public boolean isPrime() {
		if (this.value == 0) {
			return true;
		}
		for (int i = 2; i <= Math.sqrt(Math.abs(this.value)); i++) {
			if (Math.abs(this.value) % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(int num) {
		return (num % 2 == 1);
	}

	public static boolean isPrime(int num) {
		if (num == 0) {
			return true;
		}
		for (int i = 2; i <= Math.sqrt(Math.abs(num)); i++) {
			if (Math.abs(num) % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(MyInteger num) {
		if (num.value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(MyInteger num) {
		return (num.value % 2 == 1);
	}

	public static boolean isPrime(MyInteger num) {
		if (num.value == 0) {
			return true;
		}
		for (int i = 2; i <= Math.sqrt(Math.abs(num.value)); i++) {
			if (Math.abs(num.value) % i == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean equals(int num) {
		return (num == this.value);
	}

	public boolean equals(MyInteger num) {
		return (num.value == this.value);
	}

	public static void parseInt(char[] array) {
		int[] array1 = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			int num = array[i];
			array1[i] = num;
		}
	}
	public static void parseInt(String word){
		Integer.parseInt(word);
	}
	
	
}























