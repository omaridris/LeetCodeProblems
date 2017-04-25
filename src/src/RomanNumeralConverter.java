package src;

import java.util.HashMap;

public class RomanNumeralConverter {
	/*
	 Given an integer, convert it to a Roman numeral.
	 Given a Roman Numeral, convert it to an integer.
	 Input is guaranteed to be within the range from 1 to 3999.
	 I = 1
	 V = 5
	 X = 10
	 L = 50
	 C = 100
	 D = 500
	 M = 1000
	 */
	public static void main(String[] args) {
		int sample1 = 1;
		int sample2 = 3999;
		
		System.out.println("Sample1 Expected: I");
		System.out.println("Sample1 Received: " + intToRoman(sample1));
		System.out.println("Sample2 Expected: MMMCMXCIX");
		System.out.println("Sample2 Received: " + intToRoman(sample2));
		
		String sample3 = "MMMCMXCIX";
		String sample4 = "I";
		
		System.out.println("Sample3 Expected: 3999");
		System.out.println("Sample3 Received: " + romanToInt(sample3));
		System.out.println("Sample4 Expected: 1");
		System.out.println("Sample4 Received: " + romanToInt(sample4));
	}
	
	public static String intToRoman(int num) {
		String result = "";
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "IX");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(1, "I");
		
		while(num != 0) {
			int highestDecimal = findHigestDecimal(num);
			result += map.get(highestDecimal);
			num -= highestDecimal;
		}
		
		return result;
	}
	
	public static int romanToInt(String s) {
		int sum = 0;
        if(s.indexOf("IV") != -1){ sum -= 2;}
        if(s.indexOf("IX") != -1){ sum -= 2;}
        if(s.indexOf("XL") != -1){ sum -= 20;}
        if(s.indexOf("XC") != -1){ sum -= 20;}
        if(s.indexOf("CD") != -1){ sum -= 200;}
        if(s.indexOf("CM") != -1){ sum -= 200;}
        
        char c[] = s.toCharArray();
        
        for(int count = 0; count <= s.length() - 1; count++){
            if(c[count] == 'M') sum += 1000;
            if(c[count] == 'D') sum += 500;
            if(c[count] == 'C') sum += 100;
            if(c[count] == 'L') sum += 50;
            if(c[count] == 'X') sum += 10;
            if(c[count] == 'V') sum += 5;
            if(c[count] == 'I') sum += 1;
        }
   
        return sum;  
	}
	
	private static int findHigestDecimal(int num) {
		if(num < 4) {
			return 1;
		} else if(num < 5) {
			return 4;
		} else if(num < 9) {
			return 5;
		} else if(num < 10) {
			return 9;
		} else if(num < 40) {
			return 10;
		} else if(num < 50) {
			return 40;
		} else if(num < 90) {
			return 50;
		} else if(num < 100) {
			return 90;
		} else if(num < 400) {
			return 100;
		} else if(num < 500) {
			return 400;
		} else if(num < 900) {
			return 500;
		} else if(num < 1000) {
			return 900;
		} else {
			return 1000;
		}
	}
}
