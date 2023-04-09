import java.util.*;

class Solution {
    public String solution(String polynomial) {
      String[] arr = polynomial.split(" ");
    	
    	int x = 0;
    	int number = 0;
 
    	for (String string : arr) {
    		try {
				number += Integer.valueOf(string); 
			} catch (Exception e) {
				if(string.contains("x")) {
					try {
						x += Integer.valueOf((string.replace("x", "")));  
					} catch (Exception e2) {
						x += 1;
					}
				}
			}
    	}
    	
        if(x==0) {
    		return number+"";
    	}else if(number==0) {
    		return x==1 ? "x" : x+"x";
    	}else {
    		return x==1 ? "x + "+number : x+"x + "+number;
    	}
    }
}
