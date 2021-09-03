/*
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, доволнить,
 * удалить.
 */

package by.minsk.epam.jio.main;

import by.minsk.epam.jio.bean.TextFile;

public class Main {

	public static void main(String[] args) {

		TextFile a = new TextFile("001", "D://");
		// a.createFile();
		// a.rename("001text");
		// a.addContent("789");
		// a.addContent("456");
		// System.out.println(a.getContent());
		// a.delete();
	}
}
