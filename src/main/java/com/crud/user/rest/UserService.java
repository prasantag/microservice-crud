package com.crud.user.rest;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	public UserService(UserRepository userRespository) {
		this.userRespository = userRespository;
	}

	private final UserRepository userRespository;

    public List<Users> findAll() {
        return userRespository.findAll();
    }

    public Optional<Users> findById(Long id) {
        return userRespository.findById(id);
    }

    public Users save(Users user) {
        return userRespository.save(user);
    }

    public void deleteById(Long id) {
        userRespository.deleteById(id);
    }
}
