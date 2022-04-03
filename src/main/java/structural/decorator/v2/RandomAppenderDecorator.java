package structural.decorator.v2;

/**
 * Just some random decorator of the object
 */
public class RandomAppenderDecorator extends DataSourceDecorator {
  public RandomAppenderDecorator(DataSource wrapee) {
    super(wrapee);
  }

  @Override
  public void writeData(String data) {
    final String appendedData = append(data);
    super.writeData(appendedData);
  }

  private String append(String data) {
    return data.concat(" well hello again!");
  }
}
