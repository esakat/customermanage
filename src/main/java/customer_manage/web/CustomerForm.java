package customer_manage.web;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by tom_red on 2018/01/03.
 */
@Data
public class CustomerForm {
    @NotNull
    @Size(min=1, max=127)
    private String firstName;
    @NotNull
    @Size(min=1, max=127)
    private String lastName;
}
