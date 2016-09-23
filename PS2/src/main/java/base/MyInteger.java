package base;
//Created by Kevin Doak
public class MyInteger {

	int iValue; 
	MyInteger( int value ){ //Establishing MyInteger constructor
		iValue = value;
	}
	public int getiValue() { //getter for iValue
		return iValue;
	}
	
	// Methods to handle an integer input.
	static boolean isEven (int value){ //returns true if integer input is even.
		if (value%2 == 0){
			return true;
		}
		else{ 
			return false;
		}
	}
	static boolean isOdd (int value){ //returns true if integer input is odd.
		if (value%2 == 1){
			return true;
		}
		else{
			return false;
			}
	}
	static boolean isPrime (int value){ //returns true if integer input is a prime.
		for (int i=2; i < value/2; i++){
			if(value%i == 0){
				return false;}
			}
		return true;	
	}
	public boolean equals (int value){ //returns true is integer input matches iValue.
		return (iValue == value);
	}
	
	// Methods to handle iValue
	public boolean isEven(){ //returns true if iValue is even.
		return isEven(iValue);
	}
	public boolean isOdd (){ //returns true if iValue is odd.
		return isOdd(iValue);
	}
	public boolean isPrime (){ //returns true if iValue is a prime.
		return isPrime(iValue);	
	}
	
	// Methods to handle the MyInteger constructor.
	public static boolean isEven (MyInteger value){ //returns true if MyInteger is even.
		return value.isEven();
	}
	public static boolean isOdd (MyInteger value){ //returns true if MyInteger is odd.
		return value.isOdd();
	}
	public static boolean isPrime (MyInteger value){ //returns true if MyInteger is a prime.
		return value.isPrime();
	}
	public boolean equals(MyInteger value){ //returns true if MyInteger iValue matches another iValue.
		return equals(value.getiValue());
	}




}