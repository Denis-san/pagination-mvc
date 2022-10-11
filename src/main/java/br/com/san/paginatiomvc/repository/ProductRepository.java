package br.com.san.paginatiomvc.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.san.paginatiomvc.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	@Query("select p from Product p where lower(name) like %?1%")
	Page<Product> searchProduct(String search, Pageable pageable);
	
}
