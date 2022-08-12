package com.exercio.agenda.repository;

import com.exercio.agenda.model.contatosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface contatosRepository extends JpaRepository<contatosModel, Long>{

}
