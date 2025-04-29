package Storage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static Shared.ConstantsStorage.FILEPATH1;
import static Shared.ConstantsStorage.ENCODING;

public class RulesStorage {
  public String loadRules() throws IOException {
	return new String(Files.readAllBytes(Paths.get(FILEPATH1)), ENCODING);
  }
}