package coding_bat;

/**
 * Coding Bat Challenges.
 * @author kevinmora
 */
public class Challenge {

	public static void main(String[] args) {
		// I added main in case you wanted to
		// call the methods here and test them.
	}

	/**
	 * Returns the number of times that the string 
	 * "hi" appears anywhere in the given string.
	 */
	public int countHi(String str) {
		int pos = str.indexOf("hi"); 
		int count = 0;
		
		while(pos != -1) {
			count++;
			pos = str.indexOf("hi", pos + 1);
		}
		return count;
	}
	
	/**
	 * Given two strings, return true if either of the 
	 * strings appears at the very end of the other string, 
	 * ignoring upper/lower case differences (in other words, 
	 * the computation should not be "case sensitive"). 
	 * 
	 * NOTE: str.toLowerCase() returns the 
	 * LowerCase version of a string.
	 */
	public boolean endOther(String a, String b) {
		int aLen = a.length();
		int bLen = b.length();
		String end, temp;
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		if(aLen >= bLen) {
			end = a.substring(aLen - bLen);
			temp = b;
		} else {
			end = b.substring(bLen - aLen);
			temp = a;
		}
		return (end.equals(temp));
	}
	
	/**
	 * We'll say that a String is xy-balanced if for all 
	 * the 'x' chars in the string, there exists a 'y' 
	 * char somewhere later in the string. 
	 * 
	 * - So "xxy" is balanced, but "xyx" is not. 
	 * - One 'y' can balance multiple 'x's. 
	 * - Return true if the given string is xy-balanced.
	 */
	public boolean xyBalance(String str) {
		int len = str.length() - 1;
		char ch;
		
		for(int i = len; i >= 0; i--) {
			ch = str.charAt(i);
			if(ch == 'x')
				return false;
			else if(ch == 'y')
				return true;
		}
		return true;  
	}
	
	/**
	 * Given a string and an int n, return a string made of 
	 * the first n characters of the string, followed by the 
	 * first n-1 characters of the string, and so on. 
	 * 
	 * You may assume that n is between 0 and the length of 
	 * the string, inclusive (i.e. n >= 0 and n <= str.length()).
	 */
	public String repeatFront(String str, int n) {
		StringBuilder stbuild = new StringBuilder((n * n + n)/2);
		for(int i = n; i >= 1; i--) {
			for(int k = 0; k < i; k++)
				stbuild.append(str.charAt(k));
		}
		return stbuild.toString();
	}

	/**
	 * Given a string, does "xyz" appear in the middle of the string? 
	 * To define middle, we'll say that the number of chars to the left 
	 * and right of the "xyz" must differ by at most one.
	 */
	public boolean xyzMiddle(String str) {
		int len = str.length();
		int mid;
		
		if(len < 3)
			return false;
		mid = len/2;
		
		if(len%2 == 0) {
			if(str.charAt(mid) == 'y')
				return(str.charAt(mid-1) == 'x' && str.charAt(mid+1) == 'z');
			if(str.charAt(mid-1) == 'y')
				return(str.charAt(mid-2) == 'x' && str.charAt(mid) == 'z');
			return false;
		}
		// len%2 != 0
		else if(str.charAt(mid) == 'y')
				return(str.charAt(mid-1) == 'x' && str.charAt(mid+1) == 'z');
		return false;
	}
	
	/**
	 * Given a string, compute a new string by moving the first char 
	 * to come after the next two chars, so "abc" yields "bca".
	 * Repeat this process for each subsequent group of 3 chars, 
	 * so "abcdef" yields "bcaefd". 
	 *  
	 * Ignore any group of fewer than 3 chars at the end.
	 */
	public String oneTwo(String str) {
		StringBuffer result = new StringBuffer(str.length());
		for(int i = 0; i < str.length() - 2; i += 3) {
			result.append(str.substring(i+1, i+3) + str.substring(i, i+1));
		}
		return result.toString();
	}
	
	/**
	 * Given a string and a non-empty word string, 
	 * return a version of the original String where 
	 * all chars have been replaced by pluses ("+"), 
	 * except for appearances of the word string 
	 * which are preserved unchanged.
	 */
	public String plusOut(String str, String word) {
		int len = str.length();
		int wLen = word.length();
		int pos = str.indexOf(word);
		int i = 0;
		
		StringBuilder stbuild = new StringBuilder(len);
		while(pos != -1) {
			while(i < pos) {
				stbuild.append('+');
				i++;
			}
			stbuild.append(word);
			i = pos + wLen;
			pos = str.indexOf(word, i);
		}
		
		for(; i < len; i++) {
			stbuild.append('+');
		}
		return stbuild.toString();
	}
	
	/**
	 * Given a string and a non-empty word string, return a 
	 * string made of each char just before and just after 
	 * every appearance of the word in the string. 
	 * 
	 * Ignore cases where there is no char before or after the word, 
	 * and a char may be included twice if it is between two words.
	 */
	public String wordEnds(String str, String word) {
		int len = str.length();
		int wLen = word.length();
		int pos = str.indexOf(word);
		int i = 0;
		
		StringBuilder stbuild = new StringBuilder(len);
		while(pos != -1) {
			i = pos + wLen;
			if(pos >= 1)
				stbuild.append(str.charAt(pos-1));
			if(i < len)
				stbuild.append(str.charAt(pos+wLen));
			pos = str.indexOf(word, i);	
		}
		return stbuild.toString();
	}
}