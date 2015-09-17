//George Kanakis Practice set 2 
//CISC 181-060

package MainPackage;

public class MyInteger {
	private int value;

	public int getValue() {
		return value;
	}

	public MyInteger(int value) {
		this.value = value;
	}

	public boolean isEven() {
		if (this.value % 2 == 0) {
			return true;
		} else {
			return false; }
		}
		
	public boolean isOdd() {
		if (this.value % 2 == 1) {
			return true; }
		else {
			return false; }
	}
	public boolean isPrime() {
		int a = this.value;
		int d = 2;
		while ( d < a) {
			if ( typeof(a % d) != int){
			d = d + 1;
			return false;
			}
			else { 
				return true;
			}
		}}
		

	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true; }
		else {
			return false; }
		
		}
	public static boolean isOdd(int value) {
		if (value % 2 == 1) {
			return true;
		}
		else {
			return false; }}
		
	public static boolean isPrime(int value) {
		int a = value;
		int d = 2;
		while ( d < a) {
			if ( typeof(a % d) != 'int'){
			d = d + 1;
			return false;
			}
			else { 
				return true;
			}
	}

}
	public static boolean isEven(MyInteger myInt) {
		if (myInt.getValue() % 2 == 0){
			return true; }
		else {
			return false; }
		
	}
	public static boolean isOdd(MyInteger myInt) {
		if (myInt.getValue() % 2 == 1){
			return true; }
		else {
			return false; }
		
	}
	public static boolean isPrime(MyInteger myInt) {
		int d = 2;
		while ( d < myInt.getValue()) {
			if ( typeof(myInt.getValue() % d) != 'int'){
			d = d + 1;
			return false;
			}
			else { 
				return true;
			}
		}
		}
	public boolean equals(int value) {
		int a = value;
		if (a == this.value){
			return true;
		}
		else {
			return false; }
	}
		public boolean equals(MyInteger value) {
			int a = value; {
			if (a == this.value); 
				return true;
			}
			else {
				return false;}
		}
	
	public static int parsreInt(char[] array) {
		int a = 0;
		int b = 0;
		for (int n = 0; len(array) -1; n++) {
			if (typeof(array[a]) == 'number'); {
				b = b + array[a];
				a++;
			}
			else {
				a++; }
			}
		}
	public static int paresInt(String myString) {
		int a = 0;
		int b = 0;
		if (typeof(myString[a]) == 'number'); {
			Integer.parseInt(myString);
			b = b + myString[a];
			a++}
		else {
			a++}
				
	}

}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	