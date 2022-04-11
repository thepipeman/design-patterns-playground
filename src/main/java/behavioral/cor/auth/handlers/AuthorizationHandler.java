package behavioral.cor.auth.handlers;

import behavioral.cor.auth.SecurityHandler;
import behavioral.cor.auth.UserRequest;

class AuthorizationHandler extends BaseSecurityHandler {

  public AuthorizationHandler(SecurityHandler next) {
    super(next);
  }

  @Override
  void doHandle(UserRequest request) throws Exception {
    if (request.getRequestUrl().equals("dummy")) {
      System.out.println("AuthorizationHandler: running next chain");
      handleNext(request);
    }
  }

  @Override
  String getErrorMessage() {
    return "Unauthorized request";
  }
}
