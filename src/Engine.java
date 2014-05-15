import java.util.Scanner;

public class Engine {
	static Scanner scan = new Scanner(System.in);
	static String inputWord;
	static String fallingWord;
	static int points;
	
	public static void Run(){
		inputWord = scan.next();
		
	}
	
	public static boolean compareWord(){
		if (inputWord.compareTo(fallingWord) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int givePoints(){
		if (compareWord()) {
			int point = (int) ((inputWord.length() * 0.50) + 0.5);
			return point;
		}
		else {
			return 0;
		}
	}
}
