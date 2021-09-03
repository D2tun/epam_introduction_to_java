/* 
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы:
 * дополнить текст, вывести на консоль текст, заголовок текста. 
 */

package by.minsk.epam.jio.taskOne;

public class Main {

	public static void main(String[] args) {
		
		Word word1 = new Word("Муха");
		Word word2 = new Word("села");
		Word word3 = new Word("на");
		Word word4 = new Word("варенье");
		Sentence sentence1 = new Sentence();
		sentence1.addWord(word1);
		sentence1.addWord(word2);
		sentence1.addWord(word3);
		sentence1.addWord(word4);
		
		Word word5 = new Word("Вот");
		Word word6 = new Word("и");
		Word word7 = new Word("всё");
		Word word8 = new Word("стихотворенье");
		Sentence sentence2 = new Sentence();
		sentence2.addWord(word5);
		sentence2.addWord(word6);
		sentence2.addWord(word7);
		sentence2.addWord(word8);

		Text text = new Text();
		text.setTitle("Стихотворение");
		text.addSentence(sentence1);
		text.addSentence(sentence2);
		text.printTitle();
		text.printText();		
	}
}
