package helper;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import chess.ChessPiece;
import chess.pieces.Bishop;
import chess.pieces.Horse;
import chess.pieces.King;
import chess.pieces.Pawn;
import chess.pieces.Queen;
import chess.pieces.Rook;

public class InputHandler {

	private final static Pattern validMove = Pattern.compile("([a-hA-H][1-8])", Pattern.CASE_INSENSITIVE);
	private final String tileValue;
	private final String chessPiece;

	public InputHandler(String value) {
		String[] splited = value.split("\\s+");
		this.chessPiece = splited[0];
		this.tileValue = splited[1];
	}

	public String getTile() throws IllegalArgumentException {
		Matcher matcher = validMove.matcher(tileValue);
		if (matcher.matches()) {
			System.out.println("Tile : " + matcher.group(0));
			return matcher.group(0);
		}
		throw new IllegalArgumentException("Enter tile value is incorrect: " + tileValue);

	}

	public ChessPiece getChessPiece() throws IllegalArgumentException {
		System.out.println("Chess Piece :" + chessPiece);

		switch (chessPiece) {
		case "King":
			return new King();
		case "Queen":
			return new Queen();
		case "Bishop":
			return new Bishop();
		case "Horse":
			return new Horse();
		case "Rook":
			return new Rook();
		case "Pawn":
			return new Pawn();
		}
		throw new IllegalArgumentException("Enter chess piece is incorrect: " + chessPiece);
	}

}
