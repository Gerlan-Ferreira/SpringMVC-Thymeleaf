package br.com.springmvc.thymeleaf.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.springmvc.thymeleaf.model.Multa;


@Controller
@RequestMapping("/")
public class MultaController {
	
	private static final List<Multa> BD = new ArrayList<>(Arrays.asList(
			
			new Multa (1L, "Multa por nao pagar agua",200,"João Lima", "apt: 401"),
			new Multa (2L, "Multa por nao pagar energia",300,"Pedro Augusto", "apt: 201"),
			new Multa (3L, "Multa por nao pagar o condominio",150,"Renan Bastos", "apt: 101")));
	
	@GetMapping
	public ModelAndView lista (Multa multa) {
		
		ModelAndView modelo = new ModelAndView("/multas.html");
		
		 List<Multa> lista = BD.stream()
	                .collect(Collectors.toList());
	        
	        modelo.addObject("multas", lista);
		
		return modelo;
	}
}
