package chess.pieces;
import chess.ChessPiece;
import chess.Move;
public class Bishop extends ChessPiece {

	public Bishop(){
		super(PieceType.Bishop, validMoves(), true);
	}


	private static Move[] validMoves(){
		return	new Move[]{	new Move(1, 1, false, false), new Move(1, -1, false, false),
	                        new Move(-1, 1, false, false), new Move(-1, -1, false, false)};
	}
}
