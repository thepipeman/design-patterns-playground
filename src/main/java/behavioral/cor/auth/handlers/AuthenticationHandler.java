package behavioral.cor.auth.handlers;

import behavioral.cor.auth.SecurityHandler;
import behavioral.cor.auth.UserRequest;

class AuthenticationHandler extends BaseSecurityHandler {

  public AuthenticationHandler(SecurityHandler next) {
    super(next);
  }

  @Override
  void doHandle(UserRequest request) throws Exception {
    if (request.getUsername().equals("user") && request.getPassword().equals("password")) {
      System.out.println("AuthenticationHandler: running next chain");
      handleNext(request);
    }
  }

  @Override
  String getErrorMessage() {
    return "Illegal login motherfucker";
  }
}
