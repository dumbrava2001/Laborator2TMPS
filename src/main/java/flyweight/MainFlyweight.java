package flyweight;

public class MainFlyweight {

  public static void main(String[] args) {
    ChessBoard chessBoard = new ChessBoard();
    for (int i = 0; i < 16; i++) {
      if (i < 8){
        chessBoard.setPiece(6, i, "pawn", "|p|", "white");
      }else {
        chessBoard.setPiece(1, i-8, "pawn", "|p|", "black");
      }
    }

    chessBoard.setPiece(0, 0, "rook", "|R|", "black");
    chessBoard.setPiece(0, 7, "rook", "|R|", "black");
    chessBoard.setPiece(7, 0, "rook", "|R|", "white");
    chessBoard.setPiece(7, 7, "rook", "|R|", "white");

    chessBoard.setPiece(0, 1, "knight", "|N|", "black");
    chessBoard.setPiece(0, 6, "knight", "|N|", "black");
    chessBoard.setPiece(7, 1, "knight", "|N|", "white");
    chessBoard.setPiece(7, 6, "knight", "|N|", "white");

    chessBoard.setPiece(0, 2, "bishop", "|B|", "black");
    chessBoard.setPiece(0, 5, "bishop", "|B|", "black");
    chessBoard.setPiece(7, 2, "bishop", "|B|", "white");
    chessBoard.setPiece(7, 5, "bishop", "|B|", "white");

    chessBoard.setPiece(0,3,"queen", "|Q|", "black");
    chessBoard.setPiece(7,3,"queen", "|Q|", "white");

    chessBoard.setPiece(0, 4, "king", "|K|", "black");
    chessBoard.setPiece(7, 4, "king", "|K|", "white");
    chessBoard.display();
  }
}
