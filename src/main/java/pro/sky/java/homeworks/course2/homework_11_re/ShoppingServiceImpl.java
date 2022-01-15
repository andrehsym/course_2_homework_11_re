package pro.sky.java.homeworks.course2.homework_11_re;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService{

    private Cart cart;

    public ShoppingServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public Cart add(List<Integer> items) {
        cart.addInCart(items);
        return cart;
       }

    @Override
    public List<Integer> get() {
        return cart.getCart();
    }

}
