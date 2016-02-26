package base;

public class MyInteger {
	MyInteger(){
		
	}
	
	private int iValue = 6;
	private int i; 
	
	public int getValue(){
		return iValue;
	}
	
	public boolean isEven(int value){
		if (value % 2 == 0){
			return true;
			}
		else{
			return false;
			}
		}
	public boolean isOdd(int value){
		return !isEven(value);
		}
	public boolean isPrime(int value) {
		for (i=2; 2*i<value; i++);{
			if (i%value == 0);{
				return true;
			}
		}
		return false;
	}
	
	public boolean myIsEven(){
		return isEven(iValue);
	}
	public boolean myIsOdd(){
		return isOdd(iValue);
	}
	public boolean myIsPrime(){
		return isPrime(iValue);
	}

	
	
}