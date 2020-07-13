package chess.pieces;

import chess.ChessPiece;
import chess.Move;

public class Pawn extends ChessPiece {

	public Pawn() {
		super(PieceType.Pawn, validMoves(), false);
	}

	private static Move[] validMoves() {

		return new Move[] { new Move(1, 0, false, false) };

	}
}
