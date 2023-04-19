package decorator;

public class MainDecorator {

  public static void main(String[] args) {
    NoteBook noteBook = new LeftDelimiterDecorator(new NoteBookImpl());
    noteBook.write(
        "C:\\UTM\\Anul III\\semestru2\\tmps\\lab2\\tmps_lab2\\src\\main\\java\\decorator\\test.txt",
        "This is a content for notebook!");

    NoteBook noteBook1 = new RightDelimiterDecorator(new NoteBookImpl());
    noteBook1.write(
        "C:\\UTM\\Anul III\\semestru2\\tmps\\lab2\\tmps_lab2\\src\\main\\java\\decorator\\test1.txt",
        "This is a content for notebook!");

    NoteBookDecorator noteBook2 = new RightDelimiterDecorator(
        new LeftDelimiterDecorator(new NoteBookImpl()));

    noteBook2.write(
        "C:\\UTM\\Anul III\\semestru2\\tmps\\lab2\\tmps_lab2\\src\\main\\java\\decorator\\test2.txt",
        "This is a content for notebook!");
  }
}
