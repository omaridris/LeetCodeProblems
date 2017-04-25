package src;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {
	/*
	Determine whether an integer is a palindrome.
	Do this without extra space.
	*/
	public static void main(String[] args) {
		int sample1 = 12345;
		int sample2 = 12321;
		
		System.out.println("Sample1 Expected: false");
		System.out.println("Sample1 Received: " + isPalindrome(sample1));
		System.out.println("Sample2 Expected: true");
		System.out.println("Sample2 Received: " + isPalindrome(sample2));
	}
	
	public static boolean isPalindrome(int x) {
		List<Integer> nums = new ArrayList<Integer>();
        int result = 0;
        
        int temp = x;
        while(temp / 10 != 0) {
            nums.add(temp % 10);
            temp = temp / 10;
        }
        nums.add(temp);
        
        int pow = 0;
        for(int i = nums.size() - 1; i >= 0; i--) {
            result = result + (int) (Math.pow(10, pow) * nums.get(i));
            pow++;
        }
        
        if(x < 0) {
            result *= -1;
        }
        
        return (result == x);
	}
}
