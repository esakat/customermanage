package customer_manage.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by tom_red on 2018/01/02.
 */
@Data
@AllArgsConstructor
public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
}
