package chess;

public abstract class ChessPiece {
	private final PieceType type;
	private final Move[] moves;
	private final String name;
	private final char charValue;
	private final boolean repeatableMoves;

	protected ChessPiece(PieceType type, Move[] moves, boolean repeatableMoves) {
		this.type = type;
		this.moves = moves;
		this.repeatableMoves = repeatableMoves;
		name = type.name();
		charValue = type.name().trim().charAt(0);
	}

	public enum PieceType {
		Pawn, Rook, Horse, Bishop, Queen, King
	}

	public enum PieceColor {
		White, Black
	}

	public Move[] getMoves() {
		return moves;
	}

	public String getName() {
		return name;
	}

	public char getCharValue() {
		return charValue;
	}

	public boolean hasRepeatableMoves() {
		return repeatableMoves;
	}

	public PieceType getPieceType() {
		return type;
	}


}
