package task_one;

/* Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
 консоль текст, заголовок текста. */

public class Main {

	public static void main(String[] args) {
		
		Word word1 = new Word("Муха");
		Word word2 = new Word("села");
		Word word3 = new Word("на");
		Word word4 = new Word("варенье");
		Sentence sentence1 = new Sentence();
		sentence1.add_word(word1);
		sentence1.add_word(word2);
		sentence1.add_word(word3);
		sentence1.add_word(word4);
		
		Word word5 = new Word("Вот");
		Word word6 = new Word("и");
		Word word7 = new Word("всё");
		Word word8 = new Word("стихотворенье");
		Sentence sentence2 = new Sentence();
		sentence2.add_word(word5);
		sentence2.add_word(word6);
		sentence2.add_word(word7);
		sentence2.add_word(word8);

		Text text = new Text();
		text.set_title("Стихотворение");
		text.add_sentence(sentence1);
		text.add_sentence(sentence2);
		text.print_title();
		text.print_text();
		
		
	}

}
