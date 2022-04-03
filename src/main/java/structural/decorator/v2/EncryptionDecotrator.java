package structural.decorator.v2;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * Decorator that encrypts the data
 */
public class EncryptionDecotrator extends DataSourceDecorator {

  public EncryptionDecotrator(DataSource wrapee) {
    super(wrapee);
  }

  @Override
  public void writeData(String data) {
    final String encodedData = encode(data);
    super.writeData(encodedData);
  }

  @Override
  public String readData() {
    return super.readData();
  }

  private String encode(String data) {
    return Base64.getEncoder().encodeToString(data.getBytes(StandardCharsets.UTF_8));
  }
}
