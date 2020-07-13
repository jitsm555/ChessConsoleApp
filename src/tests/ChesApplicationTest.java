package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import chess.Tuple;
import helper.ChessHelper;

class ChesApplicationTest {

	HashMap<Tuple, String> map = new HashMap<Tuple, String>();
	ChessHelper chessHelper = new ChessHelper();

	@BeforeEach
	void setUp() {
		System.out.println("Load chess board");
		chessHelper.loadTuples(map);
	}

	@Test
	void testBishopMoves() {
		String inputValue = "Bishop E3";
		ArrayList<String> chessPieceCombinations = chessHelper.getPossibleChessMoves(inputValue, map);
		System.out.println(Arrays.asList(chessPieceCombinations));
		assertEquals("[[F4, G5, H6, D4, C5, B6, A7, F2, G1, D2, C1]]", Arrays.asList(chessPieceCombinations) + "");

	}

	@Test
	void testHorseMoves() {
		String inputValue = "Horse E3";
		ArrayList<String> chessPieceCombinations = chessHelper.getPossibleChessMoves(inputValue, map);
		System.out.println(Arrays.asList(chessPieceCombinations));
		assertEquals("[[F5, G4, D5, G2, F1, C4, D1, C2]]", Arrays.asList(chessPieceCombinations) + "");

	}
	
	@Test
	void testKingMoves() {
		String inputValue = "King E3";
		ArrayList<String> chessPieceCombinations = chessHelper.getPossibleChessMoves(inputValue, map);
		System.out.println(Arrays.asList(chessPieceCombinations));
		assertEquals("[[E4, F3, E2, D3, F4, D4, F2, D2]]", Arrays.asList(chessPieceCombinations) + "");

	}
	
	
	@Test
	void testPawnMoves() {
		String inputValue = "Pawn E3";
		ArrayList<String> chessPieceCombinations = chessHelper.getPossibleChessMoves(inputValue, map);
		System.out.println(Arrays.asList(chessPieceCombinations));
		assertEquals("[[E4]]", Arrays.asList(chessPieceCombinations) + "");

	}

	@Test
	void testQueenMoves() {
		String inputValue = "Queen E3";
		ArrayList<String> chessPieceCombinations = chessHelper.getPossibleChessMoves(inputValue, map);
		System.out.println(Arrays.asList(chessPieceCombinations));
		assertEquals(
				"[[E4, E5, E6, E7, E8, F3, G3, H3, E2, E1, D3, C3, B3, A3, F4, G5, H6, D4, C5, B6, A7, F2, G1, D2, C1]]",
				Arrays.asList(chessPieceCombinations) + "");

	}
	
	@Test
	void testRookMoves() {
		String inputValue = "Rook E3";
		ArrayList<String> chessPieceCombinations = chessHelper.getPossibleChessMoves(inputValue, map);
		System.out.println(Arrays.asList(chessPieceCombinations));
		assertEquals("[[E4, E5, E6, E7, E8, F3, G3, H3, E2, E1, D3, C3, B3, A3]]", Arrays.asList(chessPieceCombinations) + "");

	}

}
