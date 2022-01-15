package pro.sky.java.homeworks.course2.homework_11_re;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ShoppingController {

private final ShoppingService shoppingService;

    public ShoppingController(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    @GetMapping("/add")
    public List<Integer> add(@RequestParam("id") List<Integer> items) {
        shoppingService.add(items);
        return items;
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return shoppingService.get();
    }

}
