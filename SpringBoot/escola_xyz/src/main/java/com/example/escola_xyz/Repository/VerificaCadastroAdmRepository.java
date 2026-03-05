package com.example.escola_xyz.Repository;

import com.example.escola_xyz.Model.VerificaCadastroAdm;

import org.springframework.data.repository.CrudRepository;

public interface VerificaCadastroAdmRepository extends CrudRepository<VerificaCadastroAdm, String> {
    VerificaCadastroAdm findByCpf(String cpf);
    
}
