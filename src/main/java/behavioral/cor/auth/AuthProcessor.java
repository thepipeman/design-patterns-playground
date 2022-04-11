package behavioral.cor.auth;

import behavioral.cor.auth.handlers.AuthHandlerFactory;

public class AuthProcessor {

  public String getResource(UserRequest userRequest) throws Exception {

    final var authHandlerFactory = new AuthHandlerFactory();
    final var triggerHandler = authHandlerFactory.createStandardTrigger();

    // runs authentication processing, if there's an issue exception will be thrown
    triggerHandler.handle(userRequest);
    return "Protected resource";
  }
}
