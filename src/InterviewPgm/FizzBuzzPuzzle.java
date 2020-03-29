package InterviewPgm;

public class FizzBuzzPuzzle {

	public static void main(String[] args) {
		
		//if num is divisible by 3;-->fizz,,num 3
		//if num is divisible by 5;-->Bizz...num 5
		//if num is divisible by 3 & 5;-->FizzBizz,,,,num 15
		int num=3;
		if(num%3 ==0&&num%5==0) {
			System.out.println("FIzzBizz");
		}
		else if (num % 5==0) {
			System.out.println("Bizz");
		}
		else if (num% 3==0) {
			System.out.println("Fizz");
		}
		else {
			System.out.println("enter correct no");
		}
	}

}
