import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String... str) {
		String input = "nirmalkumar";
		String regPattern = "(nirmal)";
		String result ="";
		Pattern p = Pattern.compile(regPattern);
		Matcher m = p.matcher(input);
		//System.out.println(m.find());
		if (m.find()) {
		   result = m.group();
		}
		System.out.println(result);
		
	}
}
