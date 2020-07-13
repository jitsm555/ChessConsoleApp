package helper;

import java.util.ArrayList;

import chess.ChessPiece;
import chess.Move;
import chess.Tuple;

public class ChessCombinations {

	public ArrayList<Tuple> validMovesForPiece(ChessPiece piece, Tuple currentLocation) {
		return piece.hasRepeatableMoves() ? validMovesRepeatable(piece, currentLocation)
				: validMovesNonRepeatable(piece, currentLocation);
	}

	// Returns the Tuples representing the Tiles to which the given piece
	// can legally move for repeatable values like Rock, Queen, Bishop
	private ArrayList<Tuple> validMovesRepeatable(ChessPiece piece, Tuple currentLocation) {
		Move[] moves = piece.getMoves();
		ArrayList<Tuple> possibleMoves = new ArrayList<>();

		for (Move move : moves) {
			for (int i = 1; i < 8; i++) {
				int newX = currentLocation.X() + move.x * i;
				int newY = currentLocation.Y() + move.y * i;
				if (newX < 0 || newX > 8 || newY < 0 || newY > 8)
					break;

				Tuple toLocation = new Tuple(newX, newY);
				if (!possibleMoves.contains(toLocation)) {
					possibleMoves.add(toLocation);
				}

			}
		}
		return possibleMoves;
	}

	// Returns the Tuples representing the Tiles to which the given piece
	// can legally move for non-repeatable values like King, Horse, Pawn
	private ArrayList<Tuple> validMovesNonRepeatable(ChessPiece piece, Tuple currentLocation) {
		Move[] moves = piece.getMoves();
		ArrayList<Tuple> possibleMoves = new ArrayList<>();

		for (Move move : moves) {
			int currentX = currentLocation.X();
			int currentY = currentLocation.Y();
			int newX = currentX + move.x;
			int newY = currentY + move.y;
			if (newX < 0 || newX > 8 || newY < 0 || newY > 8)
				continue;
			Tuple newLocation = new Tuple(newX, newY);
			if (!possibleMoves.contains(newLocation)) {
				possibleMoves.add(newLocation);
			}
		}
		return possibleMoves;
	}
}
