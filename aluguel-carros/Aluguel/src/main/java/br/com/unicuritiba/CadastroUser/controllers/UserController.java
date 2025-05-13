package br.com.unicuritiba.CadastroUser.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unicuritiba.CadastroUser.models.User;
import br.com.unicuritiba.CadastroUser.repositories.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository repository;
	
	@GetMapping("/clientes")
	public ResponseEntity<List<User>> getUsers(){
		return ResponseEntity.ok(repository.findAll());	
	}

	
	@PostMapping("/clientes")
	public ResponseEntity<User> saveUsers(
			@RequestBody User users){
		User userSalvo = repository.save(users);
		return ResponseEntity.ok(userSalvo);
	}
	
	
	@DeleteMapping("/clientes/{id}")
	public void removeUsers(@PathVariable long id) {
		 repository.deleteById(id);
	}
	
}
