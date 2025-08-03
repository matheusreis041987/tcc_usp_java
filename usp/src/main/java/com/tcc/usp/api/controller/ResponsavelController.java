package com.tcc.usp.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcc.usp.api.dto.ResponsavelDTO;
import com.tcc.usp.api.exception.RegraNegocioException;
import com.tcc.usp.api.model.entity.Responsavel;
import com.tcc.usp.api.service.ResponsavelService;


@RestController
@RequestMapping("/api/responsavel")
@CrossOrigin(origins = "*") 
public class ResponsavelController {
	
	ResponsavelService service;
	
	
	public ResponsavelController (ResponsavelService service) {
		this.service = service;
	}
	
	
	private Responsavel converter(ResponsavelDTO dto) {
		
		Responsavel responsavel = new Responsavel(); 

		responsavel.setCep(dto.getCep());
		responsavel.setCidade(dto.getCidade());
		responsavel.setEndereco(dto.getEndereco());
		responsavel.setNome(dto.getNome());
		responsavel.setUf(dto.getUf());
		
		if(dto.getId() != null) {
			responsavel.setId(dto.getId());
		}
		
		return responsavel;
	}

	@PostMapping("/salvar-responsavel")
	public ResponseEntity salvar (@RequestBody ResponsavelDTO dto) {
		
			try {
				Responsavel entidadeResponsavel = converter(dto);
				entidadeResponsavel = service.salvar(entidadeResponsavel);
				return ResponseEntity.ok(entidadeResponsavel);
				
			} catch (RegraNegocioException regraNegocioException) {
				return ResponseEntity.badRequest().body(regraNegocioException.getMessage());
			}
	}
	
	
	@DeleteMapping("/deletar-responsavel/{id}")
	public ResponseEntity deletar(@PathVariable("id") Long id) {
		return service.consultarPorId(id).map(entity -> {
			service.deletar(entity);
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}).orElseGet(() -> ResponseEntity.badRequest().body(
				"O id do responsavel informado não foi encontrado na base de dados, por isso não pode ser excluído."));
	}
	
	@GetMapping("/buscar-responsavel")
	public ResponseEntity buscar (
			@RequestParam(value = "nome", required = false) String nome,
			@RequestParam(value = "id", required = false) Long id,
			@RequestParam(value = "endereco", required = false) String endereco,
			@RequestParam(value = "cep", required = false) String cep,
			@RequestParam(value = "uf", required = false) String uf,
			@RequestParam(value = "cidade", required = false) String cidade) {
		Responsavel responsavelFiltro = new Responsavel();
		responsavelFiltro.setCep(cep);
		responsavelFiltro.setCidade(cidade);
		responsavelFiltro.setEndereco(endereco);
		responsavelFiltro.setNome(nome);
		responsavelFiltro.setUf(uf);
		responsavelFiltro.setId(id);
		List<Responsavel> responsaveis = service.buscar(responsavelFiltro);
		return ResponseEntity.ok(responsaveis);
		
		
	}
	 
	@PutMapping("/atualizar-responsavel/{id}")
	public ResponseEntity atualizar(@PathVariable("id") Long id, @RequestBody ResponsavelDTO dto) {
		
		return service.consultarPorId(id).map(entity -> {
			try {
				Responsavel responsavel = converter(dto);
				responsavel.setId(entity.getId());
				service.atualizar(responsavel);
				return ResponseEntity.ok(responsavel);
			} catch (RegraNegocioException regraNegocioException) {
				return ResponseEntity.badRequest().body(regraNegocioException.getMessage());
			}
		}).orElseGet(() -> ResponseEntity.badRequest()
				.body( "O id do responsável informado não foi encontrado na base."));
		
	}
	
	
	
}
