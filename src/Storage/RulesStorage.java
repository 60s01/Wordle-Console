package Storage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static Shared.Constants.FILEPATH1;

public class RulesRepository {
  public String loadRules() throws IOException {
	return new String(Files.readAllBytes(Paths.get(FILEPATH1)));
  }
}