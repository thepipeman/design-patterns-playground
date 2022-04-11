package behavioral.cor.auth.handlers;

import behavioral.cor.auth.SecurityHandler;

import java.util.HashSet;
import java.util.Set;

public class AuthHandlerFactory {

  public SecurityHandler createStandardTrigger() {
    final Set<SecurityHandler> handlers = new HashSet<>();

    final AuthorizationHandler authorizationHandler = new AuthorizationHandler(null);
    final AuthenticationHandler authenticationHandler = new AuthenticationHandler(authorizationHandler);

    return new UserSearchHandler(authenticationHandler);
  }

}
