package FirstLesson;

public class AmountOfDivider {
	public static void main(String[] args) {
		
		int number = 0;
		int max = 0;
		
		for(int i = 0; i < 10_000; i++){
			
			int temp = i;
			int tempMax = 0;
			
			for(int j = 1; j <= temp; j++){
				if(temp % j == 0){
					tempMax += j;
				}
			}
			
			if(tempMax > max){
				max = tempMax;
				number = temp;
			}
			
		}
		
		System.out.println("Number " + number + " has the biggest amount of divider = " + max);

	}
}
