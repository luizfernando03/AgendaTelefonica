package com.exercio.agenda.service;

import com.exercio.agenda.model.contatosModel;
import com.exercio.agenda.repository.contatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class contatosService {

    @Autowired
    private contatosRepository repository;

    public List<contatosModel> buscarTodosContatos(){
        return repository.findAll ();
    }
    public Optional <contatosModel> buscarPorId(Long codigoDoContato){
        return repository.findById (codigoDoContato);
    }
    public contatosModel cadastrar(contatosModel contatosModel){

        contatosModel.getCodigo ();
        contatosModel.getNome ();
        contatosModel.getTelefone ();
        contatosModel.getEmail ();

        return repository.save (contatosModel);
    }
    public contatosModel alterarContato(contatosModel contatosModel){

        contatosModel.getCodigo ();
        contatosModel.getNome ();
        contatosModel.getTelefone ();
        contatosModel.getEmail ();

        return repository.save (contatosModel);
    }
    public void deletar(Long codigoDoContato){
        repository.deleteById (codigoDoContato);
    }
}
