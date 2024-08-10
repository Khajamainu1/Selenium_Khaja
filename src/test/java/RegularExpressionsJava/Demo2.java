package RegularExpressionsJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {
	
	
	//mobile no
	public static void main(String[] args) {
		Pattern p  = Pattern.compile("(0/91)?[0-9][0-9]{9}");
		Matcher m = p.matcher(arg[0]);
		
		if(m.find() && m.group().equals(arg[0])
				{
			System.out.println("Valid No");
				}
		else
			System.out.println("Non a valid no");
	}

}
