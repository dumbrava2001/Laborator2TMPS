package decorator;

import java.nio.CharBuffer;

public class RightDelimiterDecorator extends NoteBookDecorator{

  public RightDelimiterDecorator(NoteBook noteBook) {
    super(noteBook);
  }

  @Override
  public void write(String filePath, String content) {
    String delimiter = "|\n";
    String spaces = CharBuffer.allocate(content.length()).toString().replace('\0', ' ');
    String stringBuffer = content + delimiter
        + spaces + delimiter
        + spaces + delimiter
        + spaces + delimiter;
    super.write(filePath, stringBuffer);
  }
}
