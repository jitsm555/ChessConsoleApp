package helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

import chess.Tuple;

public class ChessHelper {

	private <T, E> T getKeyByValue(Map<T, E> map, E value) {
		for (Entry<T, E> entry : map.entrySet()) {
			if (Objects.equals(value, entry.getValue())) {
				return entry.getKey();
			}
		}
		return null;
	}

	public void loadTuples(HashMap<Tuple, String> map) {
		char alphabet[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(alphabet[j] + "" + (i + 1) + " ");
				Tuple key = new Tuple(i, j);
				String value = alphabet[j] + "" + (i + 1);

				map.put(key, value);
			}
			System.out.println();
		}
	}

	public ArrayList<String> getPossibleChessMoves(String inputValue, HashMap<Tuple, String> map) {
		InputHandler handler = new InputHandler(inputValue);
		ChessCombinations chessCombinations = new ChessCombinations();
		
		Tuple tuple = getKeyByValue(map, handler.getTile().toUpperCase());
		ArrayList<Tuple> tuples = chessCombinations.validMovesForPiece(handler.getChessPiece(), tuple);
		ArrayList<String> possibleTiles = new ArrayList<String>();
		for (Tuple t : tuples) {
			for (Tuple mapTuple : map.keySet()) {
				if (t.X() == mapTuple.X() && t.Y() == mapTuple.Y()) {
					possibleTiles.add(map.get(mapTuple));
				}
			}

		}
		return possibleTiles;
	}

}
