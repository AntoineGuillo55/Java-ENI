import java.util.Random;

public class JeuLievreTortue {

	private static int nbrTortueWin;
	private static int nbrLievreWin;
	private static int iterationCounter;
	private static Random rand = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10000000; i++) {
			lancerDe();
			iterationCounter++;
		}

		displayProbability(nbrTortueWin, nbrLievreWin, iterationCounter);
	}

	private static void lancerDe() {

		int pointsTortue = 0;
		boolean isGameStillRunning = true;
		do {
			int result = rand.nextInt(6) + 1;
			if (result != 6) {
				pointsTortue++;
			}
			if (result == 6) {
				nbrLievreWin++;
				isGameStillRunning = false;
			} else if (pointsTortue == 4) {
				nbrTortueWin++;
				isGameStillRunning = false;
			}

		} while (isGameStillRunning);
	}

	private static void displayProbability(int tortueWIn, int lievreWin, int iteration) {

		int probaTortueWin = (tortueWIn * 100) / iteration;
		int probaLievreWin = (lievreWin * 100) / iteration;

		System.out.println("La probabilité que la tortue gagne est de " + probaTortueWin + "% (formule : (" + tortueWIn
				+ "*100)/" + iteration + ")");
		System.out.println("La probabilité que le lèvre gagne est de " + probaLievreWin + "% (formule : (" + lievreWin
				+ "*100)/" + iteration + ")");
	}

}
