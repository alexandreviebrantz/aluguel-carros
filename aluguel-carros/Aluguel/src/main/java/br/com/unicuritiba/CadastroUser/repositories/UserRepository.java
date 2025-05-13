package br.com.unicuritiba.CadastroUser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.CadastroUser.models.User;

public interface UserRepository 
			extends JpaRepository<User, Long>{

}
