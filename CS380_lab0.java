package packagetest;

public class CS380_lab0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse a number
		//set int variables that store a number to be reversed and store the result
		int givenNum = 12345;
		int resultNum = 0;
						
		while(givenNum > 0) {
			//int variable that stores remainder
			int remainder = givenNum % 10;
			//add remainder to resultNum
			resultNum = resultNum * 10 + remainder;
			//update givenNum for next number
			givenNum = givenNum / 10;
		}
		//show the result
		System.out.println(resultNum);
	}

}
