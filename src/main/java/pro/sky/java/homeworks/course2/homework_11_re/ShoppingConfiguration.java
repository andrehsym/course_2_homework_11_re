package pro.sky.java.homeworks.course2.homework_11_re;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collection;
import java.util.stream.Collectors;

@Configuration
public class ShoppingConfiguration {

    @Bean
    @Primary
    @SessionScope
    public Cart cart() {
        return new Cart();
    }

}
