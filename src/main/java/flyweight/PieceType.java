package flyweight;

public class PieceType {
  private String name;
  private String shape;
  private String color;

  public PieceType(String name, String shape, String color) {
    this.name = name;
    this.shape = shape;
    this.color = color;
  }

  public void draw(String[][] board, int row, int column) {
    board[row][column] = shape;
  }
}
