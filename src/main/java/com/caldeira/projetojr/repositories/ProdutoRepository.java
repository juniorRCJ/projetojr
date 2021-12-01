package com.caldeira.projetojr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caldeira.projetojr.domain.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

	
}
