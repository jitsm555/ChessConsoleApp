package runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import chess.Tuple;
import helper.ChessHelper;

public class ChessApplication {

	public static void main(String[] args) throws Exception {
		ChessHelper chessHelper = new ChessHelper();
		HashMap<Tuple, String> map = new HashMap<Tuple, String>();
		chessHelper.loadTuples(map);

		System.out.println("Enter move (eg. Horse E3): ");

		while (true) {
			Scanner scanner = new Scanner(System.in);
			String inputValue = scanner.nextLine();
			if (inputValue.equals("exit")) {
				scanner.close();
			}
			if (inputValue.isEmpty()) {
				System.out.println("Please enter move in above mentioned form");
				continue;
			}
			try {
				ArrayList<String> chessPieceCombinations = chessHelper.getPossibleChessMoves(inputValue, map);
				System.out.println("Output- " + Arrays.asList(chessPieceCombinations));
			} catch (IllegalArgumentException e) {
				System.out.println(e);
			}
		}
	}
}
