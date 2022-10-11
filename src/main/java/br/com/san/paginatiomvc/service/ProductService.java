package br.com.san.paginatiomvc.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import br.com.san.paginatiomvc.entity.Product;

public interface ProductService {

	public Page<Product> search(String search, Pageable pageable);

	public Object findAll(PageRequest pageRequest);
	
}
