package General.DAO;

import General.Model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Integer> {

    Cart getById();
    @Query("from Cart where Cart_ID = :CartID")
    public Cart findCartByProduct(@Param("Cart_ID") int id);

    @Query("from Cart")
    public List<Cart> findAllCart();
    @Query("from product_id")
    public Cart findCartbyProduct_id();

}
