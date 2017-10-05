package ALG_20170928;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * 时间：2017年9月30日
 * 作者： 汪宏志
 * 描述：
 *
 */
public class Offer1 {

	public static void main(String[] args) {
		String s   = "We Are Happy";
	 	String newstr =ConverStr3(s);
	 	System.out.println(newstr);
	}
	
	/**
	 * 方法一
	 * @param str
	 */
	public static String ConvertStr(String str)
	{
		if(str==null || str.length() == 0)
		{
			return "";
		}
		
		int spaceIndex = 0;
		int  size = 0;
 		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if(Character.isSpace(chars[i]))
			{
				spaceIndex++;
			}
		}
		
		size = chars.length + spaceIndex*2;
		
		int tempIndex = 0;
		char[] newChars = new char[size];
		for (int i = 0; i < chars.length; i++) {
			if (Character.isSpace(chars[i])) {
				newChars[tempIndex++] = '%';
				newChars[tempIndex++] = '2';
				newChars[tempIndex++] = '0';
			}else
			{
				newChars[tempIndex++] = chars[i];
			}
		}
		return Arrays.toString(newChars);
		
	}
	
	/**
	 * 方法二
	 * @param str
	 * @return
	 */
	public static String ConvertStr2(String str)
	{
		if(str==null || str.length() == 0)
		{
			return "";
		}
		
	    String[] s = str.split(" ");
	    StringBuffer sb = new StringBuffer();
	    for (int i = 0; i < s.length; i++) {
	    	sb.append(s[i]);
	    	if (i<s.length-1) {
	    		sb.append("%20");
			}
		}
        return sb.toString();
	}

	/**
	 * 方法三
	 * @param str
	 * @return
	 */
	public static String ConverStr3(String str)
	{
		if(str==null || str.length() == 0)
		{
			return "";
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if(Character.isSpaceChar(str.charAt(i)))
			{
				sb.append("%");
				sb.append("2");
				sb.append("0");
			}else
			{
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
	
	
	
}
