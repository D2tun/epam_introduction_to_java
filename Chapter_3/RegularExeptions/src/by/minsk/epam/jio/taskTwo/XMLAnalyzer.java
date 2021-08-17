package by.minsk.epam.jio.taskTwo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XMLAnalyzer {

	public static String readOpeningTags(String text) {

		Pattern tag = Pattern.compile("(\\<\\w+[id = \"\\w\"]*\\>)");
		String res = "";

		Matcher tagFind = tag.matcher(text);

		while (tagFind.find()) {
			res += tagFind.group() + " ";
		}

		return res;
	}

	public static String readClosingTags(String text) {

		Pattern tag = Pattern.compile("(\\</\\w+\\>)");
		String res = "";

		Matcher tagFind = tag.matcher(text);

		while (tagFind.find()) {
			res += tagFind.group() + " ";
		}

		return res;
	}

	public static String readContentOfTags(String text) {

		Pattern tag = Pattern.compile(">.+?<");
		String res = "";

		Matcher tagFind = tag.matcher(text);

		while (tagFind.find()) {
			res += tagFind.group() + " ";
		}

		return res;
	}

	public static String readEmptyTags(String text) {

		Pattern tag = Pattern.compile("(\\<\\w+/\\>)");
		String res = "";

		Matcher tagFind = tag.matcher(text);

		while (tagFind.find()) {
			res += tagFind.group() + " ";
		}

		return res;
	}
}
