package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        User user1 = new User("User1", "Lastname1", "user1@mail.ru");
        Car car1 = new Car("BMW", 7);
        User user2 = new User("User2", "Lastname2", "user2@mail.ru");
        Car car2 = new Car("MazdaRX", 5);
        User user3 = new User("User3", "Lastname3", "user3@mail.ru");
        Car car3 = new Car("Toyota", 3);

        user1.setCar(car1);
        userService.add(user1);
        user2.setCar(car2);
        userService.add(user2);
        user3.setCar(car3);
        userService.add(user3);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        userService.getOwner("Mazda RX", 5);

        context.close();
    }
}
