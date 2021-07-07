package task_two;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XML_analyzer {

	public static String opening_tags(String text) {

		Pattern tag = Pattern.compile("(\\<\\w+[id = \"\\w\"]*\\>)");
		String res = "";

		Matcher m = tag.matcher(text);

		while (m.find()) {
			res += m.group() + " ";
		}

		return res;
	}

	public static String closing_tags(String text) {

		Pattern tag = Pattern.compile("(\\</\\w+\\>)");
		String res = "";

		Matcher m = tag.matcher(text);

		while (m.find()) {
			res += m.group() + " ";
		}

		return res;
	}

	public static String content_of_tags(String text) {

		Pattern tag = Pattern.compile(">.+?<");
		String res = "";

		Matcher m = tag.matcher(text);

		while (m.find()) {
			res += m.group() + " ";
		}

		return res;
	}

	public static String empty_tags(String text) {

		Pattern tag = Pattern.compile("(\\<\\w+/\\>)");
		String res = "";

		Matcher m = tag.matcher(text);

		while (m.find()) {
			res += m.group() + " ";
		}

		return res;
	}

}
