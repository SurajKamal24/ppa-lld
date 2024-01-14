package chessgame.player;

import chessgame.Move;
import chessgame.Pair;
import chessgame.board.ChessBoard;
import chessgame.piece.ChessPiece;
import chessgame.piece.PieceName;

import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class HumanChessPlayer extends ChessPlayer{
    public HumanChessPlayer(Map<PieceName, ChessPiece> pieces, ChessBoard chessBoard, String name) {
        super(pieces, chessBoard, name);
    }

    @Override
    public Move makeMove() {
        getChessBoard().display();
        int x, y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        Optional<ChessPiece> chessPiece = getChessBoard().getCell(new Pair(x, y)).getChessPiece();
        if (!chessPiece.isPresent())
            throw new RuntimeException("Invalid spot");
        if (!chessPiece.get().equals(getPiece(chessPiece.get().getName())))
            throw new RuntimeException("Invalid piece");
        Pair source = new Pair(x, y);
        x = scanner.nextInt();
        y = scanner.nextInt();
        Pair destination = new Pair(x, y);
        // validations in dest
        return new Move(source, destination);
    }
}
