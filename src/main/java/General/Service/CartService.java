package General.Service;

import General.DAO.CartRepository;
import General.Model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CartService {
    CartRepository cartRepository;
    @Autowired
    public CartService(CartRepository cartRepository){
    this.cartRepository = cartRepository;
    }
    public List <Cart> getAllCart(){
        return cartRepository.findAll();
    }
    public void saveCart(Cart cart){
        cartRepository.save(cart);
    }
    public Cart getCartByProductId(){
        return cartRepository.getById();
    }
    public Cart getCartbyUserId(){
        return getCartbyUserId();

    }
    public Cart getCartbyQuantityId(){
        return getCartbyQuantityId();
    }
    public Cart getCartbyCreatedDate(){
        return getCartbyCreatedDate();
    }

    public List<Cart> deleteAllCart() {return getAllCart();
    }
}

