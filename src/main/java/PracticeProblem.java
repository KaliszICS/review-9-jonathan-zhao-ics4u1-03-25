public class PracticeProblem {

	public static void main(String args[]) {

	}
	//q1
	public static int lettersToFive(String word, char letter) {
		int count = 0;
		int index = 0;
		while (index < word.length()) {
			if (word.charAt(index) == letter) {
				count++;
				
			}
			index++;
			if (count == 5){
				return index;
			}
		}
		return -1;
	}

	//q2
	public static int countLetter(String word, char letter) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == letter) {
				count++;
			}
		}
		return count;
	}

	//q3
	public static int oddSum(int num1, int num2) {
		int max = Math.max(num1, num2);
		int sum = 0;
		
			for (int i = Math.min(num1, num2); i <= max; i++){
				if (i % 2 != 0){
					sum +=i;
				}

		  }
		return sum;
	}
}
