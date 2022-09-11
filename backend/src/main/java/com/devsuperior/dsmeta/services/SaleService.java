package com.devsuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service // Componente do sistema
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	// Lista de vendas -> findSales
	
	public List<Sale> findSales() {
		return repository.findAll(); // Retornar todas as vendas
	}
}
