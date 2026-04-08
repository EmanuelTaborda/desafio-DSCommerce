package com.DevSuperior.DSCommerce.repositories;

import com.DevSuperior.DSCommerce.entities.OrderItem;
import com.DevSuperior.DSCommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
