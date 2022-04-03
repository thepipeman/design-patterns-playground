package structural.decorator.v2;

import lombok.AllArgsConstructor;

/**
 * The concrete component which will be wrapped.
 * <p>
 * The basic behavior is defined here that can be altered by the decorators later on
 */
@AllArgsConstructor
public class FileDataSource implements DataSource {

  private String name;

  @Override
  public void writeData(String data) {
//    final File file = new File(name);
//    try (OutputStream fos = new FileOutputStream(file)) {
//      fos.write(data.getBytes(StandardCharsets.UTF_8), 0, data.length());
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
    System.out.printf("File written [data = %s,filename = %s]", data, this.name);
  }

  @Override
  public String readData() {

//    char[] buffer = null;
//    final File file = new File(name);
//    try (FileReader reader = new FileReader(file)) {
//      buffer = new char[(int) file.length()];
//      reader.read(buffer);
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//
//    return new String(buffer);
    System.out.printf("File read [filename = %s]", this.name);
    return "Concrete Data";
  }
}
