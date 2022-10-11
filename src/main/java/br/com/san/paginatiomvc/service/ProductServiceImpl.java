package br.com.san.paginatiomvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.san.paginatiomvc.entity.Product;
import br.com.san.paginatiomvc.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;

	@Override
	public Page<Product> search(String search, Pageable pageable) {
		return repository.searchProduct(search.toLowerCase(), pageable);
	}

	@Override
	public Object findAll(PageRequest pageRequest) {
		return repository.findAll(pageRequest);
	}

}
