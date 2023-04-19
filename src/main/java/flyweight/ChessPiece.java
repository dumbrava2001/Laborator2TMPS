package flyweight;

public class ChessPiece {
  private int row;

  private int column;

  private PieceType pieceType;

  public ChessPiece(int row, int column, PieceType pieceType) {
    this.row = row;
    this.column = column;
    this.pieceType = pieceType;
  }

  public void draw(String[][] board) {
    pieceType.draw(board, row, column);
  }
}
