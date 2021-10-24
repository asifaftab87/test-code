package org.la.student.one.tahir.service;

import java.util.List;
import java.util.Optional;

import org.la.student.one.tahir.model.User;
import org.la.student.one.tahir.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User findById(long id) {
		Optional<User> optional = userRepository.findById(id);
		if(optional.isPresent())
			return optional.get();
		return null;
	}
	
	public List<User> findAll(){
		return userRepository.findAll();
				
			
	}
	
	public List<User> findByFirstName(String name){
		
		return userRepository.findByFirstName(name);
	}
	
	public User create(User user) {
	
		
		return userRepository.save(user);
		
	}
}
