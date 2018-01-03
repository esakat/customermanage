package customer_manage;

import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

/**
 * Created by tom_red on 2018/01/03.
 */
public class PbkdfChecker {
    public static void main(String[] args) {
        System.out.printf(new Pbkdf2PasswordEncoder().encode("demo"));
    }
}
