package com.example.myShop.repository;

import com.example.myShop.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem,Long> {
    CartItem findByCartIdAndItemId(Long cartId,Long itemId);
}
