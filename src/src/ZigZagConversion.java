package src;

public class ZigZagConversion {
	/*
	The string "PAYPALISHIRING" is written in a zigzag pattern on a 
	given number of rows like this: (you may want to display this
	pattern in a fixed font for better legibility)
	
	P   A   H   N
	A P L S I I G
	Y   I   R
	
	And then read line by line: "PAHNAPLSIIGYIR"
		
	Write the code that will take a string and make this
	conversion given a number of rows:
	convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
	*/
	public static void main(String[] args) {
		String sample = "PAYPALISHIRING";
		System.out.println(convert(sample, 3));
	}
	
	public static String convert(String s, int rows) {
        if(rows == 1) {
            return s;
        }
        
        int len = s.length();
        String[] strings = new String[rows];
        for(int i = 0; i < rows; i++) {
            strings[i] = "";
        }
        
        String result = "";
        
        int row = 0;
        boolean down = false;
        
        for(int i = 0; i < len; i++) {
            strings[row] += (s.charAt(i));
            
            if(row == rows - 1) {
                down = false;
            } else if(row == 0) {
                down = true;
            }
            
            if(down) {
                row++;   
            } else {
                row--;
            }
        }
        
        for(int i = 0; i < rows; i++) {
            result += strings[i];
        }
        
        return result;
    }
}
