package flyweight;

import java.util.HashMap;
import java.util.Map;

public class ChessFactory {

  private static Map<String, PieceType> pieceTypes = new HashMap<>();

  public static PieceType getPieceType(String name, String shape, String color) {
    PieceType type = pieceTypes.get(name);
    if (type == null) {
      type = new PieceType(name, shape, color);
      pieceTypes.put(name, type);
    }
    return type;
  }

}
