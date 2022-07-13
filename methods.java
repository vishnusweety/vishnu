package methods;

public class methods {

	public static void main(String[] args) {
		
		int num1 = 24;
		int num2 = 15;
		 
		int answer1;
		int answer2;
		int answer3;
		int answer4;
		
		answer1= multNumbers(num1);
		System.out.println("when we multiply num1 by 7 we get:"+answer1);
		answer2 = addNumbers(num1,num2);
		System.out.println("when we add num1 and num2,we get:"+answer2);
		answer3 = subNumbers(num1,num2);
		System.out.println("when we sub num1 and num2,we get:"+answer3);
		answer4 = divNumbers(num1,num2);
		System.out.println("when we div num1 and num2, we get:"+answer4);
		
	
		
		
	}
	public static int multNumbers(int a) {
		int ans = a *15;
		return ans;
	}
	public static int addNumbers( int x,int y) {
		int ans = x + y;
		return ans;
	}
    public static int subNumbers( int r, int s) {
    	int ans= r - s;
    	return ans;
    }
    public static int divNumbers( int p, int q) {
    	int ans =p/q;
    	return ans;
    	
    }
}
