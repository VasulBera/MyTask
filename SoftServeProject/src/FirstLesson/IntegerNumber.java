package FirstLesson;

public class IntegerNumber {

	private int n;

	public IntegerNumber(int n) {
		this.n = n;
	}

	public int squere() {
		return n * n;
	}

	public boolean containNumber3() {

		int squereN = squere();

		while (squereN != 0) {
			int temp = squereN % 10;
			if (temp == 3) {
				return true;
			}
			squereN /= 10;
		}
		return false;

	}

	public int reverseN() {

		int temp = n;
		int result = 0;

		while (temp != 0) {
			result *= 10;
			result += temp % 10;
			temp /= 10;
		}
		return result;
	}

	public static void main(String[] args) {

		IntegerNumber myNumber = new IntegerNumber(456587);
		
		boolean isContain = myNumber.containNumber3();
		System.out.println("Does it have number 3?  - " + isContain );
		
		int reverceOrder = myNumber.reverseN();
		System.out.println("Reverce order of number = " + reverceOrder);
		
		

	}
}
