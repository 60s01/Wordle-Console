package wordle.storage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static wordle.storage.ConstantsStorage.FILEPATH1;
import static wordle.storage.ConstantsStorage.ENCODING;

public class RulesStorage {
  public String loadRules() throws IOException {
	return new String(Files.readAllBytes(Paths.get(FILEPATH1)), ENCODING);
  }
}