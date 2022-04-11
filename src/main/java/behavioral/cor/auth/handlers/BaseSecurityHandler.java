package behavioral.cor.auth.handlers;

import behavioral.cor.auth.SecurityHandler;
import behavioral.cor.auth.UserRequest;

abstract class BaseSecurityHandler implements SecurityHandler {

  protected final SecurityHandler next;

  public BaseSecurityHandler(SecurityHandler next) {
    this.next = next;
  }

  @Override
  public void handle(UserRequest request) throws Exception {
    doHandle(request);
//    throw new Exception(getErrorMessage());
  }

  protected void handleNext(UserRequest request) throws Exception {
    if (this.next == null) {
      System.out.println("Last chain, exiting process");
      return;
    }
    this.next.handle(request);
  }

  abstract void doHandle(UserRequest request) throws Exception;

  abstract String getErrorMessage();
}
