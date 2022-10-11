package br.com.san.paginatiomvc.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.san.paginatiomvc.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;

	@RequestMapping("/")
	public String showTable() {
		return "index";
	}

	@GetMapping("/search")
	public ModelAndView search(@RequestParam(name = "search") String search,
			@RequestParam(name = "page", required = false) Optional<Integer> page) {

		int pagesize = 10; 
		
		ModelAndView modelView = new ModelAndView("index");
		PageRequest pageRequest = PageRequest.of(page.orElse(0), pagesize, Sort.Direction.ASC, "name");

		if (search.isBlank() || search == null) {
			modelView.addObject("products", service.findAll(pageRequest));
		} else {
			modelView.addObject("products", service.search(search, pageRequest));
		}

		
		
		return modelView;
	}

}
