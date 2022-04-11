package behavioral.cor.auth;

public interface SecurityHandler {
  void handle(UserRequest request) throws Exception;
}