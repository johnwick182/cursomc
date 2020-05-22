package com.johnwick.cursomc.service;
import com.johnwick.cursomc.domain.Categoria;
import com.johnwick.cursomc.domain.Cliente;
import com.johnwick.cursomc.repositories.CategoriaRepository;
import com.johnwick.cursomc.repositories.ClienteRepository;
import com.johnwick.cursomc.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente find(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }
}
