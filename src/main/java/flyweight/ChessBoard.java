package flyweight;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard {

  private String[][] board = {
      {"|*|", "|*|", "|*|", "|*|", "|*|", "|*|", "|*|", "|*|",},
      {"|*|", "|*|", "|*|", "|*|", "|*|", "|*|", "|*|", "|*|",},
      {"|*|", "|*|", "|*|", "|*|", "|*|", "|*|", "|*|", "|*|",},
      {"|*|", "|*|", "|*|", "|*|", "|*|", "|*|", "|*|", "|*|",},
      {"|*|", "|*|", "|*|", "|*|", "|*|", "|*|", "|*|", "|*|",},
      {"|*|", "|*|", "|*|", "|*|", "|*|", "|*|", "|*|", "|*|",},
      {"|*|", "|*|", "|*|", "|*|", "|*|", "|*|", "|*|", "|*|",},
      {"|*|", "|*|", "|*|", "|*|", "|*|", "|*|", "|*|", "|*|",}
  };

  private List<ChessPiece> chessPieceList = new ArrayList<>();

  public void setPiece(int row, int column, String name, String shape, String color) {
    PieceType pieceType = ChessFactory.getPieceType(name, shape, color);
    ChessPiece chessPiece = new ChessPiece(row, column, pieceType);
    chessPieceList.add(chessPiece);
  }

  public void display() {
    for (ChessPiece piece : chessPieceList) {
      piece.draw(this.board);
    }

    for (int row = 0; row < 8; row++) {
      for (int column = 0; column < 8; column++) {
        System.out.print("\t" + board[row][column]);
      }
      System.out.println();
    }
  }
}
