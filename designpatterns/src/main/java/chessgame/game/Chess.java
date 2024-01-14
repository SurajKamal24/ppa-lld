package chessgame.game;

import chessgame.BoardGame;
import chessgame.board.ChessBoard;
import chessgame.piece.PieceName;
import chessgame.player.ChessPlayer;
import chessgame.player.Player;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class Chess extends BoardGame {

    private final ChessPlayer player1, player2;

    public Chess(ChessPlayer player1, ChessPlayer player2, ChessBoard chessBoard) {
        super(chessBoard, new ArrayDeque<Player>(
                Arrays.asList(player1, player2)
        ));
        this.player1 = player1;
        this.player2 = player2;
        prepareBoard(this.player1, this.player2, chessBoard);
    }

    @Override
    public boolean isOver() {
        return player1.getPiece(PieceName.KING).isDead() ||
                player2.getPiece(PieceName.KING).isDead();
    }

    private void prepareBoard(ChessPlayer firstPlayer, ChessPlayer secondPlayer, ChessBoard chessBoard) {
        placePawns(1, chessBoard, firstPlayer);
        placePawns(6, chessBoard, secondPlayer);
        placeRooks(0, chessBoard, firstPlayer);
        placeRooks(7, chessBoard, secondPlayer);
        placeKnights(0, chessBoard, firstPlayer);
        placeKnights(7, chessBoard, secondPlayer);
        placeBishops(0, chessBoard, firstPlayer);
        placeBishops(7, chessBoard, secondPlayer);
        placeKins(0, chessBoard, firstPlayer);
        placeKing(7, chessBoard, secondPlayer);
        placeQueen(0, chessBoard, firstPlayer);
        placeQueen(7, chessBoard, secondPlayer);
    }

    private void placePawns(int row, ChessBoard board, ChessPlayer player) {
        List<PieceName> pieceNames =
                Arrays.asList(PieceName.PAWN1, PieceName.PAWN2, PieceName.PAWN3, PieceName.PAWN4,
                        PieceName.PAWN5, PieceName.PAWN6, PieceName.PAWN7, PieceName.PAWN8);
        int col = 0;
        for (PieceName pieceName : pieceNames) {
            board.putPiece(player.getPiece(pieceName), row, col++);
        }
    }

    private void placeRooks(int row, ChessBoard board, ChessPlayer player) {
        board.putPiece(player.getPiece(PieceName.ROOK1), row, 0);
        board.putPiece(player.getPiece(PieceName.ROOK2), row, 7);
    }

    private void placeKnights(int row, ChessBoard board, ChessPlayer player) {
        board.putPiece(player.getPiece(PieceName.KNIGHT1), row, 1);
        board.putPiece(player.getPiece(PieceName.KNIGHT2), row, 6);
    }

    private void placeBishops(int row, ChessBoard board, ChessPlayer player) {
        board.putPiece(player.getPiece(PieceName.BISHOP1), row, 2);
        board.putPiece(player.getPiece(PieceName.BISHOP2), row, 5);
    }

    private void placeKins(int row, ChessBoard board, ChessPlayer player) {
        board.putPiece(player.getPiece(PieceName.KING), row, 3);
    }

    private void placeQueen(int row, ChessBoard board, ChessPlayer player) {
        board.putPiece(player.getPiece(PieceName.QUEEN), row, 4);
    }
}
