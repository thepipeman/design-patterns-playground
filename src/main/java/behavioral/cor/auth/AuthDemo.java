package behavioral.cor.auth;

public class AuthDemo {

  public static void main(String[] args) throws Exception {
    final var userRequest = UserRequest.builder()
      .requestUrl("dummy")
      .username("user")
      .password("password")
      .build();

    final AuthProcessor authProcessor = new AuthProcessor();

    final var protectedResource = authProcessor.getResource(userRequest);
    System.out.println(protectedResource);
  }
}
