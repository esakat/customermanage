package customer_manage.service;

import customer_manage.domain.User;
import lombok.Data;
import org.springframework.security.core.authority.AuthorityUtils;

/**
 * Created by tom_red on 2018/01/03.
 */
@Data
public class LoginUserDetails extends org.springframework.security.core.userdetails.User {
    private final User user;

    public LoginUserDetails(User user) {
        super(user.getUsername(), user.getEncodedPassword(), AuthorityUtils.createAuthorityList("ROLE_USER"));
        this.user = user;
    }
}
