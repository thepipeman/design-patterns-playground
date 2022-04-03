package structural.decorator.v2;

public class DecoratorV2Demo {

  public static void main(String[] args) {
    final String data = "Hello Decorator!";
    final DataSource baseDataSource = new FileDataSource("random_file.txt");
//    System.out.println("------------------------");
//    System.out.println("Before encryption");
//    baseDataSource.writeData(data);

//    final DataSource encodedDataSource = new EncryptionDecotrator(baseDataSource);
//    System.out.println("------------------------");
//    System.out.println("After encryption");
//    encodedDataSource.writeData(data);

//    final DataSource randomAppenderSource = new RandomAppenderDecorator(encodedDataSource);
//    System.out.println("------------------------");
//    System.out.println("After random appender");
//    randomAppenderSource.writeData(data);

    // v2
    final DataSource randomAppenderSource = new RandomAppenderDecorator(baseDataSource);
    final DataSource encodedDataSource = new EncryptionDecotrator(randomAppenderSource);
    encodedDataSource.writeData(data);

  }
}
