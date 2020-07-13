package chess.pieces;

import chess.ChessPiece;
import chess.Move;

public class Horse extends ChessPiece {

	public Horse(){
		super(PieceType.Horse, validMoves(), false);
	}
	private static Move[] validMoves(){
		return new Move[]{	new Move(2, 1, false, false), new Move(1, 2, false, false),
	                    	new Move(2, -1, false, false), new Move(-1, 2, false, false),
	                        new Move(2, -1, false, false), new Move(-1, 2, false, false),
	                        new Move(-2, 1, false, false), new Move(1, -2, false, false),
	                        new Move(-2, -1, false, false), new Move(-1, -2, false, false),
	                        new Move(-2, -1, false, false), new Move(-1, -2, false, false)};
	}
}
