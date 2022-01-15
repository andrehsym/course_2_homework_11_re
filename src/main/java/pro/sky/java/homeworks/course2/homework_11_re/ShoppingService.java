package pro.sky.java.homeworks.course2.homework_11_re;

import java.util.List;


public interface ShoppingService {

    Cart add(List<Integer> items);


    List<Integer> get();
}
