package src;

public class StringToInteger {
	/*
	Implement atoi to convert a string to an integer.

	Hint: Carefully consider all possible input cases. If you want
	a challenge, please do not see below and ask yourself what are 
	the possible input cases.

	Notes: It is intended for this problem to be specified vaguely
	(ie, no given input specs). You are responsible to gather all 
	the input requirements up front.
	*/
	public static void main(String[] args) {
		String sample = "   -1234";
		System.out.println(myAtoi(sample));
	}

	public static int myAtoi(String str) {
		int result = 0;
        if(str.length() == 0) return 0;
        str = str.trim();
        
        int sign = str.charAt(0) == '-' ? -1 : 1;
        if(str.charAt(0) == '-' || str.charAt(0) == '+') str = str.substring(1);
        System.out.println(str);
        for(int i = 0; i < str.length(); i++) {
        	int digit = str.charAt(i) - '0';
        	if(digit < 0 || digit > 9) break;
        	
        	if(Integer.MAX_VALUE/10 < result || 
        	   Integer.MAX_VALUE/10 == result && 
        	   Integer.MAX_VALUE %10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        	result = 10 * result + digit;
        }
        
        return result * sign;
    }
}
