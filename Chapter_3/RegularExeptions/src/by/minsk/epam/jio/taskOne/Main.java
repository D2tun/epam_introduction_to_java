/* 
 * Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее
 * выполнять с текстом три различных операции: отсортировать абзацы по
 * количеству предложений; в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию колчества вхождений заданного
 * символа, а в случае равенства - по алфавиту.
 */

package by.minsk.epam.jio.taskOne;

public class Main {

	public static void main(String[] args) {

		String text = "	Мы тотчас оказались в непроглядной тьме, лицом к лицу с"
				+ " тварью, которую невозможно даже начать описывать, и "
				+ "одно воспоминание о которой заставляет моё перо "
				+ "дрожать! Хорошо, что память сохранила лишь обрывки того "
				+ "сражения... Помню, как Катберт рубил колыхающиеся "
				+ "придатки чудища. Помню, как отрубленный кусок его плоти "
				+ "отлетел, а затем неведомой силой прыгнул на Болейна и"
				+ "проткнул его надёжную броню! Оккультист же, будто решив "
				+ "принести себя в жертву, был разорван на части "
				+ "корчащимися конечностями чудовища. "
				+ "	Бой был просто невозможным. Катберта убило, Болейн"
				+ " тоже пал, так что остался лишь я, движимый "
				+ "исключительно гневом. Я прыгнул и ударил топором по "
				+ "многочисленным глазам чудовища. В лицо мне хлынула "
				+ "фиолетовая слизь, и тварь взревела так, что сама моя "
				+ "душа содрогнулась. "
				+ "	Теперь я опять в заповеднике, возле останков моих "
				+ "товарищей. Раны мои слишком глубоки, и наше, то есть,"
				+ " моё задание уже не выполнить. Осквернение придётся "
				+ "отложить. Что интересно, у меня в кармане нашлось "
				+ "кольцо... Не представляю, откуда оно взялось там, но "
				+ "на нём есть знак давнего владельца этого имения. "
				+ "Занятно...";

		System.out.print("Отсортировать абзацы по количеству предложений - 1, в "
				+ "каждом предложении отсортировать слова по длине - 2, "
				+ "отсортировать лексемы в предложении по убыванию "
				+ "колчества вхождений заданного символа - 3.");

		int choice = 0;
		choice = StrictMath.abs(ValueInt.inputValue(choice));

		switch (choice) {
		case 1: 
			System.out.print(Paragraph.sortByNumberOfSentences(text));
			break;
		
		case 2 : 
			System.out.print(Words.sortByLength(text));
			break;
		
		case 3 : 
			System.out.print(Words.sortBySymbol(text));
			break;
		
		default:
			break;
		}
	}
}
