package RegularExpressionsJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
	
	public static void main(String[] args) {
		int count =0;
		Pattern p = Pattern.compile(".");
		Matcher m = p.matcher("abcd.x hj");
		
		
		
		while(m.find())
		{
			System.out.println(m.start() + "----------" +m.group());
		}
	}

}
