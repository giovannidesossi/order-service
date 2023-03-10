package it.desossi.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.desossi.orderservice.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
