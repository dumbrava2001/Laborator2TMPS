package decorator;

public class LeftDelimiterDecorator extends NoteBookDecorator{

  public LeftDelimiterDecorator(NoteBook noteBook) {
    super(noteBook);
  }

  @Override
  public void write(String filePath, String content) {
    String delimiter = "\n\t\t|";
    String stringBuffer = "\t\t|" + content
        + delimiter
        + delimiter
        + delimiter
        + delimiter;
    super.write(filePath, stringBuffer);
  }
}
