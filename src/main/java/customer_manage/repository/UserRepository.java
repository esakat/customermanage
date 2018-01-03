package customer_manage.repository;

import customer_manage.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tom_red on 2018/01/03.
 */
public interface UserRepository extends JpaRepository<User, String> {
}
