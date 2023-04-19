package decorator;

public class NoteBookDecorator implements NoteBook{
  private final NoteBook noteBook;

  public NoteBookDecorator(NoteBook noteBook) {
    this.noteBook = noteBook;
  }

  @Override
  public void write(String filePath, String content) {
    this.noteBook.write(filePath, content);
  }
}
