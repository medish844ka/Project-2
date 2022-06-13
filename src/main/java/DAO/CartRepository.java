package DAO;

import Model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CartRepository extends JpaRepository<Cart, Integer> {

    @Query("from Cart where Cart_ID = :CartID")
    public Cart findCartByProduct(@Param("Cart_ID") int id);


    Cart getById();
}
