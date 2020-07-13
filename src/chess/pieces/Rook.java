package chess.pieces;

import chess.ChessPiece;
import chess.Move;


public class Rook extends ChessPiece {

	public Rook() {
		super(PieceType.Rook, validMoves(), true);
	}


	private static Move[] validMoves(){
		return new Move[]{	new Move(1, 0, false, false), new Move(0, 1, false, false),
                            new Move(-1, 0, false, false), new Move(0, -1, false, false)};
	}
}
