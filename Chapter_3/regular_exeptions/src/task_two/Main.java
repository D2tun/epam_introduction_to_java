package task_two;

/* Дана строка, содержащая следующий текст (xml-документ). Напишите анализатор, позволяющий последовательно
возвращать содержимое узлов xml-документа и его тип (открывающий тег, закрывающий тег, содержимое тега, тег без
тела). Пользоваться готовыми парсерами XML для решения данной задачи нельзя. */

public class Main {

	public static void main(String[] args) {
		
		String xml_doc = "<notes>\n" + 
						 " <note id = \"1\">\n" + 
						 "  <to>Вася</to>\n" + 
						 "  <from>Света</from>\n" + 
						 "  <heading>Напоминание</heading>\n" + 
						 "  <body>Позвони мне завтра!</body>\n" + 
						 " </note>\n" + 
						 " <note id = \"2\">\n" + 
						 "  <to>Петя</to>\n" + 
						 "  <from>Маша</from>\n" + 
						 "  <heading>Важное напоминание!</heading>\n" + 
						 "  <body/>\n" + 
						 " </note>\n" + 
						 "</notes>";
		
		System.out.println("Открывающие теги: " + XML_analyzer.opening_tags(xml_doc));
		System.out.println("Закрывающие теги: " + XML_analyzer.closing_tags(xml_doc));
		System.out.println("Содержимое тегов: " + XML_analyzer.content_of_tags(xml_doc));
		System.out.println("Пустые теги: " + XML_analyzer.empty_tags(xml_doc));
	}

}
