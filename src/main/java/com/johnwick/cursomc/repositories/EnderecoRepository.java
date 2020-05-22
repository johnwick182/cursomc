package com.johnwick.cursomc.repositories;

import com.johnwick.cursomc.domain.Cliente;
import com.johnwick.cursomc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {


}
