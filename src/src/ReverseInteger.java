package src;

public class ReverseInteger {
	/*
	Reverse digits of an integer.

	Example1: x = 123, return 321
	Example2: x = -123, return -321
			
	The input is assumed to be a 32-bit signed integer. 
	Your function should return 0 when the reversed integer 
	overflows.
	*/
	public static void main(String[] args) {
		int x = 1534236469;
		System.out.println("Reverse of 1534236469 is " + reverse(x));
		
		int y = -123;
		System.out.println("Reverse of -123 is " + reverse(y));
	}
	
	public static int reverse(int x) {
        long reverse = 0;
        while(x != 0) {
        	reverse = reverse * 10 + x % 10;
        	x /= 10;
        	if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) return 0;
        }
        
        return (int) reverse;
    }
}
