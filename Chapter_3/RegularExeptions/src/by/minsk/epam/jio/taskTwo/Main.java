/* 
 * Дана строка, содержащая следующий текст (xml-документ). Напишите анализатор,
 * позволяющий последовательно возвращать содержимое узлов xml-документа и его
 * тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела).
 * Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
 */

package by.minsk.epam.jio.taskTwo;

public class Main {

	public static void main(String[] args) {
		
		String xmlDoc = "<notes>\n"
				+ " <note id = \"1\">\n" 
				+ "  <to>Вася</to>\n" 
				+ "  <from>Света</from>\n"
				+ "  <heading>Напоминание</heading>\n"  
				+ "  <body>Позвони мне завтра!</body>\n" 
				+ " </note>\n" 
				+ " <note id = \"2\">\n" 
				+ "  <to>Петя</to>\n" 
				+ "  <from>Маша</from>\n" 
				+ "  <heading>Важное напоминание!</heading>\n" 
				+ "  <body/>\n" 
				+ " </note>\n" 
				+ "</notes>";
		
		System.out.println("Открывающие теги: " 
						  + XMLAnalyzer.readOpeningTags(xmlDoc));
		System.out.println("Закрывающие теги: "
						  + XMLAnalyzer.readClosingTags(xmlDoc));
		System.out.println("Содержимое тегов: " 
						  + XMLAnalyzer.readContentOfTags(xmlDoc));
		System.out.println("Пустые теги: " 
						  + XMLAnalyzer.readEmptyTags(xmlDoc));
	}
}
