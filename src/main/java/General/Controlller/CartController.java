package General.Controlller;

import General.Model.Cart;
import General.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Cart")
public class CartController {


    @Autowired
    public CartService cartService;
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }
    @GetMapping
    public List<Cart> getAllCart() {
        return cartService.getAllCart();
    }
    @PostMapping
    public void saveCart(@RequestBody Cart cart) {
        cartService.saveCart(cart);
    }
    @GetMapping("UserId/{UserId}")
    public Cart getCartByUserId(@PathVariable String UserId) {
        return cartService.getCartbyUserId();
    }
    @DeleteMapping
    public List<Cart> deleteAllCart(){return cartService.deleteAllCart();}

}


