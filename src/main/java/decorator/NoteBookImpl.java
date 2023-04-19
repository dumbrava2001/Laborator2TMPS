package decorator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class NoteBookImpl implements NoteBook{

  @Override
  public void write(String filePath, String content) {
    try {
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
      bufferedWriter.write(content);
      bufferedWriter.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
