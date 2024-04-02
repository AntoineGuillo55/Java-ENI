import java.util.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] listeDeMots = new String[10];
		listeDeMots[0] = "paris";
		listeDeMots[1] = "rennes";
		listeDeMots[2] = "lyon";
		listeDeMots[3] = "marseille";
		listeDeMots[4] = "bordeaux";
		listeDeMots[5] = "lille";
		listeDeMots[6] = "clermon";
		listeDeMots[7] = "albertville";
		listeDeMots[8] = "toulouse";
		listeDeMots[9] = "nantes";

		int randomIndex = getRandomIndex(listeDeMots.length);
		String choosenWord = getRandomWord(randomIndex, listeDeMots);
		String wordChanged = melangerString(choosenWord);
		String answer = displayGame(wordChanged);
		checkAnswer(answer, choosenWord);
	}

	public static int getRandomIndex(int arrayLength) {

		Random rand = new Random();
		int index = rand.nextInt(arrayLength);
		return index;
	}

	public static String getRandomWord(int index, String[] array) {

		for (int i = 0; i < array.length; i++) {

			if (i == index) {
				return array[i];
			}
		}
		return null;
	}

	public static String melangerString(String chaine) {

		List<Character> caracteres = new ArrayList<>();

		for (char c : chaine.toCharArray()) {
			caracteres.add(c);
		}

		Collections.shuffle(caracteres);

		StringBuilder resultat = new StringBuilder();

		for (char c : caracteres) {
			resultat.append(c);
		}
		return resultat.toString();
	}

	public static String displayGame(String word) {

		Scanner s = new Scanner(System.in);
		System.out.println("Voici le mot :");
		System.out.println(word);
		System.out.println("Veuillez saisir votre proposition");
		String answer = s.nextLine();
		s.close();
		return answer;
	}

	public static boolean checkAnswer(String answer, String choosenWord) {

		if (answer.equals(choosenWord)) {
			System.out.println("Bien joué !");
			return true;
		} else if (!checkLettersUsed(answer, choosenWord)) {
			System.out.println("Lettre incorrecte !");
			return false;
		} else {
			System.out.println("Raté, essaye encore !");
			return false;
		}

	}

	public static boolean checkLettersUsed(String answer, String choosenWord) {

		char[] answerArray = answer.toCharArray();

		for (int i = 0; i < answerArray.length; i++) {

			if (choosenWord.indexOf(answerArray[i]) <= 0) {
				return false;
			}
		}
		return true;
	}
}
