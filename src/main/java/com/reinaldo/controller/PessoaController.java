package com.reinaldo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.reinaldo.repository.PessoaRepository;



@Controller
@RequestMapping
public class PessoaController {
	@Autowired
	private PessoaRepository pessoaRepo;	

	@GetMapping("/cadastropessoa")
	public String inicio() {
		
		return "cadastro/cadastropessoa";
	}
}
