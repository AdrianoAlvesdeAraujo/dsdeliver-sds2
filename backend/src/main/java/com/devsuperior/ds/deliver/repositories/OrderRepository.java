package com.devsuperior.ds.deliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.ds.deliver.entities.Order;
import com.devsuperior.ds.deliver.entities.Product;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
