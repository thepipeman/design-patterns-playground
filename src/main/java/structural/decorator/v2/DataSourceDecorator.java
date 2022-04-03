package structural.decorator.v2;

import lombok.AllArgsConstructor;

/**
 * Base decorator class. This will contain the wrapped object and this will act as the wrapper.
 */
@AllArgsConstructor
public class DataSourceDecorator implements DataSource {

  private DataSource wrapee;

  @Override
  public void writeData(String data) {
    wrapee.writeData(data);
  }

  @Override
  public String readData() {
    return wrapee.readData();
  }
}
