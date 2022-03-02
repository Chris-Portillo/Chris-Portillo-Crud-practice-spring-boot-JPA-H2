package net.christian.springboot.springbootcrudhibernate.repository;

import net.christian.springboot.springbootcrudhibernate.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
