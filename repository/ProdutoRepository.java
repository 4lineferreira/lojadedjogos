package com.lojadejogos2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.lojadejogos2.model.Produtos;

public interface ProdutoRepository extends JpaRepository<Produtos, Long> {
	
	public List<Produtos> findAllByFabricanteContainingIgnoreCase (@Param("fabricante")String fabricante);

}
