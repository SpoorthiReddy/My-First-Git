package stringmanipulations;

public class StringUtils {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Spoorthi ";
		String r= "Reddy";
		String t= "Spoorthi:Reddy";
		
		System.out.println("String Manipulations:");
		System.out.println("String Length: "+s.length());
		System.out.println("Char at 0: "+s.charAt(0));
		System.out.println("Substring: "+s.substring(0, s.length()-2));
		System.out.println("String trim: "+s.trim());
		System.out.println("String compare - same: "+s.compareTo("Spoorthi "));
		System.out.println("String compare - Different: "+s.compareTo("Reddy"));
		System.out.println("String compare - Different: "+s.compareTo("abc"));
		System.out.println("String compare - Different: "+s.compareToIgnoreCase("SpOoRtHi "));
		System.out.println("String indexof:"+s.indexOf("t"));
		System.out.println("String replace:"+s.replace('o', 'z'));
		System.out.println("String lowercase: "+s.toLowerCase());
		System.out.println("String indexof: "+s.lastIndexOf('t'));
		System.out.println("String content: "+s.contentEquals(r));
		
		char[] carray = s.toCharArray();
		for (char c : carray) {
			System.out.print(c+" ");
		}
		System.out.println();
		String splitArray[] = t.split(":");
		for (String string : splitArray) {
			System.out.println(string+" ");
		}		
		System.out.println("String concatenation: "+splitArray[0].concat(splitArray[1]));

	}

}
