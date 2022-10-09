package br.com.san.paginatiomvc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.san.paginatiomvc.entity.Product;

@Controller
@RequestMapping("/product")
public class ProductController {

	@RequestMapping("/")
	public String showTable() {
		return "index";
	}

	@PostMapping("/search")
	public ModelAndView search(@RequestParam(name = "search") String search) {
		ModelAndView modelView = new ModelAndView("index");

		Product p1 = new Product(1, "Notebook", 3243.54, 54, "#54655654");
		Product p2 = new Product(1, "Mouse", 33.04, 54, "#54657");
		Product p3 = new Product(1, "Computador", 55.55, 0, "#12343");
		Product p4 = new Product(1, "Teclado gamer", 343.54, 54, "#8678768");
		Product p5 = new Product(1, "Monitor", 743.00, 54, "#8678768");

		List<Product> products = Arrays.asList(p1, p2, p3, p4, p5);

		modelView.addObject("products", products);

		return modelView;
	}

}
