package com.pettopia.pettopia.Repository;


import com.pettopia.pettopia.Entities.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<OrdersEntity,Integer> {
}
