 package com.devsuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.Sale;

// ctrl + shift + o para importar automático

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
