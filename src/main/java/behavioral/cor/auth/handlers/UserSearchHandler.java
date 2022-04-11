package behavioral.cor.auth.handlers;

import behavioral.cor.auth.SecurityHandler;
import behavioral.cor.auth.UserRequest;

class UserSearchHandler extends BaseSecurityHandler {

  public UserSearchHandler(SecurityHandler next) {
    super(next);
  }

  @Override
  public void doHandle(UserRequest request) throws Exception {
    if (request.getUsername().equals("user")) {
      System.out.println("UserSearchHandler: running next chain");
      handleNext(request);
    }
  }

  @Override
  String getErrorMessage() {
    return "User does not exist";
  }
}
