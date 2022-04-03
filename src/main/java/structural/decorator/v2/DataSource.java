package structural.decorator.v2;

/**
 * The decorator Component.
 * <p>
 * This is the common interface for both wrappers and wrapped objects .
 */
public interface DataSource {

  void writeData(String data);

  String readData();
}
