package org.la.student.one.jamal.service;

import java.util.List;
import java.util.Optional;

import org.la.student.one.jamal.model.Users;
import org.la.student.one.jamal.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("jamalUsersService")
public class UsersService {
	
	@Autowired
	private UsersRepository usersRepository;
	
	
	public Users findById(long id) {
		Optional<Users> optional =usersRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null ;
		
	}
	
	public List<Users> findAll(){
	return usersRepository.findAll();
	
	}
	
	public List<Users> findByFullName(String fullName){
		return usersRepository.findByFullName(fullName);
	}
	
	
	public Users create (Users users) {
		return usersRepository.save(users);
	}
	
	public Users update (Users users) {
		return usersRepository.saveAndFlush(users);
	}
	
	
}
