package customer_manage;

import customer_manage.domain.Customer;
import customer_manage.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by tom_red on 2018/01/02.
 */
@EnableAutoConfiguration
@ComponentScan
public class App implements CommandLineRunner {
    @Autowired
    CustomerService customerServive;

    @Override
    public void run(String... strings) throws Exception {
        // データ追加
        customerServive.save(new Customer(1, "Nobita", "Nobi"));
        customerServive.save(new Customer(2, "Takeshi", "Goda"));
        customerServive.save(new Customer(3, "Suneo", "Honekawa"));

        // データ表示
        customerServive.findAll().forEach(System.out::println);
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
