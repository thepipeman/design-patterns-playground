package behavioral.cor.auth;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class UserRequest {
  String username;
  String password;
  String requestUrl;
}
