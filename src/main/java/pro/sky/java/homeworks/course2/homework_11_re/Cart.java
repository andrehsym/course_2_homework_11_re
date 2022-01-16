package pro.sky.java.homeworks.course2.homework_11_re;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Scope("prototype")
public class Cart {

    private List<Integer> cart;

    public Cart() {
        cart = new ArrayList<>();
    }

    public List<Integer> getCart() {
        return cart;
    }

    public List<Integer> addInCart(List<Integer> nums) {
        cart.addAll(nums);
        return cart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart1 = (Cart) o;
        return cart.equals(cart1.cart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cart);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cart=" + cart +
                '}';
    }

}
