package com.tcc.usp.api.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teste")
@CrossOrigin(origins = "*") 
public class TesteContainer {

	@GetMapping("/teste_container")
	public ResponseEntity<String> testarContainer(){
		
		String resposta = "<Container em funcionamento - classe teste>";
		
		return ResponseEntity.ok(resposta);
		
	}
	
}
